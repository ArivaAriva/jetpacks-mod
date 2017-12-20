package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class FlyumHoe extends ItemHoe {

    public FlyumHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.flyumhoe.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.flyumhoe.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
