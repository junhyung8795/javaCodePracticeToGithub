package javaCodePractice.set;

import javaCodePractice.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        collection.set.MyHashSetV2 set = new collection.set.MyHashSetV2(10);
        Member hi = new Member("hi");
        Member lol = new Member("LOL");//대문자와 소문자는 해시 코드 다르다. 주의!
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("lol.hashCode() = " + lol.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());//음수 해시 코드를 가짐

        set.add(hi);
        set.add(lol);
        set.add(java);
        set.add(spring);//add는 내부의 hashIndex를 실행할때 해시 코드를 전부 절댓값으로 바꿔줌.
        System.out.println(set);

        //검색
        Member searchValue = new Member("LOL");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains("  + searchValue + ") = " + result);
    }
}
