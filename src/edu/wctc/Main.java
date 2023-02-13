package edu.wctc;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Maze maze = new Maze();
        Scanner input = new Scanner(System.in);
        while (!maze.isFinished()) {
            System.out.println(maze.getCurrentRoomDescription() + "\n-------------");
            System.out.println("Which way would you like to go?" + "\nExits to this room are: " + maze.getCurrentRoomExits());
            System.out.println("Try to Loot-l\nTry to Interact-i\nTry to Escape-x\n-------------------");
            System.out.print("Selection: ");
            char userInput = input.next().toLowerCase().charAt(0);

            switch (userInput) {
                case 'n', 's', 'w', 'e', 'd', 'u' -> {
                    if (!maze.move(userInput)) {
                        System.out.println("No exit that way, hurry before the zombie catches you!");
                    }
                }
                case 'i' -> System.out.println(maze.interactWithCurrentRoom());
                case 'l' -> System.out.println(maze.lootCurrentRoom());
                case 'x' -> System.out.println(maze.escapeCurrentRoom());
                case 'v' -> System.out.println(maze.getPlayerInventory());
            }


        }
    }
}

