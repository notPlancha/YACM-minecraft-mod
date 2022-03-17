package notPlancha.YACM.utils

import net.minecraft.network.chat.Component
import net.minecraft.network.chat.TextComponent

object UtilFuns {
    fun displayMessage(message: Component) = Redirects.PLAYER?.displayClientMessage(message, false)
    fun displayMessage(message: String) = Redirects.PLAYER?.displayClientMessage(toComponent(message), false)
    fun toComponent(str: String): TextComponent = TextComponent(str)
}