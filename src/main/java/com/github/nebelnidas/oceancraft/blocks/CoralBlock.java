package com.github.nebelnidas.oceancraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CoralParentBlock;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CoralBlock extends CoralParentBlock {
	protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 15.0D, 14.0D);

	public CoralBlock(MaterialColor materialColor) {
		super(FabricBlockSettings.copy(Blocks.TUBE_CORAL).of(Material.UNDERWATER_PLANT, materialColor).nonOpaque());
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}
}
