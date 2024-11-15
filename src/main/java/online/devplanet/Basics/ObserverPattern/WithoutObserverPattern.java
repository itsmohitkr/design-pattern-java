package online.devplanet.Basics.ObserverPattern;

class DisplayDevice {
    private String device;

    public DisplayDevice(String device){
        this.device=device;
    }
    public void showTemp(float temp){
        System.out.println(" current temp on "+ device + " is " + temp + " C.");
    }
}


class WeatherStation{
    private float temperature;

    private DisplayDevice displayDevice;

    public WeatherStation(DisplayDevice device){
        this.displayDevice=device;
    }

    public void setTemperature(float temp){
        this.temperature=temp;
        displayDevice.showTemp(temp);
    }
}


public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice device = new DisplayDevice("device A");
        WeatherStation weatherStation = new WeatherStation(device);

        weatherStation.setTemperature(33);
        weatherStation.setTemperature(35);

    }
}
