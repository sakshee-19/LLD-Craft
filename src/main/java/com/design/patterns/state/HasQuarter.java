package head.first.state.pattern;

public class HasQuarter implements State {

    private transient GumballMachine2 gumballMachine;

    public HasQuarter(GumballMachine2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin is already inserted, rejecting the coin");

    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin is ejected, Please collect");
        gumballMachine.setState(gumballMachine.noQuarterState);
        // change state

    }

    @Override
    public void dispense() {
        System.out.println("This is not supported , kindly turn crank first");

    }

    @Override
    public void turnCrank() {
        System.out.println("Turn Crank Success!!");
        gumballMachine.setState(gumballMachine.soldState);
    }

    @Override
    public String getName() {
        return "Has_Quarter";

    }
}
