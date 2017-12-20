package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class MasteriumAxe extends ItemAxe {

    public MasteriumAxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.masteriumaxe.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.masteriumaxe.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
