package net.allatardev.mastermindmod.item;

import net.allatardev.mastermindmod.MastermindMod;
import net.allatardev.mastermindmod.block.SportsBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SportsItems {
    //CONTENEDOR DE ITEMS PARA REGISTRAR EN EL MOD
    public static final DeferredRegister<Item> SPORTS_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MastermindMod.MODID);
    public static final DeferredRegister<Item> BLOCKS_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MastermindMod.MODID);


    //ITEMS PARA REGISTRAR EN EL MOD
    public static final RegistryObject<Item> BASKETBALL_BALL_ITEM = SPORTS_ITEMS.register(
            "basketball_ball_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOTBALL_BALL_ITEM = SPORTS_ITEMS.register(
            "football_ball_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUGBY_BALL_ITEM = SPORTS_ITEMS.register(
            "rugby_ball_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOWLING_BALL_ITEM = SPORTS_ITEMS.register(
            "bowling_ball_item",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEPS_BLOCK_ITEM = BLOCKS_ITEMS.register(
            "steps_block",
            () -> new BlockItem(SportsBlocks.STEPS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZIRCON_BLOCK_ITEM = BLOCKS_ITEMS.register(
            "zircon_block",
            () -> new BlockItem(SportsBlocks.ZIRCON_BLOCK.get(), new Item.Properties()));

}
