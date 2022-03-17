package notPlancha.YACM.Bases

import net.minecraft.world.level.block.state.BlockBehaviour

interface IBaseBlock : IBaseItem {
    var blockProperties : BlockBehaviour.Properties
}