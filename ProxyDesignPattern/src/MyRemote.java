import java.rmi.*;
public interface MyRemote extends Remote {
     String sayHello()throws RemoteException;
}
