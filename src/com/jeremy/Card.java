package com.jeremy;

public class Card
{
    private char suit;
    private int value;


    //assigning values to the card method
    public Card(char suit, int value)
    {
        this.suit = suit;
        this.value = value;
    }
    //getters for both the value and suit
    public int getValue() {
        return value;
    }

    public char getSuit() {
        return suit;
    }
    //toString method to display the cards
    public String toString()
    {
        if (this.value != 11)
        {
            return this.value + " of " + this.suit;
        }

        else
        {
            return "Ace of " + this.suit;
        }
    }
}