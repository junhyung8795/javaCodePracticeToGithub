package javaCodePractice.set;

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
    }
}
