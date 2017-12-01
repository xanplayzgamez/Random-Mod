package com.xanplayz.randommod.util;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
public class Main {

    @SidedProxy(clientSide = Main.CLIENT, serverSide = Main.COMMON)
    public static CommonProxy proxy;
    public static final String MODID = "randommod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Random Mod";
    public static final String CLIENT = "com.xanplayz.randommod.util.ClientProxy";
    public static final String COMMON = "com.xanplayz.randommod.util.CommonProxy";
}
