package net.allatardev.mastermindmod.block;

import net.allatardev.mastermindmod.MastermindMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SportsBlocks {
    // CONTENEDOR DE BLOQUES A REGISTRAR EN EL MOD
    public static final DeferredRegister<Block> SPORTS_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MastermindMod.MODID);
    public static final DeferredRegister<Block> MINERALS_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MastermindMod.MODID);

    //BLOQUES A REGISTRAR EN EL MOD
    public static final RegistryObject<Block> STEPS_BLOCK =
            SPORTS_BLOCKS.register("steps_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f)));
    public static final RegistryObject<Block> ZIRCON_BLOCK =
            MINERALS_BLOCKS.register("zircon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f)));

}
