package com.company.group12;

import com.company.group12.components.Deck;
import com.company.group12.components.Player;
import com.company.group12.services.GamePlay;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("James Law", "1");
        Player player2 = new Player("Jimmy Woo", "2");
        Player player3 = new Player("Michael Black", "3");

        List<Player> threePlayers = new ArrayList<>();
        threePlayers.add(player1);
        threePlayers.add(player2);
        threePlayers.add(player3);

        GamePlay gamePlay = new GamePlay(threePlayers, Deck.getCards());
        gamePlay.dealCards();
        gamePlay.playGame();
        gamePlay.gameWonCheck();

//        for (Player p: deck.getPlayers()) {
//            System.out.println(p.getAssignedCards());
//            System.out.println(p.getCurrentScore());
//        }





    }
}
