package javaCodePractice.set;

import javaCodePractice.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 hashCode()는 참조값을 기반으로 만듬
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);//이놈은 16진수 상태인데, 10진수로 바꾸면 ob2.hashCode()값이된다.
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        //각 클래스마다 hashCode를 이미 오버라이딩 해놨다.
        Integer i = 25;
        String strA = "A";
        String strAB = "AB";
        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("\"AB\".hashCode() = " + strAB.hashCode());

        //hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("Integer.valueOf(-1) = " + Integer.valueOf(-1));

        //둘은 같은가..? 인스턴스만 다르지 id값이 같으니 equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode()를 오버라이딩 한 것과 안 한 경우 비교
        System.out.println("member1 == member2 => " + (member1 == member2));//동일성은 다름
        System.out.println("member1.equals(member2) = " + member1.equals(member2));//동등성은 같음
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());//오버라이딩 해놔서 equals랑 .hashCode가 id를 기준으로 같으면 같다고 나옴
        //만약 해시코드를 오버라이딩 하지 않았으면 해시 코드가 참조값을 기준으로 만들어져서 두 인스턴스가 다른 해시 코드를 가졌을 것이다.
    }
}
