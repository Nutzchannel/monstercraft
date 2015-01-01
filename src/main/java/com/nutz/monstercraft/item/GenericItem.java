package com.nutz.monstercraft.item.GenericItem;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
@EventHandler
public void preInit(FMLPreInitializationEvent preInitEvent) {
  item1 = new GenericItem();
  GameRegistry.registerItem(item1, "Generic nil");
}
public class GenericItem extends Item {
  setMaxStackSize(64); //Don't know why anyone'd want 64 nil items... me, i guess?
  setCreativeTab(CreativeTabs.tabMisc); //Going to remove after testing setCreativeTab(..);
  setUnlocalizedName("genericItem");
}
