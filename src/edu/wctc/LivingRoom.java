package edu.wctc;

public class LivingRoom extends Room implements Exitable {

        public LivingRoom(String name) {
            super(name);
        }

        @Override
        public String getDescription() {
            return "You are in the living room, eating popcorn and watching Stranger Things. You all of a sudden hear the window behind you shatter. You jump up and turn to see a zombie.";
        }

         public String exit(Player player) {
          return "You bolt out of the living room  as fast as you can!";
        }
    }



