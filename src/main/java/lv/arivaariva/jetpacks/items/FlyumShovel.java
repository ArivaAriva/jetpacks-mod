package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class FlyumShovel extends ItemSpade {

    public FlyumShovel(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.flyumshovel.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.flyumshovel.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
