package com.iroselle.tools.pluginproxifier.plugin;

import java.io.File;

/**
 * PluginProxifier
 * com.iroselle.tools.pluginproxifier.plugin.Plugin
 *
 * @author Score2
 * @since 2022/07/21 22:27
 */
public interface Plugin {

    File getFile();

    String getName();

    String getVersion();

}
