package head.first.proxy.pattern.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final  long serialVersionUid = 1L;

    protected RemoteImpl() throws RemoteException {
    }

    public String sayHello() {
        return "Server say, Hi";
    }

    public static void main(String[] args) {
        try {
            RemoteImpl remoteService = new RemoteImpl();
            Naming.rebind("RemoteHello", remoteService);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

//    @Override
//    public String sayHello() throws RemoteException {
//        return "Server say, Hi";
//    }
}
