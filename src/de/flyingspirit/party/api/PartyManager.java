package de.flyingspirit.party.api;

import java.util.HashMap;
import java.util.Map;

public class PartyManager {

    private Map<String, Party> partyMap;
    private Map<String, String> locationMap;
    private Map<String, String> invitationMap;

    public PartyManager() {
        this.partyMap = new HashMap<String, Party>();
        this.locationMap = new HashMap<String, String>();
        this.invitationMap = new HashMap<String, String>();
    }

    public Map getPartyMap() {
        return this.partyMap;
    }

    public Map getLocationMap() {
        return this.locationMap;
    }

    public Map getInvitationMap() {
        return this.invitationMap;
    }

    public void setPartyMap(Map paramMap) {
        this.partyMap = paramMap;
    }

    public void setLocationMap(Map paramMap) {
        this.locationMap = paramMap;
    }

    public void setInvitationMap(Map paramMap) {
        this.invitationMap = paramMap;
    }
}
