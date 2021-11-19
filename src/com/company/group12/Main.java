package com.company.group12;

import com.company.group12.components.Deck;
import com.company.group12.components.Player;
import com.company.group12.services.GamePlay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int counter = 0;
        int numberOfPlayers;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
            numberOfPlayers = scanner.nextInt();

        if (numberOfPlayers <= 1 || numberOfPlayers > 6) {
            System.out.println("Number of players should be more than 1 and must not exceed 6");
        } else {
            List<Player> playerList = new ArrayList<>();
            String nameInput;
            while (counter < numberOfPlayers) {
                System.out.print("Enter the name of a player: ");
                nameInput = scanner.next();
                playerList.add(new Player(nameInput, String.valueOf(counter)));
                counter++;
            }

            GamePlay gamePlay = new GamePlay(playerList, Deck.getCards());
            gamePlay.dealCards();
            gamePlay.playGame();
            gamePlay.gameWonCheck();
        }



    }
}
