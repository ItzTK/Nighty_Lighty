package com.itztk.nightylighty.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CeilingBlock extends HorizontalFacingBlock {
    public static final MapCodec<CeilingBlock> CODEC = createCodec(CeilingBlock::new);
    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");


    public CeilingBlock(Settings settings) {
        super(settings);
        setDefaultState(this.getDefaultState().with(CLICKED, true));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch(dir) {
            case NORTH -> Block.createCuboidShape(0.0, 5.0, 15.0, 16.0, 16.0, 16.0);

            // East (swap Z/X and invert minZ)
            case EAST -> Block.createCuboidShape(0.0, 5.0, 0.0, 1.0, 16.0, 16.0);

            // South (invert minZ/maxZ)
            case SOUTH -> Block.createCuboidShape(0.0, 5.0, 0.0, 16.0, 16.0, 1.0);

            // West (swap Z/X and invert maxZ)
            case WEST -> Block.createCuboidShape(15.0, 5.0, 0.0, 16.0, 16.0, 16.0);

            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient()) {
            world.setBlockState(pos, state.cycle(CLICKED));
        }
        return ActionResult.SUCCESS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        builder.add(CLICKED);
    }
}