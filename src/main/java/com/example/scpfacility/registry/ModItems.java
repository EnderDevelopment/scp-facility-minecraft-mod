package com.example.scpfacility.registry;

import com.example.scpfacility.item.SCPItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "scp-facility");
    
    public static final RegistryObject<Item> SCP_ITEM = ITEMS.register("scp_item", SCPItem::new);
}