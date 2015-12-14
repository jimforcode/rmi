package rmi.serviceImpl;

import rmi.service.SomeService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by zj on 15/12/14.
 */
public class SomeServiceImpl extends UnicastRemoteObject implements SomeService{


    public SomeServiceImpl() throws RemoteException {
    }

    @Override
    public String doSomething(String message) {
            return  " this message is from rmi : [ "+message +" ]";
    }
}
