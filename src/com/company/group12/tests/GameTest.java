package com.company.group12.tests;

import com.company.group12.components.Deck;
import com.company.group12.components.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Player player = new Player("Player", "1");

    @BeforeEach
    void setUp() {
        player.addNewCard("10 points QUEEN SPADE");
        player.addNewCard("5 points FIVE HEART");
    }
    @Test
    void generateExpectedNumberOfCards() {
        assertEquals(52, Deck.getCards().size());
    }

    @Test
    void checkIfCardsAreAssignedToPlayers() {
        assertEquals(2, player.getAssignedCards().size());
    }

    @Test
    void checkIfScoreIsComputedTheRightWay() {
        assertEquals(15, player.getCurrentScore());
    }

}