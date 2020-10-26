package fr.wezord.main.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fr.wezord.main.References;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModConfig {
	
	private static Configuration config;
	 
    public static Configuration getConfig()
    {
        return config;
    }
    
    public static void preInit(FMLPreInitializationEvent e)
    {
    	File configFile = new File(Loader.instance().getConfigDir(), "ConfigPizord.cfg");
        config = new Configuration(configFile);
        config.load();
 
        syncConfig();
    }
    
    public static void syncConfig()
    {

 
        if(config.hasChanged())
        {
            config.save();
        }
    }
    
    public static void onConfigChanged(OnConfigChangedEvent e)
    {
        if(e.getModID().equals(References.MODID))
        {
            syncConfig();
        }
    }
}
