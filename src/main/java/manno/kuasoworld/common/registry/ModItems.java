package manno.kuasoworld.common.registry;

import manno.kuasoworld.KuasoWorld;
import manno.kuasoworld.item.GoldenKuaso;
import manno.kuasoworld.item.RawKuaso;
import manno.kuasoworld.item.ToastedKuaso;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ModItems {
    //物品注册器
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KuasoWorld.MODID);

    //food
    public static final RegistryObject<Item> RAW_KUASO_ITEM = ITEMS.register("raw_kuaso", RawKuaso::new);
    public static final RegistryObject<Item> TOASTED_KUASO_ITEM = ITEMS.register("toasted_kuaso", ToastedKuaso::new);
    public static final RegistryObject<Item> GOLDEN_KUASO_ITEM = ITEMS.register("golden_kuaso", GoldenKuaso::new);
}
