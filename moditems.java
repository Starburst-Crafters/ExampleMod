package proxy.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import proxy.ExampleMod;

public class moditems {

    public static Item exampleItem;


    public static void preInit() {

        exampleItem = new Item().setUnlocalizedName("example_item").setCreativeTab(ExampleMod.tabExample);

        registerItems();

    }

    public static void registerItems() {
        GameRegistry.register(exampleItem,new ResourceLocation(ExampleMod.MODID,"example_item"));
    }

    public static void registerRenders(){
        registerRender(exampleItem);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ExampleMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
}
