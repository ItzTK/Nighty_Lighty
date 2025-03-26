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
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class FloorBlock extends HorizontalFacingBlock {
    public static final MapCodec<FloorBlock> CODEC = createCodec(FloorBlock::new);
    public static final VoxelShape SHAPE = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 6.0F, 13.0F);
    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");

    public static final IntProperty ROTATION = Properties.ROTATION;

    public FloorBlock(Settings settings) {
        super(settings);
        setDefaultState(this.getDefaultState().with(ROTATION, 0));
        setDefaultState(this.getDefaultState().with(CLICKED, false));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        // Preserve the original rotation math
        float yaw = ctx.getPlayerYaw();
        int rotation = MathHelper.floor((180.0F + yaw) * 16.0F / 360.0F + 0.5F) & 15;
        return this.getDefaultState().with(ROTATION, rotation);
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
        builder.add(ROTATION);
        builder.add(CLICKED);
    }
}
