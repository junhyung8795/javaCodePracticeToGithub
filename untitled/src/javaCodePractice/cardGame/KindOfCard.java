package javaCodePractice.cardGame;

public enum KindOfCard {
    HEART("(\u2665)",2),SPADE("(\u2660)", 1),CLUB("(\u2663)",4),DIAMOND("(\u2666)",3);

    private int rank;
    private final String name;
    private KindOfCard(String name, int rank){
        this.name = name;
        this.rank = rank;
    }
    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return name;
    }
}
