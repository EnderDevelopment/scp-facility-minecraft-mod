package com.example.scpfacility;

import net.fabricmc.api.ModInitializer;
import com.example.scpfacility.registry.ModBlocks;
import com.example.scpfacility.registry.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SCPFacilityMod implements ModInitializer {
    public static final String MOD_ID = "scp-facility";

    @Override
    public static final String MOD_ID = "scp-facility";

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Block> SCP_BLOCK = BLOCKS.register("scp_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f)));
    public static final RegistryObject<Item> SCP_BLOCK_ITEM = ITEMS.register("scp_block", () -> new BlockItem(SCP_BLOCK.get(), new Item.Properties()));

    public static final CreativeModeTab SCP_TAB = CreativeModeTab.builder()
            .icon(() -> SCP_BLOCK_ITEM.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.scp-facility"))
            .build();

    @Override
    public void onInitialize() {
        BLOCKS.register();
        ITEMS.register();
    }
}