package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class AdvanciumAxe extends ItemAxe {

    public AdvanciumAxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.advanciumaxe.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.advanciumaxe.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
