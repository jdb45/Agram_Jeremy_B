package com.jeremy;

import java.util.ArrayList;
import java.util.Random;

public class Computer extends Player {


    // a static variable to be able to keep track of whos turn it is
    public static int number = 0;

    //a method to use if the computer goes first
    public static ArrayList computerTurnBefore(ArrayList<Card> computer){

            //assigning a random number for the computer to play. For the future I would like to determine a better way to make the computer smarter
            int random = new Random().nextInt(computer.size());

            System.out.println("Computer played " + computer.get(random) + "\n");

            //using my range checking method to make sure the computer number int greater than the computer hand size or not equal to a minus number
            random = rangeChecker(random, computer);
            //adding the card picked to my static arraylist computerMove and removing the card pick from the computers hand
            if(computer.size() != 0) {
                computerMove.add(computer.get(random));
                computer.remove(random);
            }

        return computer;
    }

    //a method used after the players turn
    public static ArrayList computerTurnAfter(ArrayList<Card> computer){
        boolean hasIt = true;
        int i;
            //checking to see if the computer has the suit that the player played.
            for (i = 0; i < computer.size(); i++) {
                if (hand.get(0).getSuit() == computer.get(i).getSuit()) {
                    hasIt = true;
                    break;

                }
                else{
                    hasIt = false;
                }

            }

        i = rangeChecker(i, computer);
        //if the computer has it, they wil play that card
        if(hasIt) {
                System.out.println("Computer played " + computer.get(i) + "\n");
                 if(computer.size() != 0) {
                    computerMove.add(computer.get(i));
                     computer.remove(i);
                }



        }
        //if the computer doesn't have a card that matches that suit than they play a random card.
        else{
                int random = new Random().nextInt(computer.size());
                System.out.println("Computer played " + computer.get(random) + "\n");

                random = rangeChecker(random, computer);

                if(computer.size() != 0) {
                    computerMove.add(computer.get(random));
                    computer.remove(random);
                }



        }

        return computer;
    }
}
