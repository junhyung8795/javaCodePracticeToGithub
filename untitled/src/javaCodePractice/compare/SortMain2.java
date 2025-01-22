package javaCodePractice.compare;

import java.util.Arrays;
import java.util.Comparator;

public class  SortMain2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 2, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println("오름차 comparator 적용");
        Arrays.sort(arr, new AscComparator());
        System.out.println(Arrays.toString(arr));

        System.out.println("내림자 comparator 적용");
        Arrays.sort(arr, new DescComparator());
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new AscComparator().reversed());
        System.out.println(Arrays.toString(arr));
    }
    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 = " + o2);
            return ((o1 < o2) ? -1 : (o1 > o2) ? 1 : 0) * -1;
        }
    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 = " + o2);
            return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;
        }
    }
}
