package online.devplanet.Basics.ObserverPattern.ObserverPatternExample;

interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
