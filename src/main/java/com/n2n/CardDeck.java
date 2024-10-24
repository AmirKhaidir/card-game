package com.n2n;

import static java.util.Map.entry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CardDeck {
    private final Map<String, Integer> DECK = Map.ofEntries(
        entry("2@", 1),
        entry("2#", 2),
        entry("2^", 3),
        entry("2*", 4),
        entry("3@", 5),
        entry("3#", 6),
        entry("3^", 7),
        entry("3*", 8),
        entry("4@",9),
        entry("4#", 10),
        entry("4^", 11),
        entry("4*", 12),
        entry("5@", 13),
        entry("5#", 14),
        entry("5^", 15),
        entry("5*", 16),
        entry("6@", 17),
        entry("6#", 18),
        entry("6^", 19),
        entry("6*", 20),
        entry("7@", 21),
        entry("7#", 22),
        entry("7^", 23),
        entry("7*", 24),
        entry("8@", 25),
        entry("8#", 26),
        entry("8^", 27),
        entry("8*", 28),
        entry("9@", 29),
        entry("9#", 30),
        entry("9^", 31),
        entry("9*", 32),
        entry("10@", 33),
        entry("10#", 34),
        entry("10^", 35),
        entry("10*", 36),
        entry("J@", 37),
        entry("J#", 38),
        entry("J^", 39),
        entry("J*", 40),
        entry("Q@", 41),
        entry("Q#", 42),
        entry("Q^", 43),
        entry("Q*", 44),
        entry("K@", 45),
        entry("K#", 46),
        entry("K^", 47),
        entry("K*", 48),
        entry("A@", 49),
        entry("A#", 50),
        entry("A^", 51),
        entry("A*", 52)
    );

    private final Map<Integer, String> DECK2 = Map.ofEntries(
        entry(1, "2@"),
        entry(2, "2#"),
        entry(3, "2^"),
        entry(4, "2*"),
        entry(5, "3@"),
        entry(6, "3#"),
        entry(7, "3^"),
        entry(8, "3*"),
        entry(9, "4@"),
        entry(10, "4#"),
        entry(11, "4^"),
        entry(12, "4*"),
        entry(13, "5@"),
        entry(14, "5#"),
        entry(15, "5^"),
        entry(16, "5*"),
        entry(17, "6@"),
        entry(18, "6#"),
        entry(19, "6^"),
        entry(20, "6*"),
        entry(21, "7@"),
        entry(22, "7#"),
        entry(23, "7^"),
        entry(24, "7*"),
        entry(25, "8@"),
        entry(26, "8#"),
        entry(27, "8^"),
        entry(28, "8*"),
        entry(29, "9@"),
        entry(30, "9#"),
        entry(31, "9^"),
        entry(32, "9*"),
        entry(33, "10@"),
        entry(34, "10#"),
        entry(35, "10^"),
        entry(36, "10*"),
        entry(37, "J@"),
        entry(38, "J#"),
        entry(39, "J^"),
        entry(40, "J*"),
        entry(41, "Q@"),
        entry(42, "Q#"),
        entry(43, "Q^"),
        entry(44, "Q*"),
        entry(45, "K@"),
        entry(46, "K#"),
        entry(47, "K^"),
        entry(48, "K*"),
        entry(49, "A@"),
        entry(50, "A#"),
        entry(51, "A^"),
        entry(52, "A*")
    );

    final List<String> DECK3 = Arrays.asList(
        "2@",
        "2#",
        "2^",
        "2*",
        "3@",
        "3#",
        "3^",
        "3*",
        "4@",
        "4#",
        "4^",
        "4*",
        "5@",
        "5#",
        "5^",
        "5*",
        "6@",
        "6#",
        "6^",
        "6*",
        "7@",
        "7#",
        "7^",
        "7*",
        "8@",
        "8#",
        "8^",
        "8*",
        "9@",
        "9#",
        "9^",
        "9*",
        "10@",
        "10#",
        "10^",
        "10*",
        "J@",
        "J#",
        "J^",
        "J*",
        "Q@",
        "Q#",
        "Q^",
        "Q*",
        "K@",
        "K#",
        "K^",
        "K*",
        "A@",
        "A#",
        "A^",
        "A*"
    );

    int noOfPlayer = 0;

    public CardDeck() { }

    public CardDeck(int noOfPlayer) {
        this.noOfPlayer = noOfPlayer;
    }

    public Map<String, Integer> shuffle() {
        // Maintain the order of insert
        Map<String, Integer> shuffledDeck = new LinkedHashMap<String, Integer>();
        List<String> deckPointer = new ArrayList<String>(DECK3);

        int size = DECK.size();
        Random random = new Random();
        int randomPointer;
        String card;

        for (int i = 0;i < size;i++) {
            randomPointer = random.nextInt(deckPointer.size());
            card = deckPointer.get(randomPointer);
            shuffledDeck.put(card, DECK.get(card));
            deckPointer.remove(randomPointer);
        }

        System.out.println("Deck shuffled result: " + shuffledDeck.toString());
        System.out.println("shuffledDeck size: " + shuffledDeck.size());

        return shuffledDeck;
    }

    public Map<Integer, List<String>> deal(Map<String, Integer> cards) {
        System.out.println("deal cards: " + cards);
        int currentPlayer = 0;
        Map<Integer, List<String>> results = new HashMap<Integer, List<String>>();
        Map<String, String> result = new HashMap<String, String>();

        for (Map.Entry<String, Integer> card: cards.entrySet()) {
            result.put(card.getKey(), String.valueOf(currentPlayer));
            currentPlayer++;
            // reset to the first player
            if (currentPlayer == noOfPlayer) {
                currentPlayer = 0;
            }

        }

        for (int player = 0;player < noOfPlayer;player++) {
            List<String> playerCards = new ArrayList<String>();
            for (Map.Entry<String, String> entry: result.entrySet()) {
                if (entry.getValue().equals(String.valueOf(player))) {
                    playerCards.add(entry.getKey());
                }
            }

            results.put(player + 1, playerCards);
        }
        System.out.println("result size: " + result.size());
        System.out.println("deal result: " + result);

        for(Map.Entry<Integer, List<String>> player: results.entrySet()) {
            System.out.println("Player " + player.getKey() + " with cards => " + player.getValue());
        }

        return results;
    }
}
