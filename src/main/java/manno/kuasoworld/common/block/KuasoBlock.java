package manno.kuasoworld.common.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.checkerframework.checker.units.qual.K;

import java.util.Properties;

public class KuasoBlock extends Block {

    public KuasoBlock() {
        super(Block.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.AZALEA_LEAVES));//方块基本属性继承自羊毛
    }
}
