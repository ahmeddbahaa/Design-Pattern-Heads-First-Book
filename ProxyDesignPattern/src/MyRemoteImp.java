import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImp extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;
    public String sayHello(){
        return "Server Say Hello There";
    }

    MyRemoteImp() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImp();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}