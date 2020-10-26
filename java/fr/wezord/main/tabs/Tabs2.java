package fr.wezord.main.tabs;

import java.util.Comparator;
import java.util.List;

import fr.wezord.main.Main;
import fr.wezord.main.init.ArmorsMod;
import fr.wezord.main.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Tabs2 extends CreativeTabs {
	
	Comparator<ItemStack> list = Main.tabSorter;
	
	public Tabs2(String label) {
		super("Pixor Armor");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ArmorsMod.armorbase);
	}
	
	
	public void displayAllReleventItems(List list)
	{
	 this.list = (Comparator<ItemStack>) list;
	}

}
