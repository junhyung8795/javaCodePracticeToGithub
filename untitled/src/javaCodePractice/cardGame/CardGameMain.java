package javaCodePractice.cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        Integer player1Score = 0;
        Integer player2Score = 0;
        for (int i = 1; i < 14; i++) {
            cards.add(new Card(i, KindOfCard.SPADE));
            cards.add(new Card(i, KindOfCard.CLUB));
            cards.add(new Card(i, KindOfCard.DIAMOND));
            cards.add(new Card(i, KindOfCard.HEART));
        }
        System.out.println("cards = " + cards);
        System.out.println("cards.size() = " + cards.size());
        Collections.shuffle(cards);
        System.out.println("cards = " + cards);
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            player1.add(cards.removeFirst());
        }
        for (int i = 0; i < 5; i++) {
            player2.add(cards.removeFirst());
        }
        System.out.println("player2 = " + player2);
        System.out.println("player1 = " + player1);
        player1.sort(null);
        player2.sort(null);
        System.out.println("플레이어1의 카드 = " + player1);
        System.out.println("플레이어2의 카드 = " + player2);
        for (Card card : player1) {
            player1Score += card.getNumber();
        }
        for (Card card : player2) {
            player2Score += card.getNumber();
        }
        if (player1Score > player2Score) {
            System.out.println("플레이어 1 승리!");
        } else if (player1Score < player2Score) {
            System.out.println("플레이어 2 승리!");
        } else{
            System.out.println("무승부!");
        }


    }
}
