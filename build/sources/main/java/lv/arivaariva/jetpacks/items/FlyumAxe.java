package lv.arivaariva.jetpacks.items;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class FlyumAxe extends ItemAxe {

    public FlyumAxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.CustomItems.flyumaxe.getUnlocalizedName());
        setRegistryName(Reference.CustomItems.flyumaxe.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
    }
}
