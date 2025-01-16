package javaCodePractice.nestedStaticClass;

public class StaticInner {
    public Node node = new Node();
    private static class Node{
        int data = 4;
    }

    public static int date2 = 4;



    public void display() {
        System.out.println("node.data = " + node.data);
        System.out.println("node = " + node);
        System.out.println("date2 = " + date2);
    }
}
