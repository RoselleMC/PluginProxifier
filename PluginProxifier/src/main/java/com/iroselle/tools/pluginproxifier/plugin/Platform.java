package com.iroselle.tools.pluginproxifier.plugin;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * PluginProxifier
 * com.iroselle.tools.pluginproxifier.plugin.Platform
 *
 * @author Score2
 * @since 2022/07/21 22:47
 */
@Getter
@AllArgsConstructor
public enum Platform {
    BUKKIT(new String[]{"plugin.bukkit.yml"}),
    BUNGEE(new String[]{"plugin."}),
    VELOCITY(new String[]{"plugin."}),
    NUKKIT(new String[]{"plugin."}),
    ;

    private String[] resourceNames;

}
