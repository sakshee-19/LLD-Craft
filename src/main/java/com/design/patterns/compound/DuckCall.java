package head.first.comound.pattern;

import head.first.comound.pattern.oberserver.Observer;
import head.first.comound.pattern.oberserver.Observerable;

public class DuckCall implements Quackable{
    private Observerable observerable;

    public DuckCall() {
        observerable = new Observerable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak!!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observerable.notifyObservers();
    }
}
