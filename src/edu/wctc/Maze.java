package edu.wctc;

public class Maze {
    private Room currentRoom;
    private boolean isFinished;
    private Player player;




    public void setPlayer(Player player) {
        this.player = player;
    }
    public boolean isFinished() {
        return isFinished;
    }
    public Maze() {
        player = new Player();

        LivingRoom startingPoint = new LivingRoom("Starting Point");
        Hallway hallway = new Hallway("Hall");
        GuestRoom guestRoom = new GuestRoom("Guest Room Entrance");
        MasterBedroom masterBed= new MasterBedroom("Master Bedroom Exit");
        Attic atticEntrance = new Attic("Attic");

        currentRoom = startingPoint;

        startingPoint.setSouth(hallway);

        hallway.setNorth(guestRoom);
        guestRoom.setSouth(hallway);

        hallway.setWest(masterBed);

        guestRoom.setSouth(hallway);
        hallway.setNorth(guestRoom);

        masterBed.setUp(atticEntrance);
        atticEntrance.setDown(masterBed);

    }
    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable ) {
            return ((Lootable) currentRoom).loot(player);
        } else {
            return "There is nothing here to take..";
        }
    }
    public String interactWithCurrentRoom() {

        if (currentRoom instanceof Interactable) {

            return ((Interactable) currentRoom).interact(player);
        } else {
            return "There is nothing you can do,move on!";
        }
    }

    public boolean move(char move) {
        if (getCurrentRoom().isValidDirection(move)) {
            System.out.println(exitCurrentRoom());
            currentRoom = currentRoom.getAdjoiningRoom(move);
            return true;
        }
        else {
            return false;
        }
    }

    public String exitCurrentRoom() {

        if (currentRoom instanceof Exitable) {
            return ((Exitable) currentRoom).exit(player);
        }
        else {
            return "There are no exits in this room.";
        }
    }

    public  String escapeCurrentRoom() {
        if (currentRoom instanceof Escapable) {
            isFinished=true;
            return ((Escapable) currentRoom).escape(player) + "\nYou earned : " + getPlayerScore() + " points";
        } else {
            return "You can not escape here.";
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }


    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }


    public String getPlayerInventory() {
            return player.getInventory();

    }

    public int getPlayerScore() {
        return player.getScore();
    }

}
