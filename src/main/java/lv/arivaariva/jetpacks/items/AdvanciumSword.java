package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemSword;

public class AdvanciumSword extends ItemSword {

    public AdvanciumSword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(Reference.CustomItems.advanciumsword.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.advanciumsword.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
