package head.first.state.pattern;

public class Sold implements State{
    private transient GumballMachine2 gumballMachine;

    public Sold(GumballMachine2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Your Gumball in process Please wait");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Your Gumball in process.. Action Not allowed");
    }

    @Override
    public void dispense() {
        System.out.println("Your gumball on the way");
        gumballMachine.count--;
        if(gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.noQuarterState);
        } else {
            gumballMachine.setState(gumballMachine.soldOutState);
        }
    }

    @Override
    public void turnCrank() {
        System.out.println("Your Gumball in process Please wait");
    }

    @Override
    public String getName() {
        return "SOLD";

    }
}
