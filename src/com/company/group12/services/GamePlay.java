package com.company.group12.services;

import com.company.group12.components.Player;

import java.util.List;

public class GamePlay {
    List<Player> players;
    List<String> cards;

    public GamePlay(List<Player> players, List<String> cards) {
        this.players = players;
        this.cards = cards;
    }

    public void dealCards() {
        for (Player player: players) {
            addAndRemoveCard(player);
            addAndRemoveCard(player);

        }
    }

    private void addAndRemoveCard(Player player) {
        player.addNewCard(cards.get(0));
        cards.remove(0);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void playGame() {
        for (Player player: players) {
            if (player.getCurrentScore() > 21) {
                System.out.println(player.getName() + " ====> Go Bust!!");
                System.out.println("----------------------------------------------------------");
                players.remove(player);
            }
            if (player.getCurrentScore() < 17) {
                while (player.getCurrentScore() < 17) {
                    System.out.println(player.getName() + " ====> Hit!! You will get dealt another card!");
                    System.out.println("------------------------------------------------------");
                    addAndRemoveCard(player);
                }
            }
            if (player.getCurrentScore() >= 17 && player.getCurrentScore() <= 21) {
                System.out.println(player.getName() + " ====> You don't get dealt another card!");
                System.out.println("---------------------------------------------------------");
            }
        }
    }
    public void getPlayerThatWon() {

    }
}
