package edu.wctc;

public class Attic extends Room implements Lootable,Interactable,Escapable,Exitable{

    public Attic(String name) {
        super(name);
    }

    @Override
    public String getDescription(){
        return "You are in the attic. You hear the zombie rumbling around in the room below you. You are horrified,thinking that this may be your last. But wait, you see a flash light,perfect because it's really dark up here. ";
    }

    public String loot(Player player){
        player.addToInventory("Flash light");
        player.addToScore(400);
        return "You grab the flashlight and turn it on. ";

    }

    public String interact(Player player){
        player.addToScore(500);
        return "You point the flash light at the attic window and see a fire escape ladder. You rush over, open the window and toss the fire ladder over the window sill.";

    }
    public String escape(Player player){

        player.addToScore(1050);
        return "You climb out of the window and run as fast as you can. Congrats! You escaped the house but be careful out there,those zombies are everywhere!";
    }

    public String exit(Player player){
        return "You are heading back towards the zombie!";
    }

}

