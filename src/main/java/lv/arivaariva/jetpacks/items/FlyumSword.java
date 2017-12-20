package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemSword;

public class FlyumSword extends ItemSword {

    public FlyumSword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(Reference.CustomItems.flyumsword.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.flyumsword.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
