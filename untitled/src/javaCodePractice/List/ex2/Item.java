package javaCodePractice.List.ex2;

public class Item {
    private String name;
    private int price;
    private int quantity;
    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public int getTotalPrice(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "상품명=" + name +
                ", 합계=" + getTotalPrice() +
                '}';
    }
}
