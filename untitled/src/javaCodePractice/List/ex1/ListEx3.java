package javaCodePractice.List.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요! (종료는 0누르기)");
        while (true){
            int integer = sc.nextInt();
            if (integer == 0) {
                int total = 0;
                for (int i = 0; i < list.size(); i++) {
                    total += list.get(i);
                }

                System.out.println("입력한 정수의 합: " + total);
                double average = (double) total / list.size();
                System.out.println("입력한 정수의 평균: " + average);
                break;
            } else {
                list.add(integer);
            }
        }



    }
}
