package buildtech.bases.utils;

import buildtech.bases.libs.ModLibs;
import net.minecraft.util.StatCollector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ModUtils {
    public static final Logger logger = LogManager.getLogger(ModLibs.modNAME);

    public static String localize(String key) {
        return ("" + StatCollector.translateToLocal(key)).trim();
    }

    public static String localizeFormatted(String key, Object... objects) {
        return ("" + StatCollector.translateToLocalFormatted(key, objects)).trim();
    }
}
