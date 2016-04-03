package buildtech.api.nbt;

import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by UniversalRed on 15-03-21.
 */
public interface INBTSavable {

    void writeToNBT(NBTTagCompound tag);
    void readFromNBT(NBTTagCompound tag);
}
