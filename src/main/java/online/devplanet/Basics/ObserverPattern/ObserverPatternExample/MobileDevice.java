package online.devplanet.Basics.ObserverPattern.ObserverPatternExample;


class MobileDevice implements Observer {
    @Override
    public void update(float temp) {
        System.out.println("Temp on mobile is " + temp);
    }
}
