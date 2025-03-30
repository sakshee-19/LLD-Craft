package head.first.state.pattern.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GMMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = { "rmi://localhost/gumballmachine"};

        GumballMonitor[] monitor = new GumballMonitor[1];

        try {
            GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup(location[0]); // looking for server skeleton
            monitor[0] =  new GumballMonitor(gumballMachineRemote);
            System.out.println(monitor[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        monitor[0].report();
    }
}
