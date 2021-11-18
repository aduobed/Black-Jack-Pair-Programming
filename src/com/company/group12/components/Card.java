package com.company.group12.components;

import com.company.group12.enums.Suits;
import com.company.group12.enums.Values;

import java.util.*;

public class Card {

    private static final List<String> cards = new ArrayList<>();


    private static void generateCards() {
        for(Suits suit: Suits.values()) {
            Arrays.stream(Values.values()).forEach(value -> cards.add(value.getPoint()+ " points " + value.name() + " of " +  suit.name()));
        }
    }

    private static void shuffleCards() {
        Collections.shuffle(cards, new Random((System.nanoTime())));
    }


    public static List<String> getCards() {
        generateCards();
        shuffleCards();
        return cards;
    }
}
