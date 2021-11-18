package com.company.group12.components;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<String> assignedCards;
    private final String name;
    private final String id;


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Player(String name, String id) {
        this.assignedCards = new ArrayList<>();
        this.name = name;
        this.id = id;
    }

    public List<String> getAssignedCards() {
        return assignedCards;
    }

    public void addNewCard(String card) {
        this.assignedCards.add(card);
    }



    public int getCurrentScore() {
        return assignedCards.stream()
                .map(assignedCard -> assignedCard.split(" "))
                .mapToInt(arr -> Integer.parseInt(arr[0])).sum();
    }
}
