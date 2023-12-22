package com.day7.objectorientedprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards() {
        deck = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    private void shuffleDeck() {
        long seed = System.nanoTime(); // Use nanoTime as the seed for randomness
        Collections.shuffle(deck, new Random(seed));
    }

    public void distributeCards(int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.size()) {
            System.out.println("Not enough cards in the deck for distribution.");
            return;
        }

        Card[][] playerCards = new Card[numPlayers][cardsPerPlayer];

        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < numPlayers; j++) {
                playerCards[j][i] = deck.remove(0);
            }
        }

        printPlayerCards(playerCards);
    }

    private void printPlayerCards(Card[][] playerCards) {
        System.out.println("Cards received by the Players:");
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.distributeCards(4, 9);
    }
}

