package online.devplanet.Basics.LLDpattern.ObserverPattern.ObserverPatternExample;

interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
