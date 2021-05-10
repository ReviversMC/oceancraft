package com.github.nebelnidas.oceancraft.feature;

import java.util.Random;

import com.github.nebelnidas.oceancraft.blocks.CoralBlock;
import com.mojang.serialization.Codec;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.Heightmap;

public class CoralFeature extends Feature<ProbabilityConfig> {
	private CoralBlock coralBlock;

	public <T extends CoralBlock> CoralFeature(Codec<ProbabilityConfig> configCodec, T coralBlock) {
		super(configCodec);
		this.coralBlock = coralBlock;
	}

	@Override
	public boolean generate(StructureWorldAccess structureWorldAccess, ChunkGenerator chunkGenerator, Random random, BlockPos blockPos, ProbabilityConfig probabilityConfig) {
		int i = 0;
		int topY = structureWorldAccess.getTopY(Heightmap.Type.OCEAN_FLOOR, blockPos.getX(), blockPos.getZ());
		BlockPos blockPosTopY = new BlockPos(blockPos.getX(), topY, blockPos.getZ());
		if (structureWorldAccess.getBlockState(blockPosTopY).isOf(Blocks.WATER)) {
			BlockState coralBlockState = coralBlock.getDefaultState();

			if (structureWorldAccess.getBlockState(blockPosTopY.up()).isOf(Blocks.WATER)
					&& coralBlockState.canPlaceAt(structureWorldAccess, blockPosTopY)) {
					structureWorldAccess.setBlockState(blockPosTopY, coralBlockState, 2);
					++i;
			}
		}

		return i > 0;
	}

}
