package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class AdvanciumShovel extends ItemSpade {

    public AdvanciumShovel(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.advanciumshovel.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.advanciumshovel.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
