package fr.wezord.main.item;

import javax.annotation.Nullable;

import fr.wezord.main.Main;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class ShieldMod extends ItemShield{
	
	public ShieldMod(String name) {
        this.canRepair = true;
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Main.cta);
        this.addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter() {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack p_apply_1_, @Nullable World p_apply_2_, @Nullable EntityLivingBase p_apply_3_) {
                return p_apply_3_ != null && p_apply_3_.isHandActive() && p_apply_3_.getActiveItemStack() == p_apply_1_ ? 1.0F : 0.0F;
            }
        });
	}
		
}

