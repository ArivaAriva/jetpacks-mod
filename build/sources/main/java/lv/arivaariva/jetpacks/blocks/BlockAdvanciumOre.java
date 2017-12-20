package lv.arivaariva.jetpacks.blocks;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import lv.arivaariva.jetpacks.init.CustomItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockAdvanciumOre extends net.minecraft.block.Block {
    public BlockAdvanciumOre() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.CustomBlocks.advanciumore.getUnlocalizedName());
        setRegistryName(Reference.CustomBlocks.advanciumore.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
        setHardness(6.0F);
        setHarvestLevel("pickaxe", 4);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
}
