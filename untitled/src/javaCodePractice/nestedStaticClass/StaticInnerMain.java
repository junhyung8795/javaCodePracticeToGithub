package javaCodePractice.nestedStaticClass;

public class StaticInnerMain {
    public static void main(String[] args) {
        StaticInner staticInner = new StaticInner();
        StaticInner staticInner1 = new StaticInner();
        staticInner.display();
        staticInner1.display();
        StaticInner.date2 = 5;
        staticInner.display();
        staticInner1.display();

    }
}
