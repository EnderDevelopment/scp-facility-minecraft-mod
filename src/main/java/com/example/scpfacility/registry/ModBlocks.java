package com.example.scpfacility.registry;

import com.example.scpfacility.block.SCPBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "scp-facility");
    
    public static final RegistryObject<Block> SCP_BLOCK = BLOCKS.register("scp_block", SCPBlock::new);
}