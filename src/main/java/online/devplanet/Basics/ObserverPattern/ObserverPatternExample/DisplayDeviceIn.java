package online.devplanet.Basics.ObserverPattern.ObserverPatternExample;

class DisplayDeviceIn implements Observer {

    private String name;

    public DisplayDeviceIn(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temp on " + name + " device is " + temp);
    }
}
