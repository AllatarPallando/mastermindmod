package net.allatardev.mastermindmod;

import com.mojang.logging.LogUtils;
import net.allatardev.mastermindmod.block.SportsBlocks;
import net.allatardev.mastermindmod.item.SportsItems;
import net.allatardev.mastermindmod.item.TabsItems;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MastermindMod.MODID)
public class MastermindMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "mastermindmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public MastermindMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        //REGISTRAMOS EL CONTENEDOR DE ITEMS PARA QUE SEA VISIBLE
        SportsItems.SPORTS_ITEMS.register(modEventBus);
        //REGISTRAMOS EL CONTENEDOR DE TABS PARA QUE SEA VISIBLE
        TabsItems.TABS_ITEMS.register(modEventBus);

        //REGISTRAMOS EL CONTENEDOR DE ITEMS DE BLOQUES PARA QUE SEA VISIBLE
        SportsItems.BLOCKS_ITEMS.register(modEventBus);
        //REGISTRAMOS EL CONTENEDOR DE BLOQUES DEPORTES PARA QUE SEA VISIBLE
        SportsBlocks.SPORTS_BLOCKS.register(modEventBus);
        //REGISTRAMOS EL CONTENEDOR DE BLOQUES MINERALES PARA QUE SEA VISIBLE
        SportsBlocks.MINERALS_BLOCKS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("MASTERMINDMOD - Mensaje de inicio");
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        /*
        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
        }
        */
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
