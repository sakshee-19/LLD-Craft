package head.first.comound.pattern;

import head.first.comound.pattern.oberserver.Observer;
import head.first.comound.pattern.oberserver.Observerable;

public class MallardDuck implements Quackable {
    private Observerable observerable;

    public MallardDuck() {
        this.observerable = new Observerable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack!!");
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
