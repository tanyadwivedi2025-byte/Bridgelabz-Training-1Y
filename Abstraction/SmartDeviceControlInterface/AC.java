package SmartDeviceControlInterface;

public class AC implements Function{
    @Override
    public void turnOn(){
        System.out.println("AC is turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("AC is turned off");
    }
}