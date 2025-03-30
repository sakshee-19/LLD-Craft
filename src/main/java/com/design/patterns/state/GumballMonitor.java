package head.first.state.pattern;

public class GumballMonitor {
    GumballMachine2 gumballMachine2;

    public GumballMonitor(GumballMachine2 gumballMachine2) {
        this.gumballMachine2 = gumballMachine2;
    }

    public void printReport(){
        System.out.println("\n\n***** REPORT *********");
        System.out.println("location: "+gumballMachine2.getLocation());
        System.out.println("State: "+gumballMachine2.getState().getName());
        System.out.println("count: "+ gumballMachine2.getCount()+" gumballs\n------\n");
    }
}
