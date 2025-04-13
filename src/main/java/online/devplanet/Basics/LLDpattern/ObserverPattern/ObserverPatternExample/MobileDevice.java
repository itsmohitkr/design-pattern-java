package online.devplanet.Basics.LLDpattern.ObserverPattern.ObserverPatternExample;


class MobileDevice implements Observer {
    @Override
    public void update(float temp) {
        System.out.println("Temp on mobile is " + temp);
    }
}
