package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class FlyumPickaxe extends ItemPickaxe {

    public FlyumPickaxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.flyumpickaxe.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.flyumpickaxe.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }

}
