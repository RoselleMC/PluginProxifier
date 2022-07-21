package com.iroselle.tools.pluginproxifier;

import com.iroselle.tools.pluginproxifier.plugin.Plugin;
import joptsimple.OptionSet;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * PluginProxifier
 * com.iroselle.tools.pluginproxifier.PluginProxifier
 *
 * @author Score2
 * @since 2022/07/21 22:43
 */
public class PluginProxifier {

    private final SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd-hh_mm_ss");

    private final String runtime;

    public PluginProxifier() {
        this.runtime = getFormattedTime();
    }

    public void start(OptionSet options) {
        if (options.has("s")) {
            options.valuesOf("s").forEach((object) -> {
                File directory;
                String string = object.toString();
                try {
                    directory = new File(string);
                } catch (Throwable t) {
                    System.err.println("'" + string + "' is not directory!");
                    return;
                }

                sortByDirectory(directory);
            });
        }
    }


    public static void sortByDirectory(File directory) {
        if (!directory.isDirectory()) {
            System.err.println("'" + directory.getName() + "' is not directory!");
            return;
        }
        File[] files = directory.listFiles();
        if (files == null || files.length < 1) {
            System.err.println("The directory '" + directory.getName() + "' is empty!");
            return;
        }

        List<Plugin> plugins = new ArrayList<>();
        for (File file : files) {

        }

    }

    public String getFormattedTime() {
        return format.format(new Date());
    }


    private void removeFile(File file) {

    }
}
