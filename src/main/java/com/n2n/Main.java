package com.n2n;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck(4);

        Map<String, Integer> shuffledDeck = deck.shuffle();
        deck.deal(shuffledDeck);
    }
}