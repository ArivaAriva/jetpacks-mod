package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class AdvanciumPickaxe extends ItemPickaxe {

    public AdvanciumPickaxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.advanciumpickaxe.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.advanciumpickaxe.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
