package head.first.state.pattern;

public class GumballMachine {
    private final int SOLD_OUT = 0;
    private final int NO_QUARTER = 1;
    private final int HAS_QUARTER = 2;
    private final int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;
    int soldCount = 0;

    public GumballMachine(int count) {
        this.count = count;
        // set inital state
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if(state == NO_QUARTER){
            System.out.println("Coin inserted...");
            state = HAS_QUARTER;
        } else {
            System.out.println("Coin cant be inserted as the state doesnt allow this");
        }

    }

    public void ejectQuarter(){
        if(state == HAS_QUARTER){
            state = NO_QUARTER;
            System.out.println("Please take the coin");
        } else {
            System.out.println("No coin inserted");
        }
    }

    public void dispense() {
        if(state == SOLD){
            System.out.println("WOW GUMBALL!!!");
            count--;
            if(count ==0 ){
                state = SOLD_OUT;
            } else{
                state = NO_QUARTER;
            }
        } else {
            System.out.println("Action not supported");
        }
    }

    public void trunc(){
        if(state == HAS_QUARTER){
            state = SOLD;
            if(soldCount==3){
                soldCount = 0;
                dispense();
            }
            state = SOLD;
            dispense();
            soldCount++;
        } else {
            System.out.println("Action not supported");
        }

    }


}
