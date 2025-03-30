package head.first.comound.pattern.oberserver;

import head.first.comound.pattern.Quackable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observerable implements QuackObservable{
    List<Observer> observers;
    QuackObservable duck;

    public Observerable(QuackObservable duck) {
        this.observers = new ArrayList<>();
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> observerIterator = observers.iterator();
        while (observerIterator.hasNext()){
            observerIterator.next().update(duck);
        }
    }
}
