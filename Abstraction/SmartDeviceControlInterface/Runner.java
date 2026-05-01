package SmartDeviceControlInterface;

public class Runner {
    public static void main(String[] args){
        Function l1=new Lights();
        Function ac1=new AC();
        Function tv1=new Function() {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        };
        System.out.println("-----Function of Lights-----");
        l1.turnOn();
        l1.turnOff();
        System.out.println("-----Function of Tv-----");
        tv1.turnOn();
        tv1.turnOff();
        System.out.println("-----Function of Ac-----");
        ac1.turnOn();
        ac1.turnOff();
    }
}