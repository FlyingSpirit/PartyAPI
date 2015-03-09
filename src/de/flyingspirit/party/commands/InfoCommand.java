package de.flyingspirit.party.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class InfoCommand extends Command {

    public InfoCommand() {
        super("PartyInfo");
    }

    @Override
    public void execute(CommandSender p, String[] args) {
        p.sendMessage("This Proxy utilizes FlyingSpirit's PartyAPI version 1.0!");
    }
}
