package com.example.scpfacility.registry;

import com.example.scpfacility.gui.SCPGuiContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.MENU_TYPES, "scp-facility");

    public static final RegistryObject<MenuType<SCPGuiContainer>> SCP_GUI = MENU_TYPES.register("scp_gui", () -> IForgeMenuType.create((windowId, inv, data) -> new SCPGuiContainer(ModMenuTypes.SCP_GUI.get(), windowId, inv)));
}