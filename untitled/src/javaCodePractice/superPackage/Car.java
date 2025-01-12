package javaCodePractice.superPackage;

public class Car extends Machine{
    private int voltage;
    public String name;

    public Car(String machineName, int machineVoltage, String carName, int carVoltage) {
        super(machineName, machineVoltage);
        this.name = carName;
        this.voltage = carVoltage;
    }

    @Override
    public int getVoltage() {
        System.out.println("Car에서 호출된 Machine의 voltage = " + super.getVoltage());
        return this.voltage;
    }

}
