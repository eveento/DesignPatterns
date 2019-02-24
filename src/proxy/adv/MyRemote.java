package proxy.adv;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    public String description() throws RemoteException;
}
