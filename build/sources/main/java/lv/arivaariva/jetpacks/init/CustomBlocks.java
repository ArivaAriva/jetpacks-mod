package lv.arivaariva.jetpacks.init;

import lv.arivaariva.jetpacks.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomBlocks {

    public static Block flyumOre;
    public static Block advanciumOre;
    public static Block masteriumOre;
    public static Block flyumBlock;
    public static Block advanciumBlock;
    public static Block masteriumBlock;

    public static void init() {
        flyumOre = new BlockFlyiumOre();
        advanciumOre = new BlockAdvanciumOre();
        masteriumOre = new BlockMasteriumOre();
        flyumBlock = new BlockFlyum();
        advanciumBlock = new BlockAdvancium();
        masteriumBlock = new BlockMasterium();
    }

    public static void register() {
        registerBlock(flyumOre);
        registerBlock(advanciumOre);
        registerBlock(masteriumOre);
        registerBlock(flyumBlock);
        registerBlock(advanciumBlock);
        registerBlock(masteriumBlock);
    }

    private static void registerBlock(Block block)
    {
        GameRegistry.findRegistry(Block.class).register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.findRegistry(Item.class).register(item);
    }

    public static void registerRenders() {
        registerRender(flyumOre);
        registerRender(advanciumOre);
        registerRender(masteriumOre);
        registerRender(flyumBlock);
        registerRender(advanciumBlock);
        registerRender(masteriumBlock);
    }

    private static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0,new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
