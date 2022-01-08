package fr.jlskyzer.erinaworld.tabs;

import fr.jlskyzer.erinaworld.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SecondTutorialTab extends CreativeTabs {
    public SecondTutorialTab(String label) {
        super("secondtutorialtab");
        this.setBackgroundImageName("tutorial.png");
    }
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.TUTORIAL_INGOT);
//        return new ItemStack(Item.getItemFromBlock(BlockInit.ORE_COPPER));
    }
}
