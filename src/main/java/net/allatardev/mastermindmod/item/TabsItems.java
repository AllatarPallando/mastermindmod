package net.allatardev.mastermindmod.item;

import net.allatardev.mastermindmod.MastermindMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TabsItems {
    //CONTENEDOR DE ITEMS PARA REGISTRAR EN EL MOD
    public static final DeferredRegister<Item> TABS_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MastermindMod.MODID);

    //ITEMS PARA REGISTRAR EN EL MOD
    public static final RegistryObject<Item> MINERALS_TAB_ITEM = TABS_ITEMS.register(
            "minerals_tab_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPORTS_TAB_ITEM = TABS_ITEMS.register(
            "sports_tab_item",
            () -> new Item(new Item.Properties()));
}
