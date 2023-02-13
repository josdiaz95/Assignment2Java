package edu.wctc;

public class MasterBedroom extends Room implements Lootable, Exitable,Interactable{


    public MasterBedroom(String name) {
        super(name);
    }


    public String getDescription(){
        return "You are in the Master Bedroom. You look to your right and see a wooden bat.";
    }

    public String loot(Player player){
        player.addToInventory("Wooden baseball bat ");
        player.addToScore(300);
        return "You grab the bat in order to protect yourself.";

    }

    public String interact(Player player){
        player.addToScore(100);
        return "You walk into the Master closet and look up to see an attic door, you pull the cord to get into the attic.";

    }

    public String exit(Player player){
        return "You climb up the attic ladder..";
    }
}