package de.flyingspirit.party.api;

import de.flyingspirit.party.PartyAPI;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.List;

public class PartyFactory {

    public static void createParty(ProxiedPlayer paramPlayer) {
        Party party = new Party(paramPlayer);
        PartyAPI.getPartyManager().getPartyMap().put(paramPlayer.getName(), party);
    }

    public static void createParty(ProxiedPlayer paramPlayer, List<String> paramList) {
        Party party = new Party();
        party.setMembers(paramList);
        PartyAPI.getPartyManager().getPartyMap().put(paramPlayer.getName(), party);
    }

}
