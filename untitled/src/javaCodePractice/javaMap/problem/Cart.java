package javaCodePractice.javaMap.problem;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> cart = new HashMap<>();
    public void add(Product product, int i) {
//        for (Product product1 : cart.keySet()) {
//            if (product1.equals(product)) {
//                cart.put(product1, i+cart.get(product));
//                return;
//            }
//        }
        Integer count = cart.getOrDefault(product, 0);
        count += i;
        cart.put(product, count);
    }

    public void printAll() {
        System.out.println("전부 출력!");
        for (Product product : cart.keySet()) {
            System.out.println("quantity of " + product + " is " + cart.get(product));
        }
    }

    public void minus(Product product, int minusQuantity) {
//        for (Product product1 : cart.keySet()) {
//            if (product1.equals(product)){
//                cart.put(product,cart.get(product1) - minusQuantity);
//                if (cart.get(product)<=0){
//                    cart.remove(product1);
//                }
//                return;
//            }
//        }
        Integer existingQuantity = cart.getOrDefault(product, 0);
        Integer newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cart.remove(product);
        } else{
            cart.put(product, newQuantity);
        }
    }
}
