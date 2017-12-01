package com.xanplayz.randommod.Init;

import com.xanplayz.randommod.blocks.wutblock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_COPPER = new wutblock("block_wut", Material.IRON);

}
