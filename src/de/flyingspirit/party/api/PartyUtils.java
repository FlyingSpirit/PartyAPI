package de.flyingspirit.party.api;

import de.flyingspirit.party.PartyAPI;

public class PartyUtils {

    public static Party getParty(String paramString) {
        return (Party) PartyAPI.getPartyManager().getPartyMap().get(PartyAPI.getPartyManager().getLocationMap().get(paramString));
    }

}
