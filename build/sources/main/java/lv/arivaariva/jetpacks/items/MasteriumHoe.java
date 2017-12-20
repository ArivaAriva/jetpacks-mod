package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class MasteriumHoe extends ItemHoe {

    public MasteriumHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.masteriumhoe.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.masteriumhoe.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
