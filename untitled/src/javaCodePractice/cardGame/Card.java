package javaCodePractice.cardGame;

public class Card implements Comparable<Card> {
    private int number;
    private KindOfCard kindOfCard;

    public Card(int number, KindOfCard kindOfCard) {
        this.number = number;
        this.kindOfCard = kindOfCard;
    }

    @Override
    public int compareTo(Card o) {
        return this.number < o.getNumber() ? -1 : (this.number == o.getNumber() ? (this.kindOfCard.getRank() < o.kindOfCard.getRank() ? -1 : (this.kindOfCard.getRank() == o.kindOfCard.getRank() ? 0 : 1)) : 1);
    }

    public int getNumber() {
        return number;
    }
    public KindOfCard getKindOfCard() {
        return kindOfCard;
    }

    @Override
    public String toString() {
        return String.valueOf(number) + kindOfCard;
    }
}
