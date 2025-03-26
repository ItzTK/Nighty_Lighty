package com.itztk.nightylighty.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TallBlock extends FloorBlock{
    public static final VoxelShape SHAPE = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 9.0F, 13.0F);

    public TallBlock(Settings settings) {
        super(settings);
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
