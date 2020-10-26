package fr.wezord.main.item;

import fr.wezord.main.Main;
import fr.wezord.main.init.NItemType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorModExtra extends Item {

	public NItemType armorType;

	public ArmorModExtra(String name, NItemType armorType) {
		this.armorType = armorType;
		setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.cta);
	}

}
