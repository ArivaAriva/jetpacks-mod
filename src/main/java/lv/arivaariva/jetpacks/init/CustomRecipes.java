package lv.arivaariva.jetpacks.init;

import lv.arivaariva.jetpacks.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomRecipes {

    public static void registerRecipes() {
        GameRegistry.addSmelting(CustomBlocks.flyumOre, new ItemStack(CustomItems.flyumIngot), 4);
        GameRegistry.addSmelting(CustomBlocks.advanciumOre, new ItemStack(CustomItems.advanciumIngot), 8);
        GameRegistry.addSmelting(CustomBlocks.masteriumOre, new ItemStack(CustomItems.masteriumIngot), 60);
    }
}
