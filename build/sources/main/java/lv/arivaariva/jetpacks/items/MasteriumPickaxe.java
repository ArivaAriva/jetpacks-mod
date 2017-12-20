package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class MasteriumPickaxe extends ItemPickaxe {

    public MasteriumPickaxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.masteriumpickaxe.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.masteriumpickaxe.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
