package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class MasteriumShovel extends ItemSpade {

    public MasteriumShovel(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.masteriumshovel.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.masteriumshovel.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
