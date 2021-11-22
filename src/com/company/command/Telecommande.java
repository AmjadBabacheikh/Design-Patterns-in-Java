package com.company.command;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Telecommande {

    private Map<String, Command> telecommandesCommandes=new HashMap<>();
    private Command command;


    public void addToCommandes(String reference, Command commande) {
        telecommandesCommandes.put(reference, commande);
    }

    public void pressButton(String reference) {
        Command command = telecommandesCommandes.get(reference);
        if (command != null) command.execute();
    }

    public void cancel() {
        if (command != null) command.undo();
    }


}
