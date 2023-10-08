package net.allatardev.mastermindmod.tab;

import net.allatardev.mastermindmod.MastermindMod;
import net.allatardev.mastermindmod.item.SportsItems;
import net.allatardev.mastermindmod.item.TabsItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = "mastermindmod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SportsTab {
    @SubscribeEvent
    public static void buildContents(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(MastermindMod.MODID,
                "sports_tab"),
                builder ->
                    // Set name of tab to display
                    builder
                       .title(Component.translatable("item_group." + MastermindMod.MODID + ".sports_tab"))
                            // Set icon of creative tab
                       .icon(() -> new ItemStack(TabsItems.SPORTS_TAB_ITEM.get()))
                            // Add default items to tab
                       .displayItems((params, output, display) -> {
                           for (RegistryObject<Item> item:SportsItems.SPORTS_ITEMS.getEntries()){
                               output.accept(item.get());
                           }
                       })
        );
    }
}
