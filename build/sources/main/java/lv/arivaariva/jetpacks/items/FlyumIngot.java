package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.Item;

public class FlyumIngot extends Item {

    public FlyumIngot()
    {
        setUnlocalizedName(Reference.CustomItems.flyumingot.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.flyumingot.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
