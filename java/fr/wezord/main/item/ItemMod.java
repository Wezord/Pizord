package fr.wezord.main.item;

import fr.wezord.main.Main;
import net.minecraft.item.Item;

public class ItemMod extends Item{
	
	public ItemMod(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ct);
	}

}
