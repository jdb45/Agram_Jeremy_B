package com.jeremy;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Hand {

    static Scanner numberScanner = new Scanner(System.in);
    public static ArrayList<Card> hand = new ArrayList<Card>();


    public Player(){

    }

    //this method is used for after the computer plays their card
    public static ArrayList playerTurnAfter(ArrayList<Card> player){
        boolean checkIfPlayerHas = true;
        int userInput = 0;
        while (checkIfPlayerHas) {
            //try block to make sure the player plays a card within range, and doesn't play any letters
            try {
                System.out.println("Please select a card to play " + " 1 - " + player.size() + "\n" +
                        "Your hand is " + player + "\n");
                userInput = Integer.parseInt(numberScanner.nextLine());
                userInput += -1;
                //checks if the player has the same suit card that the computer played, and makes sure the player will play that suit
                for (int i = 0; i < player.size(); i++) {
                    if (computerMove.get(0).getSuit() != player.get(userInput).getSuit() & player.size() != 0 & computerMove.size() != 0) {
                        if (computerMove.get(0).getSuit() == player.get(i).getSuit()) {
                            System.out.println("You must play the same suit that the computer played since you have a card that matches that suit \n");
                            System.out.println("Computer played " + computerMove.get(0) + "\n");
                            checkIfPlayerHas = true;
                            break;

                        } else {
                            checkIfPlayerHas = false;
                        }
                    } else {
                        checkIfPlayerHas = false;

                    }
                }
            }catch (IndexOutOfBoundsException ibe){
                System.out.println("Number is out of card range. Please enter a number between 1 - " + player.size() + "\n" +
                        "Computer played " + computerMove.get(0) + "\n");
            }
            catch (NumberFormatException nfe){
                System.out.println("Sorry, no letters. Please enter a number between 1 - " + player.size() + "\n" +
                        "Computer played " + computerMove.get(0) + "\n");

            }
        }

       userInput = rangeChecker(userInput, player);
        //adds a card to hand to use for checking against the computers played card
        hand.add(player.get(userInput));
        //shows the user what card they played
        System.out.println("You played " + player.get(userInput) + "\n");
        player.remove(userInput);


        return player;
    }
    //this method is used is the player goes first
    public static ArrayList playerTurn(ArrayList<Card> player){
        boolean userCheck = true;

        //pretty much the same as the other, it just doesn't check for teh same suit to be played. They can play whatever card they want
        while (userCheck) {
            try {
                System.out.println("Please select a card to play " + " 1 - " + player.size() + "\n" +
                        player);
                int userInput = Integer.parseInt(numberScanner.nextLine());
                userInput += -1;
                player.get(userInput);

                for (int i = 0; i < player.size(); i++) {

                    if (userInput == i) {
                        hand.add(player.get(userInput));
                        System.out.println("You played " + player.get(userInput) + "\n");
                        player.remove(userInput);
                        userCheck = false;

                    }

                }
            }catch (IndexOutOfBoundsException ibe){
                System.out.println("Number is out of card range. Please enter a number between 1 - " + player.size() + "\n");
            }
            catch (NumberFormatException nfe){
                System.out.println("Sorry, no letters. Please enter a number between 1 - " + player.size() + "\n");

            }
        }

        return player;
    }
}

