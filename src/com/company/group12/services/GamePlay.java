package com.company.group12.services;

import com.company.group12.components.Player;

import java.util.ArrayList;
import java.util.List;

public class GamePlay {
    List<Player> players;
    List<String> cards;

    public GamePlay(List<Player> players, List<String> cards) {
        this.players = players;
        this.cards = cards;
    }

    public void dealCards() {
        for (Player player : players) {
            addAndRemoveCard(player);
            addAndRemoveCard(player);
        }
    }

    private void addAndRemoveCard(Player player) {
//        System.out.println(cards.get(0));
        player.addNewCard(cards.get(0));
        cards.remove(0);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void playGame() {
        List<Player> toRemove = new ArrayList<>();
        for (Player player : players) {
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

            if (player.getCurrentScore() > 21) {
                System.out.println(player.getName() + " ====> Go Bust!!");
                System.out.println("----------------------------------------------------------");
                toRemove.add(player);
            }
        }
        players.removeAll(toRemove);
    }

    private void getWinnerByDefault(){
        Player player = players.get(0);
        System.out.println();
        System.out.println();
        System.out.println("**********************");
        System.out.println(player.getName() + " has Won by " + player.getCurrentScore() + " points");
    }

    private void getWinnerByExact21(Player player) {
        System.out.println();
        System.out.println();
        System.out.println("=================================");
        System.out.println(player.getName() + " has Won by " + player.getCurrentScore() + " points");
    }

    public void gameWonCheck() {
        boolean check = true;
        if (players.size() == 1) {
            getWinnerByDefault();
            check = false;
        } else {
            players.stream().filter(player -> player.getCurrentScore() == 21)
                    .findFirst().ifPresent(this::getWinnerByExact21);
            check=false;
        }
        if (!check && players.size() >= 2) {
            int max = players.stream().mapToInt(Player::getCurrentScore).max().orElse(0);
            Player player = players.stream().filter(p -> p.getCurrentScore() == max).findFirst().orElse(null);
            System.out.println("#####################################################");
            assert player != null;
            System.out.println(player.getName() + " has Won by " + player.getCurrentScore() + " points");

        }


    }
}
