package notPlancha.YACM.Bases

import net.minecraft.world.item.Item

interface IBaseItem {
     val itemProperties : Item.Properties
     val name : String
     val id : String
}