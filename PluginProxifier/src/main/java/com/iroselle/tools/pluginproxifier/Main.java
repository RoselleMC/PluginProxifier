package com.iroselle.tools.pluginproxifier;

import com.iroselle.tools.pluginproxifier.plugin.Plugin;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * PluginProxifier
 * com.iroselle.tools.pluginproxifier.Main
 *
 * @author Score2
 * @since 2022/07/21 20:18
 */
public class Main {

    public static void main(String[] args) {
        OptionSet options;
        try {
            OptionParser parser = new OptionParser() {
                {
                    acceptsAll(Arrays.asList("?", "help"), "List parameters.");
                    acceptsAll(Arrays.asList("sort", "s"), "Sort(Update) out the plugin 'jars' in the 'current' or 'specified' directory.");
                }
            };
            options = parser.parse(args);

            if (!options.hasOptions()) {
                parser.printHelpOn(System.out);
                return;
            }

            if (options.has("?")) {
                parser.printHelpOn(System.out);
                return;
            }
        } catch (Throwable t) {
            t.printStackTrace();
            return;
        }

        new PluginProxifier().start(options);
    }



}
