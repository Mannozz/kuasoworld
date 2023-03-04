package manno.vanillasdelight.common.registry;

import manno.vanillasdelight.VanillasDelight;
import manno.vanillasdelight.common.ModFoodProperties;
import manno.vanillasdelight.common.item.KuasoBlockItem;
import manno.vanillasdelight.common.item.MilkBottleItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ModItems {
    public static Item.Properties basicItem() {
        return new Item.Properties().tab(VanillasDelight.CREATIVE_MODE_TAB);
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food).tab(VanillasDelight.CREATIVE_MODE_TAB);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16).tab(VanillasDelight.CREATIVE_MODE_TAB);
    }

    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(VanillasDelight.CREATIVE_MODE_TAB);
    }

    //物品注册器
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillasDelight.MODID);

    //food
    public static final RegistryObject<Item> RAW_KUASO_ITEM = ITEMS.register("raw_kuaso", () -> new Item(foodItem(ModFoodProperties.RAW_KUASO)));
    public static final RegistryObject<Item> TOASTED_KUASO_ITEM = ITEMS.register("toasted_kuaso", () -> new Item(foodItem(ModFoodProperties.TOASTED_KUASO)));
    public static final RegistryObject<Item> GOLDEN_KUASO_ITEM = ITEMS.register("golden_kuaso", () -> new Item(foodItem(ModFoodProperties.GOLDEN_KUASO)));

    public static final RegistryObject<Item> KUASO_BLOCK_ITEM = ITEMS.register("kuaso_block_item",
            () -> new KuasoBlockItem(ModBlocks.KUASO_BLOCK.get(), basicItem()));

    public static final RegistryObject<Item> MILK_BOTTLE = ITEMS.register("milk_bottle",
            () -> new MilkBottleItem(drinkItem()));
}
