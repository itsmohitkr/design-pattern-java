package online.devplanet.Basics.LLDpattern.CommandPattern.GoodCode;

public class AirConditioner{

    boolean isOn;
    int temp;

    public void setTemp(int temp) {
        this.temp = temp;
        System.out.println("temp changed to : " + temp);
    }

    public void turnOnAC(){
        isOn=true;
        System.out.println("AC is on");
    }

    public void turnOffAC(){
        isOn=false;
        System.out.println("Ac is off");
    }


}