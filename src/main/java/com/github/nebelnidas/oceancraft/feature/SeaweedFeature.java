package com.github.nebelnidas.oceancraft.feature;

import java.util.Random;
import com.github.nebelnidas.oceancraft.blocks.SeaweedPlantBlockBase;

import com.mojang.serialization.Codec;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.Heightmap;

public class SeaweedFeature extends Feature<DefaultFeatureConfig> {
	private Object seaweedBlock;

	public <T extends SeaweedPlantBlockBase> SeaweedFeature(Codec<DefaultFeatureConfig> configCodec, T seaweedBlock) {
		super(configCodec);
		this.seaweedBlock = seaweedBlock;
	}

	@Override
	public boolean generate(StructureWorldAccess structureWorldAccess, ChunkGenerator chunkGenerator, Random random, BlockPos blockPos, DefaultFeatureConfig defaultFeatureConfig) {
		int i = 0;
		int topY = structureWorldAccess.getTopY(Heightmap.Type.OCEAN_FLOOR, blockPos.getX(), blockPos.getZ());
		BlockPos blockPosTopY = new BlockPos(blockPos.getX(), topY, blockPos.getZ());
		if (structureWorldAccess.getBlockState(blockPosTopY).isOf(Blocks.WATER)) {
			BlockState seaweedBlockState = ((SeaweedPlantBlockBase) seaweedBlock).getDefaultState();
			int k = random.nextInt(4);

			for (int l = 0; l <= k; ++l) {
				if (structureWorldAccess.getBlockState(blockPosTopY.up()).isOf(Blocks.WATER)
						&& seaweedBlockState.canPlaceAt(structureWorldAccess, blockPosTopY)) {
					if (l == k) {
						structureWorldAccess.setBlockState(blockPosTopY, (BlockState) seaweedBlockState.with(((SeaweedPlantBlockBase) seaweedBlock).AGE, random.nextInt(4) + 20), 2);
						++i;
					} else {
						structureWorldAccess.setBlockState(blockPosTopY, seaweedBlockState, 2);
					}
				}

				blockPosTopY = blockPosTopY.up();
			}
		}

		return i > 0;
	}

}
