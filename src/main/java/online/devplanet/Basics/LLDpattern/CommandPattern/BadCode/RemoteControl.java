package online.devplanet.Basics.LLDpattern.CommandPattern.BadCode;

public class RemoteControl{

    public AirConditioner airConditioner;
    // will have some button and attach some functionality
    public RemoteControl(AirConditioner ac){
        this.airConditioner=ac;
    }

    public void pressOnButton(){
        airConditioner.turnOnAC();

    }

    public void pressOffButton(){
        airConditioner.turnOffAC();
    }

    public void setTemp(int temp){
        airConditioner.setTemp(temp);
    }
}
