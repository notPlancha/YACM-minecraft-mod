package notPlancha.YACM.datagen

import net.minecraft.data.DataGenerator
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent
import notPlancha.YACM.YACM


@Mod.EventBusSubscriber(modid = YACM.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
object DataGenerator {
    @SubscribeEvent
    fun gatherData(event: GatherDataEvent) {

    }
}