package notPlancha.YACM.Itens

import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import notPlancha.YACM.Bases.IBaseItem

object Coin : IBaseItem {
    override val itemProperties = Item.Properties()
    override val name: String = "Coin"
    override val id: String = "coin"
    init{
        itemProperties.tab(CreativeModeTab.TAB_MISC)
    }
}