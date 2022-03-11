package notPlancha.YACM

import net.minecraft.network.chat.Component
import net.minecraft.network.chat.TextComponent

object Utils {
    fun DisplayMessage(message: Component) = Redirects.PLAYER?.displayClientMessage(message, false)
    fun DisplayMessage(message: String) = Redirects.PLAYER?.displayClientMessage(ToComponent(message), false)
    fun ToComponent(str: String): TextComponent = TextComponent(str)
}