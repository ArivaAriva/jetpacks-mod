package lv.arivaariva.jetpacks.blocks;

import lv.arivaariva.jetpacks.Jetpacks;
import lv.arivaariva.jetpacks.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMasterium extends Block {

    public BlockMasterium() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.CustomBlocks.masteriumblock.getUnlocalizedName());
        setRegistryName(Reference.CustomBlocks.masteriumblock.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
        setHardness(16.0F);
        setHarvestLevel("pickaxe", 6);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
}
