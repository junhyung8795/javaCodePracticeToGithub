package javaCodePractice.superPackage;

public class Machine{
    private int voltage;
    public String name;

    public Machine(String name, int voltage) {
        this.name = name;
        this.voltage = voltage;
    }

    public int getVoltage() {
        return this.voltage;
    }


}
