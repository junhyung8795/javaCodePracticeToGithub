package javaCodePractice.set;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        collection.set.MyHashSetV2 set = new collection.set.MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);
    }
}
