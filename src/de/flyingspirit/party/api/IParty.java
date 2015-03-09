package de.flyingspirit.party.api;

import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.List;

public interface IParty {

    public ProxiedPlayer getOwner();

    public List<String> getMembers();

    public List<String> getInvitatations();

    public void setOwner(ProxiedPlayer paramPlayer);

    public void setMembers(List<String> paramList);

    public void setInvitations(List<String> paramList);

}
