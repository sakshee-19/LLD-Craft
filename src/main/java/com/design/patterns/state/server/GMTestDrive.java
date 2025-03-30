package head.first.state.pattern.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GMTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote;
        int count;

        if(args.length < 2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachineRemote = new GumballMachineRemoteImpl(args[0], count);
            Naming.rebind("//"+args[0]+"/gumballmachine", gumballMachineRemote);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
