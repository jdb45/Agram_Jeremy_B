package com.jeremy;

import java.util.ArrayList;


public class Agram extends Tricks{

    public static void main(String[] args)
    {

        ArrayList<Card> player;
        ArrayList<Card> computer;
        player = playerHand();
        computer = computerHand();
        boolean check;

        System.out.println("Welcome to Agram \n");
        System.out.println("Rules: \n");
        System.out.println("The kings, queens, jacks, 2s of all suits and the ace of spades are removed from the deck. \nThe cards of each suit rank, from high to low: A, 10, 9, 8, 7, 6, 5, 4, 3. \nBecause the ace of spades is removed from the deck, the highest card in the spade suit is the 10.\n" +
                "The player to the left of the dealer leads with a card of their choice. \nThe next player to the left then follows with their card. If possible they MUST follow suit. \nHowever, if they cannot, they may play a card of any suit. \nIf the card played does not belong to the original suit, it has no value. " +
                "\nAfter all players have played their card, the player who has the highest card of the original suit of the leading card of the round wins the trick. \n" +
                "The winner of the trick leads any card from their hand to begin the next trick, playing it face up on top of the pile. \nOnce again, the other players must each play a card of the same suit as the card that was led, if possible. " +
                "Otherwise they may play any card. " +
                "\nThis continues until six tricks have been played. Whoever wins the sixth and last trick wins the game \n");

        //assigning the player and computer cards from the deck
        playerTurn(player);
        computerTurnAfter(computer);

        //do while loop to keep the game going as long has there are cards in the players hand
        do {
            check = trickCheck(computerMove, hand);
            if(check){
                number = 1;
                computerTurnBefore(computer);
                playerTurnAfter(player);
            }
            else{
                number = 2;
                playerTurn(player);
                computerTurnAfter(computer);
            }

        }while (player.size() != 0 & computer.size() != 0);

        // if check is true computer wins, check will only be true is computer wins a round
        if(check){
            System.out.println("Computer Wins! :(");
        }

        else{
            System.out.println("You Win! :)");
        }

    }

}