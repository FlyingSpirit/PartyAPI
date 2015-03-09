package de.flyingspirit.party.api.events;

import de.flyingspirit.party.api.Party;
import net.md_5.bungee.api.plugin.Event;

public abstract class PartyEvent extends Event {

    private Party party;

    public PartyEvent(Party paramParty) {
        this.party = paramParty;
    }

    public Party getParty() {
        return this.party;
    }

    public void setParty(Party paramParty) {
        this.party = paramParty;
    }
}
