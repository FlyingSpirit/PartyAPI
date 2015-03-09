package de.flyingspirit.party.api;

import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.ArrayList;
import java.util.List;

public class Party implements IParty {

    private ProxiedPlayer owner;
    private List<String> members;
    private List<String> invitations;

    public Party() {}

    public Party(ProxiedPlayer paramPlayer) {
        this.owner = paramPlayer;
        this.members = new ArrayList<String>();
        this.invitations = new ArrayList<String>();
    }

    @Override
    public ProxiedPlayer getOwner() {
        return this.owner;
    }

    @Override
    public List<String> getMembers() {
        return this.members;
    }

    @Override
    public List<String> getInvitatations() {
        return this.invitations;
    }

    @Override
    public void setOwner(ProxiedPlayer paramPlayer) {
        this.owner = paramPlayer;
    }

    @Override
    public void setMembers(List<String> paramList) {
        this.members = paramList;
    }

    @Override
    public void setInvitations(List<String> paramList) {
        this.invitations = paramList;
    }
}
