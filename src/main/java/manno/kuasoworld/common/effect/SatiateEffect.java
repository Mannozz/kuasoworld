package manno.kuasoworld.common.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
/**
 * This effect extends the player's natural regeneration, regardless of how hungry they are.
 * Comfort does not care for amplifiers; it will always heal at the same slow pace.
 * If the player has saturation to spend, or has the Regeneration effect, Comfort does nothing.
 */
public class SatiateEffect extends MobEffect {


    public SatiateEffect() {
        super(MobEffectCategory.BENEFICIAL, 0);
    }

    @Override
    public void applyEffectTick(@NotNull LivingEntity entity, int amplifier) {
        //用户饱食度不满时持续恢复
        if (entity instanceof Player player) {
            if (player.getFoodData().getFoodLevel() < 19) {//不回满让用户可以再吃其它食物
                player.getFoodData().setFoodLevel(player.getFoodData().getFoodLevel() + 1);
            }
        }
    }

    @Override//每80tick恢复半格
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % 80 == 0;
    }

}
