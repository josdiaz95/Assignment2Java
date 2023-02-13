package edu.wctc;

public abstract class Room {
    private String name;
    private Room north,south,east,west,up,down;


    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();


    public Room getAdjoiningRoom(char adjoiningRoom) {


        if(isValidDirection(adjoiningRoom) && adjoiningRoom == 'n'){
            return north;
        }


        if(isValidDirection(adjoiningRoom) && adjoiningRoom == 's'){

            return south;
        }

        if(isValidDirection(adjoiningRoom) && adjoiningRoom == 'w'){
            return west;
        }
        if(isValidDirection(adjoiningRoom) && adjoiningRoom == 'e'){
            return east;
        }
        if(isValidDirection(adjoiningRoom) && adjoiningRoom == 'u'){

            return up;
        }
        if(isValidDirection(adjoiningRoom) && adjoiningRoom == 'd'){

            return down;
        }
        else {
            return null;
        }
    }

    public String getExits() {

        String exits =" " ;

        if(north != null ){
            exits += " north |";
        }
        if(south != null ){
            exits += " south |";
        }
        if(west != null ){
            exits += " west |";
        }
        if(east != null ){
            exits += " east |";
        }
        if(up != null ){
            exits += " up |";
        }
        if(down != null ){
            exits += " down |";
        }

        return exits;
    }


    public String getName() {
        return this.name;
    }

    public boolean isValidDirection(char isValid) {

        if(isValid == 'n' && north != null) {
            return true;
        }
        else if(isValid == 's' && south != null){
            return true;
        }else if(isValid== 'w' && west != null){
            return true;
        }else if(isValid== 'e' && east != null){
            return true;
        }else if(isValid == 'u' && up != null){
            return true;
        }else if(isValid == 'd' && down != null){
            return true;
        }
        else{
            return false;
        }
    }

    public void setNorth(Room northRoom) {
        this.north = northRoom;
    }

    public void setSouth(Room southRoom) {
        this.south = southRoom;
    }

    public void setEast(Room eastRoom) {
        this.east = eastRoom;
    }

    public void setWest(Room westRoom) {
        this.west = westRoom;
    }

    public void setUp(Room upRoom) {
        this.up = upRoom;
    }

    public void setDown(Room downRoom) {
        this.down = downRoom;
    }
}
