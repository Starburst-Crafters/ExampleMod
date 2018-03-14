package proxy.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabExample extends CreativeTabs {

    public CreativeTabExample(int index,String label) {
        super(index,label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.EMERALD);
    }
}
