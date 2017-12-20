package lv.arivaariva.jetpacks.blocks;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockFlyum extends net.minecraft.block.Block {

    public BlockFlyum() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.CustomBlocks.flyumblock.getUnlocalizedName());
        setRegistryName(Reference.CustomBlocks.flyumblock.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
        setHardness(7.0F);
        setHarvestLevel("pickaxe", 4);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }

}
