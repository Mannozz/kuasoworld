package com.kuasoworld.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ToastedKuaso extends Item {

    private static Supplier<MobEffectInstance> supplier;
    private static Supplier<MobEffectInstance> supplier2;

    static {
        //效果类型|持续时间n*tick|效果等级(从0算起)
        supplier = () -> new MobEffectInstance(MobEffects.REGENERATION, 10 * 20, 0);
        supplier2 = () -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 30 * 20, 2);
    }

    //saturationMod营养值
    //hunger饥饱值
    //effect(效果,概率)
    private static FoodProperties food = (new FoodProperties.Builder().saturationMod(1).
            nutrition(3).
            effect(supplier, 1).
            effect(supplier2, 1).//这里追加effect叠加复数效果
                    build());

    public ToastedKuaso() {
        super(new Properties().tab(CreativeModeTab.TAB_FOOD).food(food));
    }
}
