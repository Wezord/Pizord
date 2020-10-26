package fr.wezord.main.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockPortal extends BlockBasic {

	public BlockPortal(String name, Material material) {
		super(name, Material.ROCK);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return true;
	}

}
