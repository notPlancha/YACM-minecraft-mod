package notPlancha.YACM.register

import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Material
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import notPlancha.YACM.Bases.IBaseBlock
import notPlancha.YACM.Bases.IBaseItem
import notPlancha.YACM.YACM
import thedarkcolour.kotlinforforge.forge.FORGE_BUS
import thedarkcolour.kotlinforforge.forge.MOD_BUS

//https://i.imgur.com/S1EQwrm.png
object Register {
    fun eventListener(ev: Any) = FORGE_BUS.register(ev)

    object DeferredRegsiters {
        val BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, YACM.ID)
        val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, YACM.ID)
        val PROFESSIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS, YACM.ID)
    }
    fun commit(){
        DeferredRegsiters.BLOCKS.register(MOD_BUS)
        DeferredRegsiters.ITEMS.register(MOD_BUS)
        DeferredRegsiters.PROFESSIONS.register(MOD_BUS)
    }
    object definitions{
        fun Item(item : IBaseItem): RegistryObject<Item> {
            return DeferredRegsiters.ITEMS.register(item.id){Item(item.itemProperties) }
        }
        fun Block(block : IBaseBlock) : RegistryObject<Block>{
            var ret = DeferredRegsiters.BLOCKS.register(block.id){ Block(block.blockProperties) }
            DeferredRegsiters.ITEMS.register(ret.id.path){Item(block.itemProperties)}
            return ret
        }
    }
}