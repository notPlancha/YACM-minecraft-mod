package notPlancha.YACM.eventListeners


import net.minecraftforge.event.world.BlockEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import notPlancha.YACM.utils.UtilFuns

object PlayerEventListener{
    @SubscribeEvent
    fun onBlockBreak(event: BlockEvent.BreakEvent){
        if(event.player.isLocalPlayer){
            UtilFuns.displayMessage(event.player.displayName.string + " Broke " + event.state.block.name.string)
        }
    }
}