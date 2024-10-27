package com.n2n;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck(4);

        Map<String, Integer> shuffledDeck = deck.shuffle();
        Map<Integer, List<Integer>> dealedCards = deck.deal(shuffledDeck);
        Map<Integer, List<String>> playerCards = deck.arrange(dealedCards);
        deck.winner(playerCards);
    }
}