package javaCodePractice.superPackage;

public class SuperTestMain {
    public static void main(String[] args) {
        Engine miniEngine = new Engine("Machine", 500, "Genesis", 200, "8기통엔진", 40);
        System.out.println("Engine voltage = " + miniEngine.getVoltage());
        System.out.println("Engine name = " + miniEngine.name);

        System.out.println("-------------------");

        Car miniEngine2 = miniEngine;
        System.out.println("Car voltage = " + miniEngine2.getVoltage());
        System.out.println("Car name = " + miniEngine2.name);

        System.out.println("-------------------");

        Machine miniEngine3 = miniEngine;
        System.out.println("Machine Voltage = " + miniEngine3.getVoltage());
        System.out.println("Machine name = " + miniEngine3.name);

    }
}
