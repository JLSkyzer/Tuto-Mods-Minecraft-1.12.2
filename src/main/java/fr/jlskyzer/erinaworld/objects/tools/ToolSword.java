package fr.jlskyzer.erinaworld.objects.tools;

import fr.jlskyzer.erinaworld.Main;
import fr.jlskyzer.erinaworld.init.ItemInit;
import fr.jlskyzer.erinaworld.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

    public ToolSword(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tutorialtab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        // Creation de la methode de creation d'item
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
