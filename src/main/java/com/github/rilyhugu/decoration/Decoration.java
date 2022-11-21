package com.github.rilyhugu.decoration;

import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = Decoration.MOD_ID,
        name = Decoration.MOD_NAME,
        version = Decoration.VERSION
)
public class Decoration {

    public static final String MOD_ID = "decoration";
    public static final String MOD_NAME = "Decoration";
    public static final String VERSION = "1.0-snapshot";

    @Mod.Instance(MOD_ID)
    public static Decoration INSTANCE;
}
