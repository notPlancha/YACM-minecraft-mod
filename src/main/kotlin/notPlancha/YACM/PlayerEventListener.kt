package notPlancha.YACM


import net.minecraftforge.event.world.BlockEvent
import net.minecraftforge.eventbus.api.SubscribeEvent

object PlayerEventListener{
    @SubscribeEvent
    fun onBlockBreak(event: BlockEvent.BreakEvent){
        if(event.player.isLocalPlayer){
            Utils.DisplayMessage(event.player.displayName.string + " Broke " + event.state.block.name.string)
        }
    }
}