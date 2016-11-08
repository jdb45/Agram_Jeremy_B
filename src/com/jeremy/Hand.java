package com.jeremy;

import java.util.ArrayList;
import java.util.Random;

public class Hand extends Deck {

    private static ArrayList playerCard = new ArrayList();
    private static ArrayList computer = new ArrayList<>();
    private static ArrayList playerHand = new ArrayList();
    private static ArrayList computerHand = new ArrayList();
    public static ArrayList<Card> computerMove = new ArrayList<Card>();


    public Hand() {

    }

    //creating the player hand
    public static ArrayList playerHand() {
        setHands(playerCard, deck);
        playerHand = setHands(playerCard, deck);

        return playerHand;
    }
    //creating the computer hand
    public static ArrayList computerHand() {
        setHands(computer, deck);
        computerHand = setHands(computer, deck);

        return computerHand;
    }
    //a method to assign the cards to the hands
    public static ArrayList setHands(ArrayList player, Deck deck) {
        for (int i = 0; i < 3; i++) {
            int playerCard = new Random().nextInt(deck.cards.size());
            player.add(deck.cards.get(playerCard));
            deck.cards.remove(playerCard);
        }
        return player;

    }
    //a method to check ranges
    public static int rangeChecker(int number, ArrayList<Card> playerOrComputer){

        if(number >= playerOrComputer.size()){
            number--;
        }

        else if (number == - 1){
            number++;
        }

        return number;

    }


}

