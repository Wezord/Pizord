package fr.wezord.main;

import java.util.Comparator;

import org.apache.logging.log4j.Logger;

import fr.wezord.main.init.ArmorsMod;
import fr.wezord.main.init.BlocksMod;
import fr.wezord.main.init.ItemsMod;
import fr.wezord.main.proxy.CommonProxy;
import fr.wezord.main.tabs.Tabs1;
import fr.wezord.main.tabs.Tabs2;
import fr.wezord.main.util.handler.RegistryHandler;
import fr.wezord.main.util.handler.SoundHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MINECRAFT_VERSION)
public class Main {
	
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY, modId = References.MODID)
	public static CommonProxy proxy; 
	
	public static final CreativeTabs ct = new Tabs1("pixor");
	public static final CreativeTabs cta = new Tabs2("Pixor Armor");
	public static Comparator<ItemStack> tabSorter;
	public static Logger logger;
	
	@Instance
	public static Main instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		logger = e.getModLog();
        proxy.preInit(e.getSuggestedConfigurationFile());
		ItemsMod.init();
		BlocksMod.init();
		ArmorsMod.init();
		
		RegistryHandler.initRegistries();
	    RegistryHandler.registryEntitiesRender();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent e) {
		
		proxy.init();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
