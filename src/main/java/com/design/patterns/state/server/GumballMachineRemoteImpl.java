package head.first.state.pattern.server;

import head.first.state.pattern.GumballMachine2;
import head.first.state.pattern.State;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineRemoteImpl  extends UnicastRemoteObject implements GumballMachineRemote {
    GumballMachine2 gumballMachine2;

    protected GumballMachineRemoteImpl(String location, int count) throws RemoteException {
        gumballMachine2 = new GumballMachine2(location, count);

    }

    @Override
    public int getCount() {
        return gumballMachine2.getCount();
    }

    @Override
    public String getLocation() {
        return gumballMachine2.getLocation();
    }

    @Override
    public State getState() {
        return gumballMachine2.getState();
    }
}
