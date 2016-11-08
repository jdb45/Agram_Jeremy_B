package com.jeremy;

import java.util.*;

public class Deck {

    public ArrayList<Card> cards;
    public static Deck deck = new Deck();


    public Deck() {
        //assigning Char values to the card suits
        this.cards = new ArrayList<>();
        char spadeCh = 9824;
        char clubCh = 9827;
        char heartCh = 9829;
        char diamondCh = 9830;
        //setting the suit list
        Character[] suits = {diamondCh, heartCh, clubCh, spadeCh};
        Card card;
        //creating the deck by starting at 3 and going up to 11, which is the ACE
        for (char suit : suits) {
            for (int x = 3; x < 12; x++) {
                card = new Card(suit, x);
                //this will keep out the ace of spades
                if (!card.toString().equals("Ace of " + spadeCh)) {
                    this.cards.add(card);
                }
            }
        }

    }

}


