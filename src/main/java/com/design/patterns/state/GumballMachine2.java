package head.first.state.pattern;

public class GumballMachine2 {
    State soldOutState; // now holds state object not int
    State soldState;
    State hasQuarterState;
    State noQuarterState;

    State state;
    private String location;
    int count;

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public GumballMachine2(String location, int gumballs) {
        this.count = gumballs;
        this.location = location;

        soldOutState = new SoldOut(this);
        soldState = new Sold(this);
        hasQuarterState = new HasQuarter(this);
        noQuarterState = new NoQuarter(this);

        if(gumballs>0){
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void setState(State state){
        this.state = state;
    }

    public void insertCoin(){
        this.state.insertCoin();
    }

    public void ejectCoin(){
        this.state.ejectCoin();
    }

    public void turnCrank(){
        this.state.turnCrank();
        this.state.dispense();
    }
}
