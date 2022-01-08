package fr.jlskyzer.erinaworld.objects.items;

import fr.jlskyzer.erinaworld.Main;
import fr.jlskyzer.erinaworld.init.ItemInit;
import fr.jlskyzer.erinaworld.util.IHasModel;
import net.minecraft.item.Item;

public class secondItemBase extends Item implements IHasModel {

    public secondItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(/*CreativeTabs.MATERIALS*/ Main.secondtutorialtab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        // Creation de la methode de creation d'item
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
