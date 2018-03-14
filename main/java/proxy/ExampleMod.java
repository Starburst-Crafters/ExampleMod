package proxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import proxy.tab.CreativeTabExample;


@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Example Mod";

    @SidedProxy(clientSide = "proxy.ClientProxy", serverSide = "proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ExampleMod instence;

    public static CreativeTabExample tabExample;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabExample = new CreativeTabExample(CreativeTabs.getNextID(),"tab_example");
        proxy.preInit(event);

    }
    @EventHandler
    public void init(FMLInitializationEvent event){

        proxy.Init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

        proxy.postInit(event);
    }
}




