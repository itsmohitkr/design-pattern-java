package online.devplanet.Basics.ObserverPattern.ObserverPatternExample;

public class Main {

    public static void main(String[] args) {
        //Create a Publisher
        WeatherStationIN weatherStationIn = new WeatherStationIN();

        //Create subscribers
        DisplayDeviceIn device = new DisplayDeviceIn("SamsungLCD");

        MobileDevice mobileDevice = new MobileDevice();

        //Attach
        weatherStationIn.attach(device);
        weatherStationIn.attach(mobileDevice);

        //Set Temp
        weatherStationIn.setTemperature(25);

        //Detach
        weatherStationIn.detach(mobileDevice);

        weatherStationIn.setTemperature(26);

    }

}

