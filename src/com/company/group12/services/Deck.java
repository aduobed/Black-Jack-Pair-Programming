package com.company.group12.services;

import com.company.group12.components.Player;

import java.util.List;

public class Deck {
    List<Player> players;
    List<String> cards;

    public Deck(List<Player> players, List<String> cards) {
        this.players = players;
        this.cards = cards;
    }

    public void dealCards() {
        for (Player player: players) {
            player.addNewCard(cards.get(0));
            cards.remove(0);
            player.addNewCard(cards.get(0));
            cards.remove(0);
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void getPlayerThatWon() {

    }
}
