package manno.kuasoworld.common.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

@SuppressWarnings("unused")
/**
 * This effect extends the player's natural regeneration, regardless of how hungry they are.
 * Comfort does not care for amplifiers; it will always heal at the same slow pace.
 * If the player has saturation to spend, or has the Regeneration effect, Comfort does nothing.
 */
public class FulFillEffect extends MobEffect {


    public FulFillEffect() {
        super(MobEffectCategory.BENEFICIAL, 0);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        //用户有回复效果时不生效
        if (entity.hasEffect(MobEffects.REGENERATION)) {
            return;
        }
        //用户有饱食度时让用户使用饱食度回复
        if (entity instanceof Player player) {
            if (player.getFoodData().getSaturationLevel() > 0.0) {
                return;
            }
        }
        //用户血量不满时,不管饥饱值都回血
        if (entity.getHealth() < entity.getMaxHealth()) {
            entity.heal(1.0F);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % 80 == 0;
    }

}
