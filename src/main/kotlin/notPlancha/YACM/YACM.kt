package notPlancha.YACM

import net.minecraft.client.Minecraft
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import notPlancha.YACM.block.ModBlocks
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.forge.FORGE_BUS
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.runForDist

@Mod(YACM.ID)
object YACM {

    const val ID = "yacm"
    val LOGGER: Logger = LogManager.getLogger(ID)
    init {
        // Register the KDeferredRegister to the mod-specific event bus
        ModBlocks.REGISTRY.register(MOD_BUS)
        val obj = runForDist(
            clientTarget = {
                MOD_BUS.addListener(::onClientSetup)
                Minecraft.getInstance()
            },
            serverTarget = {
                MOD_BUS.addListener(::onServerSetup)
                "test"
            })
        println(obj)

        FORGE_BUS.register(PlayerEventListener)
    }
    private fun onClientSetup(event: FMLClientSetupEvent) {
        LOGGER.log(Level.INFO, "Initializing client...")
    }
    private fun onServerSetup(event: FMLDedicatedServerSetupEvent) {
        LOGGER.log(Level.INFO, "Server starting...")
    }
}