package com.company.group12.tests;

import com.company.group12.components.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void generateExpectedNumberOfCards() {
        assertEquals(52, Deck.getCards().size());
    }

}