package manno.vanillasdelight.common;

import manno.vanillasdelight.common.registry.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RAW_KUASO = (new FoodProperties.Builder().saturationMod(0.1f).
            nutrition(2).
            effect(() -> new MobEffectInstance(MobEffects.HUNGER, 3 * 20, 0), 1).
            effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 10 * 20, 0), 1).//这里追加effect叠加复数效果
                    build());
    public static final FoodProperties TOASTED_KUASO = (new FoodProperties.Builder().saturationMod(0.3f).
            nutrition(6).
            effect(() -> new MobEffectInstance(ModEffects.SATIATE.get(), 180 * 20, 0), 1).
            effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 15 * 20, 0), 1).//这里追加effect叠加复数效果
                    build());
    public static final FoodProperties GOLDEN_KUASO = (new FoodProperties.Builder().saturationMod(0.2f).
            nutrition(8).
            effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 5 * 20, 3), 1).
            effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 10 * 20, 3), 1).
            effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 30 * 20, 0), 1).
            build());
}
