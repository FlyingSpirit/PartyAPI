package de.flyingspirit.party;

import de.flyingspirit.party.api.PartyManager;
import de.flyingspirit.party.commands.InfoCommand;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

public class PartyAPI extends Plugin {

    private static PartyAPI instance;
    private static PartyManager partyManager;

    @Override
    public void onEnable() {
        PartyAPI.instance = this;
        PartyAPI.partyManager = new PartyManager();
        PluginManager p = ProxyServer.getInstance().getPluginManager();

        p.registerCommand(this, new InfoCommand());
    }

    @Override
    public void onDisable() {
        PartyAPI.instance = null;
        PartyAPI.partyManager = null;
    }

    public static PartyAPI getInstance() {
        return PartyAPI.instance;
    }

    public static PartyManager getPartyManager() {
        return PartyAPI.partyManager;
    }
}
