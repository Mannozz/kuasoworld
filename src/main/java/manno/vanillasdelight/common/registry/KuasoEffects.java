package manno.vanillasdelight.common.registry;

import manno.vanillasdelight.KuasoWorld;
import manno.vanillasdelight.common.effect.FulFillEffect;
import manno.vanillasdelight.common.effect.SatiateEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KuasoEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, KuasoWorld.MODID);
    public static final RegistryObject<MobEffect> FULFILL = EFFECTS.register("fulfill", FulFillEffect::new);

    public static final RegistryObject<MobEffect> SATIATE = EFFECTS.register("satiate", SatiateEffect::new);
}
