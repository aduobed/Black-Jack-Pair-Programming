package com.company.group12;

import com.company.group12.components.Card;
import com.company.group12.components.Player;
import com.company.group12.services.Deck;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("James Law", "1");
        Player player2 = new Player("Jimmy Woo", "2");
        Player player3 = new Player("Michael Black", "3");

        Deck deck = new Deck(List.of(player1, player2, player3), Card.getCards());
        deck.dealCards();

//        for (Player p: deck.getPlayers()) {
//////            System.out.println(p.getAssignedCards());
////            System.out.println(p.getCurrentScore());
////        }



    }
}
