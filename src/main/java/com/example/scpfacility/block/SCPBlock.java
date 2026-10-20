package com.example.scpfacility.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class SCPBlock extends Block {
    public SCPBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).strength(5.0f));
    }
}