package com.kuasoworld.item;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potions;

import java.io.IOException;
import java.util.function.Supplier;


/*创建一个物品需要哪几个步骤。答案是三步：创建自己的物品并继承原版的物品的类，实例化这个物品，最后把这个物品注册进游戏。*/

//可颂面团 给予饥饿和临时生命效果
public class RawKuaso extends Item {


    private static Supplier<MobEffectInstance> supplier;
    private static Supplier<MobEffectInstance> supplier2;

    static {
        //效果类型|持续时间n*tick|效果等级(从0算起)
        supplier = () -> new MobEffectInstance(MobEffects.HUNGER, 3 * 20, 0);
        supplier2 = () -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 10 * 20, 0);
    }

    //saturationMod营养值
    //hunger饥饱值
    //effect(效果,概率)
    private static FoodProperties food = (new FoodProperties.Builder().saturationMod(1).
            nutrition(3).
            effect(supplier, 1).
            effect(supplier2, 1).//这里追加effect叠加复数效果
                    build());

    public RawKuaso() {
        super(new Properties().tab(CreativeModeTab.TAB_FOOD).food(food));//增加食物属性
    }
}
