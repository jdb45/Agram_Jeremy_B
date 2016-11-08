package com.jeremy;

import java.util.ArrayList;

public class Tricks extends Computer{

    //a method to check who won the round
    public static boolean trickCheck(ArrayList<Card> computerHands, ArrayList<Card> hands){
        boolean check = true;
        //the try block is used to make sure the played doesn't play a card out of range
        try {
            //checks to see if the two card play equal the same suit
            if (computerHands.get(0).getSuit() == hands.get(0).getSuit()) {
                //if they do, than it checks to see which card is higher
                if (computerHands.get(0).getValue() > hands.get(0).getValue()) {
                    check = true;
                    hand.remove(0);
                    computerMove.remove(0);
                } else {
                    check = false;
                    hand.remove(0);
                    computerMove.remove(0);
                }

                //if the suits don't match, than it determines who the winner of the round is by checking the number
            } else if (number == 1) {
                check = true;
                hand.remove(0);
                computerMove.remove(0);

            } else if (number == 2) {
                check = false;
                hand.remove(0);
                computerMove.remove(0);

            } else {
                check = false;
                hand.remove(0);
                computerMove.remove(0);
            }
        }catch (IndexOutOfBoundsException exc){
            System.out.println("Please enter a number between 1 - ");
        }
        return check;

    }

}
