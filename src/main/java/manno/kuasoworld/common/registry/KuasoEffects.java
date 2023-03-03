package manno.kuasoworld.common.registry;

import manno.kuasoworld.KuasoWorld;
import manno.kuasoworld.common.effect.FulFillEffect;
import manno.kuasoworld.common.effect.SatiateEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class KuasoEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, KuasoWorld.MODID);
    public static final RegistryObject<MobEffect> FULFILL = EFFECTS.register("fulfill", FulFillEffect::new);

    public static final RegistryObject<MobEffect> SATIATE = EFFECTS.register("satiate", SatiateEffect::new);
}
