package fr.wezord.main.tabs;

import java.util.Comparator;
import java.util.List;

import fr.wezord.main.Main;
import fr.wezord.main.init.ItemsMod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Tabs1 extends CreativeTabs {
	
	Comparator<ItemStack> list = Main.tabSorter;
	
	public Tabs1(String label) {
		super("pixor");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemsMod.pfee);
	}
	
	
	public void displayAllReleventItems(List list)
	{
	 this.list = (Comparator<ItemStack>) list;
	}

}
