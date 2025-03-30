package head.first.proxy.pattern.remote;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go(){
        try{
            MyRemote remoteService = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = remoteService.sayHello();
            System.out.println(s);

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
