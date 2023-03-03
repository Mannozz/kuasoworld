package manno.kuasoworld.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;


/*创建一个物品需要哪几个步骤。答案是三步：创建自己的物品并继承原版的物品的类，实例化这个物品，最后把这个物品注册进游戏。*/

//可颂面团 给予饥饿和临时生命效果
public class GoldenKuaso extends Item {


    private static Supplier<MobEffectInstance> supplier;
    private static Supplier<MobEffectInstance> supplier2;
    private static Supplier<MobEffectInstance> supplier3;

    static {
        //效果类型|持续时间n*tick|效果等级(从0算起)
        supplier = () -> new MobEffectInstance(MobEffects.REGENERATION, 5 * 20, 3);
        supplier2 = () -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 10 * 20, 3);
        supplier3 = () -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 30 * 20, 0);
    }

    //nutrition营养值
    //saturationMod饥饱值
    //effect(效果,概率)
    private static FoodProperties food = (new FoodProperties.Builder().saturationMod(2).
            nutrition(16).
            effect(supplier, 1).
            effect(supplier2, 1).
            effect(supplier3, 1).
            build());

    public GoldenKuaso() {
        super(new Properties().tab(CreativeModeTab.TAB_FOOD).food(food));//增加食物属性
    }
}
