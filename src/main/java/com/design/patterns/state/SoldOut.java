package head.first.state.pattern;

public class SoldOut implements State{
    private transient GumballMachine2 gumballMachine;

    public SoldOut(GumballMachine2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Out of Order");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Out of Order");
    }

    @Override
    public void dispense() {
        System.out.println("Out of Order");
    }

    @Override
    public void turnCrank() {
        System.out.println("Out of Order");
    }

    @Override
    public String getName() {
        return "SOLD_OUT";

    }
}
