package head.first.comound.pattern;

public class DuckCountingFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackableCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedDuck() {
        return new QuackableCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackableCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackableCounter(new RubberDuck());
    }

    @Override
    public Quackable createGooseDuck() {
        return new QuackableCounter(new GooseAdapter(new Goose()));
    }
}
