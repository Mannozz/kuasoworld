package manno.vanillasdelight;

import com.mojang.logging.LogUtils;
import manno.vanillasdelight.common.CommonSetup;
import manno.vanillasdelight.common.registry.KuasoEffects;
import manno.vanillasdelight.common.registry.ModBlocks;
import manno.vanillasdelight.common.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import javax.annotation.Nonnull;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(KuasoWorld.MODID)
public class KuasoWorld {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "vanillasdelight";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab KUASO_WORLD_TAB = new CreativeModeTab(KuasoWorld.MODID) {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TOASTED_KUASO_ITEM.get());
        }
    };

    public KuasoWorld() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(CommonSetup::init);

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        KuasoEffects.EFFECTS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
