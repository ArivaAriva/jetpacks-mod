package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;

public class MasteriumNugget extends net.minecraft.item.Item {

    public MasteriumNugget()
    {
        setUnlocalizedName(Reference.CustomItems.masteriumNugget.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.masteriumNugget.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
