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

public class BlockFlyiumOre extends Block {

    public BlockFlyiumOre()
    {
        super(Material.ROCK);
        setUnlocalizedName(Reference.CustomBlocks.flyumore.getUnlocalizedName());
        setRegistryName(Reference.CustomBlocks.flyumore.getRegistryName());
        setCreativeTab(Jetpacks.CREATIVE_TAB);
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
}
