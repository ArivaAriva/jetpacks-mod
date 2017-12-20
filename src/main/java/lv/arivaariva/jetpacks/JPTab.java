package lv.arivaariva.jetpacks;

import com.google.common.collect.Ordering;
import lv.arivaariva.jetpacks.init.CustomItems;
import lv.arivaariva.jetpacks.init.CustomBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import scala.actors.threadpool.Arrays;

import java.util.Comparator;
import java.util.List;

public class JPTab extends CreativeTabs {

    public JPTab() {
        super("tabJP");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(CustomItems.masteriumIngot);
    }

}
