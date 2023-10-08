package net.allatardev.mastermindmod.tab;

import net.allatardev.mastermindmod.MastermindMod;
import net.allatardev.mastermindmod.item.SportsItems;
import net.allatardev.mastermindmod.item.TabsItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "mastermindmod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineralsTab {
    @SubscribeEvent
    public static void buildContents(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(MastermindMod.MODID,
                "minerals_tab"),
                builder ->
                    // Set name of tab to display
                    builder
                       .title(Component.translatable("item_group." + MastermindMod.MODID + ".minerals_tab"))
                            // Set icon of creative tab
                       .icon(() -> new ItemStack(SportsItems.ZIRCON_BLOCK_ITEM.get()))
                            // Add default items to tab
                       .displayItems((params, output, display) -> {
                           output.accept(SportsItems.ZIRCON_BLOCK_ITEM.get());
                       })
        );
    }
}
