package lv.arivaariva.jetpacks.init;

import lv.arivaariva.jetpacks.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomItems {

    public static Item flyumIngot;
    public static Item advanciumIngot;
    public static Item masteriumIngot;
    public static Item flyumNugget;
    public static Item advanciumNugget;
    public static Item masteriumNugget;
    public static Item flyumPickaxe;
    public static Item flyumShovel;
    public static Item flyumAxe;
    public static Item flyumHoe;
    public static Item flyumSword;
    public static Item advanciumPickaxe;
    public static Item advanciumShovel;
    public static Item advanciumAxe;
    public static Item advanciumHoe;
    public static Item advanciumSword;
    public static Item masteriumPickaxe;
    public static Item masteriumShovel;
    public static Item masteriumAxe;
    public static Item masteriumHoe;
    public static Item masteriumSword;
    private static Item.ToolMaterial flyumToolMat = EnumHelper.addToolMaterial("flyumToolMaterial",4,9999,12.5F,4.0F,30);
    private static Item.ToolMaterial flyumSwordMat = EnumHelper.addToolMaterial("flyumSwordMaterial", 4, 9999, 5.0F, 9.0F, 30);
    private static Item.ToolMaterial advanciumToolMat = EnumHelper.addToolMaterial("advanciumToolMaterial",5,9999,16.5F,8.0F,30);
    private static Item.ToolMaterial advanciumSwordMat = EnumHelper.addToolMaterial("advanciumSwordMaterial", 5, 9999, 10.0F, 9.0F, 30);
    private static Item.ToolMaterial masteriumToolMat = EnumHelper.addToolMaterial("masteriumToolMaterial",6,9999,24.5F,14.0F,30);
    private static Item.ToolMaterial masteriumSwordMat = EnumHelper.addToolMaterial("masteriumSwordMaterial", 6, 9999, 15.0F, 9.0F, 30);

    //private List<Item> items = java.util.Arrays.asList{ CustomItems.flyumSword,CustomItems.flyumPickaxe,CustomItems.flyumShovel,CustomItems.flyumAxe,CustomItems.flyumHoe,CustomItems.advanciumSword,CustomItems.advanciumPickaxe,CustomItems.advanciumShovel,CustomItems.advanciumAxe,CustomItems.advanciumHoe,CustomItems.masteriumSword,CustomItems.masteriumPickaxe,CustomItems.masteriumShovel,CustomItems.masteriumAxe,CustomItems.masteriumHoe,advanciumIngot, masteriumIngot,CustomItems.flyumNugget,CustomItems.advanciumNugget,CustomItems.masteriumNugget };
    private  static List<Item> items = Arrays.asList(new Item[] {CustomItems.flyumSword,CustomItems.flyumPickaxe,CustomItems.flyumShovel,CustomItems.flyumAxe,CustomItems.flyumHoe,CustomItems.advanciumSword,CustomItems.advanciumPickaxe,CustomItems.advanciumShovel,CustomItems.advanciumAxe,CustomItems.advanciumHoe,CustomItems.masteriumSword,CustomItems.masteriumPickaxe,CustomItems.masteriumShovel,CustomItems.masteriumAxe,CustomItems.masteriumHoe,advanciumIngot, masteriumIngot,CustomItems.flyumNugget,CustomItems.advanciumNugget,CustomItems.masteriumNugget});

    public static void init() {
        flyumIngot = new FlyumIngot();
        advanciumIngot = new AdvanciumIngot();
        masteriumIngot = new MasteriumIngot();
        flyumNugget = new FlyumNugget();
        advanciumNugget = new AdvanciumNugget();
        masteriumNugget = new MasteriumNugget();
        flyumSword = new FlyumSword(flyumSwordMat);
        advanciumSword = new AdvanciumSword(advanciumSwordMat);
        masteriumSword = new MasteriumSword(masteriumSwordMat);
        flyumPickaxe = new FlyumPickaxe(flyumToolMat);
        advanciumPickaxe = new AdvanciumPickaxe(advanciumToolMat);
        masteriumPickaxe = new MasteriumPickaxe(masteriumToolMat);
        flyumShovel = new FlyumShovel(flyumToolMat);
        advanciumShovel = new AdvanciumShovel(advanciumToolMat);
        masteriumShovel = new MasteriumShovel(masteriumToolMat);
        flyumAxe = new FlyumAxe(Item.ToolMaterial.DIAMOND);
        advanciumAxe = new AdvanciumAxe(Item.ToolMaterial.DIAMOND);
        masteriumAxe = new MasteriumAxe(Item.ToolMaterial.DIAMOND);
        flyumHoe = new FlyumHoe(flyumToolMat);
        advanciumHoe = new AdvanciumHoe(advanciumToolMat);
        masteriumHoe = new MasteriumHoe(masteriumToolMat);
    }

    public static void register()
    {
        GameRegistry.findRegistry(Item.class).registerAll(CustomItems.flyumSword,CustomItems.flyumPickaxe,CustomItems.flyumShovel,CustomItems.flyumAxe,CustomItems.flyumHoe,CustomItems.advanciumSword,CustomItems.advanciumPickaxe,CustomItems.advanciumShovel,CustomItems.advanciumAxe,CustomItems.advanciumHoe,CustomItems.masteriumSword,CustomItems.masteriumPickaxe,CustomItems.masteriumShovel,CustomItems.masteriumAxe,CustomItems.masteriumHoe,flyumIngot, advanciumIngot, masteriumIngot,CustomItems.flyumNugget,CustomItems.advanciumNugget,CustomItems.masteriumNugget);
    }

    public static void registerRenders() {

        registerRender(flyumIngot);
        registerRender(advanciumIngot);
        registerRender(masteriumIngot);
        registerRender(flyumNugget);
        registerRender(advanciumNugget);
        registerRender(masteriumNugget);
        registerRender(flyumAxe);
        registerRender(flyumPickaxe);
        registerRender(flyumShovel);
        registerRender(flyumHoe);
        registerRender(flyumSword);
        registerRender(advanciumAxe);
        registerRender(advanciumPickaxe);
        registerRender(advanciumShovel);
        registerRender(advanciumHoe);
        registerRender(advanciumSword);
        registerRender(masteriumPickaxe);
        registerRender(masteriumShovel);
        registerRender(masteriumHoe);
        registerRender(masteriumSword);
        registerRender(masteriumAxe);
    }

    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
