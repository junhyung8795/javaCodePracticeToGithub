package javaCodePractice.ListPracticePackage.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> list = new ArrayList<>();
//    List<Item> list;
//    public ShoppingCart(List<Item> list) {
//        this.list = list;
//    }
    //위코드는 생성자 호출할 때 내부에 링크드 리스트 혹은 배열 리스트 둘다 쓸 수 있게끔하기 위해 만듬

    public void addItem(Item item) {
        list.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : list) {
            System.out.println(item);
        }
        int total = 0;
        for (Item item : list){
            total += item.getTotalPrice();
        }
        System.out.println("전체 가격 합: " + total);
    }
}
