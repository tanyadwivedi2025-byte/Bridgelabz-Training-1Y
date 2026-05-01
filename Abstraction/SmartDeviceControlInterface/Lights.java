package SmartDeviceControlInterface;

public class Lights implements Function{
    @Override
    public void turnOn(){
        System.out.println("Lights are turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("Lights are turned off");
    }
}