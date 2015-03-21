package buildtech.bases.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by UniversalRed on 15-03-21.
 */
public abstract class AdvancedBlock extends BlockContainer{

    public AdvancedBlock(String name) {
        super(Material.iron);
        this.setBlockName(name);
    }

    @Override
    public abstract TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_);
}
