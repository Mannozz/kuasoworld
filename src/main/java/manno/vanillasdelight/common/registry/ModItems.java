package manno.vanillasdelight.common.registry;

import manno.vanillasdelight.KuasoWorld;
import manno.vanillasdelight.item.GoldenKuaso;
import manno.vanillasdelight.item.KuasoBlockItem;
import manno.vanillasdelight.item.RawKuaso;
import manno.vanillasdelight.item.ToastedKuaso;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ModItems {
    public static Item.Properties basicItem() {
        return new Item.Properties().tab(KuasoWorld.KUASO_WORLD_TAB);
    }

    //物品注册器
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KuasoWorld.MODID);

    //food
    public static final RegistryObject<Item> RAW_KUASO_ITEM = ITEMS.register("raw_kuaso", RawKuaso::new);
    public static final RegistryObject<Item> TOASTED_KUASO_ITEM = ITEMS.register("toasted_kuaso", ToastedKuaso::new);
    public static final RegistryObject<Item> GOLDEN_KUASO_ITEM = ITEMS.register("golden_kuaso", GoldenKuaso::new);

    public static final RegistryObject<Item> KUASO_BLOCK_ITEM = ITEMS.register("kuaso_block_item",
            () -> new KuasoBlockItem(ModBlocks.KUASO_BLOCK.get(), basicItem()));
}
