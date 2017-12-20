package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;

public class MasteriumIngot extends net.minecraft.item.Item {

    public MasteriumIngot()
    {
        setUnlocalizedName(Reference.CustomItems.masteriumingot.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.masteriumingot.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
