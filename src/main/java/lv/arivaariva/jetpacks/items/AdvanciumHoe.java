package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class AdvanciumHoe extends ItemHoe {

    public AdvanciumHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.advanciumhoe.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.advanciumhoe.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
