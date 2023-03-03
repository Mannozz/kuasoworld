package manno.kuasoworld.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

import static manno.kuasoworld.KuasoWorld.KUASO_WORLD_TAB;


/*创建一个物品需要哪几个步骤。答案是三步：创建自己的物品并继承原版的物品的类，实例化这个物品，最后把这个物品注册进游戏。*/

//可颂面团 给予饥饿和临时生命效果
public class GoldenKuaso extends Item {
    //nutrition营养值
    //saturationMod饥饱值
    //effect(效果,概率)
    private static FoodProperties GOLDEN_KUASO = (new FoodProperties.Builder().saturationMod(2).
            nutrition(16).
            effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 5 * 20, 3), 1).
            effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 10 * 20, 3), 1).
            effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 30 * 20, 0), 1).
            build());

    public GoldenKuaso() {
        super(new Properties().tab(KUASO_WORLD_TAB).food(GOLDEN_KUASO));//增加食物属性
    }
}
