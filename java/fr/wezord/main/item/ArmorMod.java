package fr.wezord.main.item;

import fr.wezord.main.Main;
import fr.wezord.main.References;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorMod extends ItemArmor {

	public ArmorMod(String name, ArmorMaterial armor, int i, EntityEquipmentSlot chest) {
		super(armor, i, chest);
		
		setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.cta);
		
	}

}
