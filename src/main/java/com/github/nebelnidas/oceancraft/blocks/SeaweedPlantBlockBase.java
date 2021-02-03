package com.github.nebelnidas.oceancraft.blocks;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidFillable;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;


public class SeaweedPlantBlockBase extends AbstractPlantStemBlock implements FluidFillable {
	public SeaweedPlantBlockBase(VoxelShape bounds) {
		super(FabricBlockSettings.copy(Blocks.KELP).nonOpaque(), Direction.UP, bounds, true, 0.14D);
	}

	protected boolean chooseStemState(BlockState state) {
		return state.isOf(Blocks.WATER);
	}

	protected Block getPlant() {
		return this.asBlock();
	}

	protected boolean canAttachTo(Block block) {
		return block != Blocks.MAGMA_BLOCK;
	}

	public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
		return false;
	}

	public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
		return false;
	}

	protected int method_26376(Random random) {
		return 1;
	}

	@Nullable
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
		Block topBlock = ctx.getWorld().getBlockState(ctx.getBlockPos().up(1)).getBlock();
		return fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8 && topBlock == Blocks.WATER ? super.getPlacementState(ctx) : null;
	}

	public FluidState getFluidState(BlockState state) {
	   return Fluids.WATER.getStill(false);
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		Block topBlock = world.getBlockState(pos.up(2)).getBlock();
		if (topBlock == Blocks.WATER) {
			super.randomTick(state, world, pos, random);
		}
	}

	public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
		Block topBlock = world.getBlockState(pos.up(2)).getBlock();
		if (topBlock == Blocks.WATER) {
			super.grow(world, random, pos, state);;
		}
	}
}
