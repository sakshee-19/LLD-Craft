package head.first.state.pattern.server;

public class GumballMonitor {
    GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine Location: "+ gumballMachineRemote.getLocation());
            System.out.println("Gumball Current Inventory: "+ gumballMachineRemote.getCount()+" gumballs");
            System.out.println("Gumball Current State:  "+ gumballMachineRemote.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
