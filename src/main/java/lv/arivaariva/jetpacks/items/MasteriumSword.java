package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemSword;

public class MasteriumSword extends ItemSword {

    public MasteriumSword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(Reference.CustomItems.masteriumsword.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.masteriumsword.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
