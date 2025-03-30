package head.first.comound.pattern;

import head.first.comound.pattern.oberserver.Observer;
import head.first.comound.pattern.oberserver.Observerable;
import head.first.comound.pattern.oberserver.QuackObservable;
import head.first.comound.pattern.oberserver.Quackologist;
import head.first.comound.pattern.oberserver.Quackologist2;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
        AbstractDuckFactory duckFactory = new DuckCountingFactory();
        System.out.println("with factory");
        duckSimulator.simulate(duckFactory);

    }


    public void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallard = duckFactory.createMallardDuck();
        Quackable redHead = duckFactory.createRedDuck();
        Quackable duckcall = duckFactory.createDuckCall();
        Quackable rubber = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseDuck();

        Flock flock = new Flock();
        flock.add(mallard);
        flock.add(redHead);
        flock.add(duckcall);
        flock.add(rubber);
        flock.add(gooseDuck);

        Quackologist q1 = new Quackologist();
        Observer q2 = new Quackologist2();
        flock.registerObserver(q1);
        rubber.registerObserver(q2);

        System.out.println("with flock ---------------");
        simulate(flock); // nothing needs to change as flock is quackable
        System.out.println("done with flock --------------");


//        simulate(mallard);
//        simulate(redHead);
        QuackableCounter.getQuackCount();
//        simulate(duckcall);
//        simulate(rubber);
        QuackableCounter.getQuackCount();
//        simulate(duckcall);
//        simulate(gooseDuck);
//        simulate(gooseDuck);
        QuackableCounter.getQuackCount();


    }

    public void simulate(){
        Quackable mallard = new QuackableCounter(new MallardDuck()); // using decorator pattern to count all quacks
        Quackable redHead = new QuackableCounter( new RedHeadDuck());
        Quackable duckcall = new QuackableCounter( new DuckCall());
        Quackable rubber = new QuackableCounter(new RubberDuck());
//        Quackable mallard = new MallardDuck();
//        Quackable redHead = new RedHeadDuck();
//        Quackable duckcall = new DuckCall();
//        Quackable rubber = new RubberDuck();
        Goose goose = new Goose();
        Quackable gooseDuck = new QuackableCounter(new GooseAdapter(goose));

        System.out.println("Duck Simulator: With Goose Adapter");

        simulate(mallard);
        simulate(redHead);
        QuackableCounter.getQuackCount();
        simulate(duckcall);
        simulate(rubber);
        QuackableCounter.getQuackCount();
        simulate(duckcall);
        simulate(gooseDuck);
        simulate(gooseDuck);
        QuackableCounter.getQuackCount();

    }

    public void simulate(Quackable quackable){
        quackable.quack();
    }

}
