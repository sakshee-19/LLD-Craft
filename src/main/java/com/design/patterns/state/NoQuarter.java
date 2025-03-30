package head.first.state.pattern;

public class NoQuarter implements State{
    private transient GumballMachine2 gumballMachine;

    public NoQuarter(GumballMachine2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin is inserted");
        gumballMachine.setState(gumballMachine.hasQuarterState);
    }

    @Override
    public void ejectCoin() {
        System.out.println("No Coin Found");
    }

    @Override
    public void dispense() {
        System.out.println("No Coin found");
    }

    @Override
    public void turnCrank() {
        System.out.println("No Coin found");
    }

    @Override
    public String getName() {
        return "No_Quarter";

    }
}
