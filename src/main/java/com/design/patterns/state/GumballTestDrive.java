package head.first.state.pattern;

public class GumballTestDrive {
    public static void main(String[] args) throws InterruptedException {
        GumballMachine machine = new GumballMachine(5);
        machine.insertQuarter();
        machine.trunc();

        System.out.println("-------------");

        machine.ejectQuarter();

        machine.insertQuarter();
        machine.ejectQuarter();
        GumballMachine2 gm2 = new GumballMachine2("INDRANA", 5);
        GumballMonitor gmm = new GumballMonitor(gm2);

        gm2.insertCoin();
        gm2.turnCrank();

        gmm.printReport();
        Thread.sleep(100000000);

        gm2.insertCoin();
        gmm.printReport();
        gm2.turnCrank();

        gmm.printReport();

    }
}
