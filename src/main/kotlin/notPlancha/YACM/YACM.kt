package notPlancha.YACM

import net.minecraft.client.Minecraft
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import notPlancha.YACM.Itens.Coin
import notPlancha.YACM.register.Register
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.runForDist


@Mod(YACM.ID)
object YACM {
    const val ID = "yacm"
    val LOGGER: Logger = LogManager.getLogger(ID)
    init {
        onModStartup()
        MOD_BUS.addListener(::onModSetup)
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

    }
    private fun onClientSetup(event: FMLClientSetupEvent) {
        //TODO
        //Register.eventListener(PlayerEventListener)
    }
    private fun onServerSetup(event: FMLDedicatedServerSetupEvent) {

    }
    //block from all mods already registered here
    private fun onModSetup(event: FMLCommonSetupEvent){

    }
    //here it will register the things I think
    private fun onModStartup(){
        Register.definitions.Item(Coin)
        Register.commit()
    }
}