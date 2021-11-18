package com.company.group12.tests;

import com.company.group12.components.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void generateExpectedNumberOfCards() {
        assertEquals(52, Card.getCards().size());
    }

}