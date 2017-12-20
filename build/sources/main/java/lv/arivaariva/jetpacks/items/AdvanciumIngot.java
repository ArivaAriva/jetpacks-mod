package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;

public class AdvanciumIngot extends net.minecraft.item.Item {

    public AdvanciumIngot()
    {
        setUnlocalizedName(Reference.CustomItems.advanciumingot.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.advanciumingot.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
