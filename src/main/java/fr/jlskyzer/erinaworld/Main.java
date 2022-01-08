package fr.jlskyzer.erinaworld;

import fr.jlskyzer.erinaworld.proxy.CommonProxy;
import fr.jlskyzer.erinaworld.tabs.SecondTutorialTab;
import fr.jlskyzer.erinaworld.tabs.TutorialTab;
import fr.jlskyzer.erinaworld.util.Reference;

import fr.jlskyzer.erinaworld.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


// Importation des preference du mod
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	// creation de l'instance principal
	@Instance
	public static Main instance;

	public static final CreativeTabs tutorialtab = new TutorialTab("tutorialtab");
	public static final CreativeTabs secondtutorialtab = new SecondTutorialTab("secondtutorialtab");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.otherRegistries();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}


}
