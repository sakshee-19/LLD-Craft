package head.first.comound.pattern;

import head.first.comound.pattern.oberserver.Observer;

public class QuackableCounter implements Quackable{

    Quackable duck;
    static int quackCount = 0;

    public QuackableCounter(Quackable duck) {
        this.duck = duck;

    }

    @Override
    public void quack() {
        this.duck.quack();
        quackCount++;
    }

    public static int getQuackCount() {
        System.out.println("No of Quack: "+quackCount);
        return quackCount;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
