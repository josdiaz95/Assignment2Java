package edu.wctc;

public class Hallway extends Room implements Exitable {

    public Hallway(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in the hallway and see two doors leading to a safe area,quick ,choose one!";
    }

    public String exit(Player player) {
        return "You run though the door...";
    }
}


