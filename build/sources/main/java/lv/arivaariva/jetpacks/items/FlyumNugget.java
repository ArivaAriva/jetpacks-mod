package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;

public class FlyumNugget extends net.minecraft.item.Item {

    public FlyumNugget()
    {
        setUnlocalizedName(Reference.CustomItems.flyumNugget.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.flyumNugget.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
