package com.company.command;

public class Main {

    public static void main(String[] args) {
        Telecommande telecommande= new Telecommande();
        Light light=new Light();
        Command lightOnCommand= new LightOnCommand(light);
        Command lightOffCommand= new LightOffCommand(light);
        telecommande.addToCommandes("lightOn",lightOnCommand);
        telecommande.addToCommandes("lightOff",lightOffCommand);
        telecommande.pressButton("lightOn");
        telecommande.cancel();
    }
}
