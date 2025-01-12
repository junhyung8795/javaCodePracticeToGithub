package javaCodePractice.superPackage;

public class Engine extends Car{
    private int voltage;
    public String name;

    public Engine(String machineName, int machineVoltage, String carName, int carVoltage, String engineName, int engineVoltage) {
        super(machineName, machineVoltage, carName, carVoltage);
        this.voltage = engineVoltage;
        this.name = engineName;
    }

    public int getVoltage(){
        System.out.println("Engine에서 호출된 Car의 voltage = " + super.getVoltage());
        return this.voltage;
    }


}
