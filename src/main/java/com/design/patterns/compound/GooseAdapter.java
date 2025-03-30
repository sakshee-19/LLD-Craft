package head.first.comound.pattern;

import head.first.comound.pattern.oberserver.Observer;
import head.first.comound.pattern.oberserver.Observerable;

public class GooseAdapter implements Quackable {
    private Observerable observerable;
    private Goose goose;



    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observerable = new Observerable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
