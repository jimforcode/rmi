package rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by zj on 15/12/14.
 */
public interface SomeService extends Remote {
    String  doSomething(String message)throws RemoteException;
}
