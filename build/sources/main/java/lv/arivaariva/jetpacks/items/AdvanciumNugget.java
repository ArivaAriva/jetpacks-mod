package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;

public class AdvanciumNugget extends net.minecraft.item.Item {

    public AdvanciumNugget()
    {
        setUnlocalizedName(Reference.CustomItems.advanciumNugget.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.advanciumNugget.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
