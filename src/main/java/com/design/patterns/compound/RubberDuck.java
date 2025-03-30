package head.first.comound.pattern;

import head.first.comound.pattern.oberserver.Observer;
import head.first.comound.pattern.oberserver.Observerable;

public class RubberDuck implements Quackable{
    private Observerable observerable;

    public RubberDuck() {
        observerable = new Observerable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak!!");
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
