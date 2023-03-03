package manno.kuasoworld.item;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import manno.kuasoworld.common.registry.KuasoEffects;

import static manno.kuasoworld.KuasoWorld.KUASO_WORLD_TAB;

public class ToastedKuaso extends Item {

    //效果类型|持续时间n*tick|效果等级(从0算起)
    private static final FoodProperties TOASTED_KUASO = (new FoodProperties.Builder().saturationMod(6).
            nutrition(10).
            effect(() -> new MobEffectInstance(KuasoEffects.SATIATE.get(), 180 * 20, 0), 1).
            effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 15 * 20, 0), 1).//这里追加effect叠加复数效果
                    build());

    public ToastedKuaso() {
        super(new Properties().tab(KUASO_WORLD_TAB).food(TOASTED_KUASO));
    }
}
