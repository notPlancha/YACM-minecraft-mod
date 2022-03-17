package notPlancha.YACM.utils

import net.minecraft.client.Minecraft
import net.minecraft.client.player.LocalPlayer


object Redirects {
    inline val PLAYER: LocalPlayer?
        get() = MINECRAFT.player

    inline val MINECRAFT: Minecraft
        get() = Minecraft.getInstance()

}
