package manno.vanillasdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import static manno.vanillasdelight.KuasoWorld.KUASO_WORLD_TAB;


/*创建一个物品需要哪几个步骤。答案是三步：创建自己的物品并继承原版的物品的类，实例化这个物品，最后把这个物品注册进游戏。*/

//可颂面团 给予饥饿和临时生命效果
public class RawKuaso extends Item {


    private static FoodProperties RAW_KUASO = (new FoodProperties.Builder().saturationMod(1).
            nutrition(3).
            effect(() -> new MobEffectInstance(MobEffects.HUNGER, 3 * 20, 0), 1).
            effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 10 * 20, 0), 1).//这里追加effect叠加复数效果
                    build());

    public RawKuaso() {
        super(new Properties().tab(KUASO_WORLD_TAB).food(RAW_KUASO));//增加食物属性
    }
}
