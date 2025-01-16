package javaCodePractice.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //문자 char
        char a = 'A';
        char b = 'B';
        System.out.println("(int) a = " + (int) a);
        System.out.println("(int) b = " + (int) b);

        //hashCode
        System.out.println();
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));
    }

    static int hashCode(String str ){
        char[] charArray = str.toCharArray();//char를 이용하면 int로 캐스팅해서 쉽게 아
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum += (int) charArray[i];//각 문자들을 int로 캐스팅한 수 들을 더한 것을 해당 문자열의 해쉬코드라고 치자.
        }
        return sum;
    }
}

