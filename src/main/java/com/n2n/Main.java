package com.n2n;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, List<String>> playerCards;
        Map<Integer, List<Integer>> dealedCards;
        CardDeck deck = new CardDeck(4);

        Map<String, Integer> shuffledDeck = deck.shuffle();
        dealedCards = deck.deal(shuffledDeck);
        playerCards = deck.arrange(dealedCards);
        deck.winner(playerCards);
    }
}