package com.xanplayz.randommod.blocks;

import com.xanplayz.randommod.Init.BlockInit;
import com.xanplayz.randommod.util.IHasModel;

import com.xanplayz.randommod.Init.ItemInit;
import com.xanplayz.randommod.util.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class wutblock extends Block implements IHasModel {

    public wutblock(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(3f);
        setHarvestLevel("pickaxe", 1);




        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}


