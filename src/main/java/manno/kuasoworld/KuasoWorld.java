package manno.kuasoworld;

import manno.kuasoworld.common.registry.ModBlocks;
import manno.kuasoworld.common.registry.ModItems;
import manno.kuasoworld.item.GoldenKuaso;
import manno.kuasoworld.item.RawKuaso;
import manno.kuasoworld.item.ToastedKuaso;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.CreativeModeTab;
import org.slf4j.Logger;

import javax.annotation.Nonnull;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(KuasoWorld.MODID)
public class KuasoWorld {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "kuasoworld";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(KuasoWorld.MODID) {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TOASTED_KUASO_ITEM.get());
        }
    };

    public KuasoWorld() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
//        modEventBus.addListener(CommonSetup::init);

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
