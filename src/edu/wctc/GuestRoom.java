package edu.wctc;

public class GuestRoom extends Room implements Interactable, Exitable{

    public GuestRoom(String name) {
        super(name);
    }

    public String getDescription(){
        return "You are in  the guest room, you hear growling outside of the door. You spot an open closet door.";

    }

    public String interact(Player player){
        player.addToScore(100);
        return "You hide in the closet until the coast is clear.";
    }

    public String exit(Player player){
        return "The zombie is distracted by a loud noise, so you are able to leave the room.";
    }
}