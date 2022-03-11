package notPlancha.YACM

import net.minecraft.client.Minecraft
import net.minecraft.client.player.LocalPlayer
import net.minecraft.network.chat.TextComponent


object Redirects {
    inline val PLAYER: LocalPlayer?
        get() = MINECRAFT.player

    inline val MINECRAFT: Minecraft
        get() = Minecraft.getInstance()

}
