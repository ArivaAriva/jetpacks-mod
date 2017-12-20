package lv.arivaariva.jetpacks;

import com.google.common.collect.Ordering;
import com.google.gson.JsonObject;
import lv.arivaariva.jetpacks.init.CustomBlocks;
import lv.arivaariva.jetpacks.init.CustomItems;
import lv.arivaariva.jetpacks.init.CustomRecipes;
import lv.arivaariva.jetpacks.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.*;

import static lv.arivaariva.jetpacks.init.CustomBlocks.*;
import static lv.arivaariva.jetpacks.init.CustomItems.*;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, useMetadata = true)
public class Jetpacks {
    public static Jetpacks instance;
    private static Comparator<ItemStack> tabSorter;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;


    public static void addRecipe(String recipeName)
    {
        CraftingHelper.register(new ResourceLocation(Reference.MOD_ID + ":" + recipeName + ".json"), new IRecipeFactory() {
            @Override
            public IRecipe parse(JsonContext context, JsonObject json) {
                return CraftingHelper.getRecipe(json, context);
            }
        });
    }

    public static final CreativeTabs CREATIVE_TAB = new JPTab() {
        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> items) {
            super.displayAllRelevantItems(items);
            items.sort(tabSorter);
        }
    };


    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        System.out.println("Pre Init");
        CustomItems.init();
        CustomItems.register();

        CustomBlocks.init();
        CustomBlocks.register();
        CustomRecipes.registerRecipes();
        List<net.minecraft.item.Item> order = java.util.Arrays.asList(new Item[]{CustomItems.flyumSword,CustomItems.flyumPickaxe,CustomItems.flyumShovel,CustomItems.flyumAxe,CustomItems.flyumHoe,CustomItems.advanciumSword,CustomItems.advanciumPickaxe,CustomItems.advanciumShovel,CustomItems.advanciumAxe,CustomItems.advanciumHoe,CustomItems.masteriumSword,CustomItems.masteriumPickaxe,CustomItems.masteriumShovel,CustomItems.masteriumAxe,CustomItems.masteriumHoe,Item.getItemFromBlock(CustomBlocks.flyumBlock),Item.getItemFromBlock(CustomBlocks.advanciumBlock),Item.getItemFromBlock(CustomBlocks.masteriumBlock),Item.getItemFromBlock(flyumOre),Item.getItemFromBlock(CustomBlocks.advanciumOre),Item.getItemFromBlock(CustomBlocks.masteriumOre), flyumIngot, advanciumIngot, masteriumIngot,CustomItems.flyumNugget,CustomItems.advanciumNugget,CustomItems.masteriumNugget});
        tabSorter = Ordering.explicit(order).onResultOf(ItemStack::getItem);
    }


    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        System.out.println("Init");
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        System.out.println("Post Init");
    }

}
