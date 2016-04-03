package buildtech.bases.utils;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInterModComms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by UniversalRed on 15-03-14.
 */
public class VersionChecker {

    public static final String currentVersion = "@VERSION@";
    public static boolean newerVersionAvailable = false;
    public static String newerVersionNumber = "";
    public static String[] changelog;

    public static void start() {
        new VersionCheckThread().start();
    }

    private static class VersionCheckThread extends Thread {

        @Override
        public void run() {
            ModUtils.info("BuildTech version check initiated, current version: @VERSION@");
            try {

                URL version = new URL("https://raw.githubusercontent.com/UniversalRed/BuildTech/1.7.10/src/main/resources/assets/buildtech/versions/version");
                BufferedReader reader = new BufferedReader(new InputStreamReader(version.openStream()));
                newerVersionNumber = reader.readLine();
                if (!currentVersion.equals(newerVersionNumber)) {
                    newerVersionAvailable = true;
                    ModUtils.info("There is a newer version of BuildTech available (" + newerVersionNumber + ") please consider updating");
                    URL changelogURL = new URL("https://github.com/UniversalRed/BuildTech/blob/1.7.10/src/main/resources/assets/buildtech/changelogs" + newerVersionNumber);
                    BufferedReader changelogReader = new BufferedReader((new InputStreamReader(changelogURL.openStream())));
                    String line;
                    ArrayList<String> changelogList = new ArrayList<String>();
                    while ((line = changelogReader.readLine()) != null)
                        changelogList.add(line);
                    changelog = new String[changelogList.size()];
                    changelogList.toArray(changelog);
                    pingVersionChecker();
                }

            } catch (Throwable e) {
                ModUtils.error("BuildTech version check failed!");
                e.printStackTrace();
            }
        }

        public void pingVersionChecker() {
            if (Loader.isModLoaded("VersionChecker")) {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setString("modDisplayName", "BuildTech");
                tag.setString("oldVersion", currentVersion);
                tag.setString("newVersion", newerVersionNumber);
                tag.setString("updateUrl", "http://minecraft.curseforge.com/mc-mods/79581-buildtech");
                tag.setBoolean("isDirectLink", false);
                StringBuilder builder = new StringBuilder();
                for (String s : changelog)
                    builder.append(s).append("/n");
                tag.setString("changeLog", builder.toString());
                FMLInterModComms.sendRuntimeMessage("buildtech", "VersionChecker", "addUpdate", tag);
            }
        }
    }
}
