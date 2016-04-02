package buildtech.bases.blocks;

import buildtech.bases.utils.TextureUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class BasicBlock extends Block {

    public BasicBlock(String name) {
        super(Material.rock);
        this.setUnlocalizedName(name);
        this.setRegistryName(TextureUtils.blockTexture(name));
    }
}
