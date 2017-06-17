package com.firestar.demontwo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by xiangzi on 2017/6/17.
 */
public class IRMIServiceImpl extends UnicastRemoteObject implements IRMIService{
    protected IRMIServiceImpl() throws RemoteException {
    }

    public int add(int a, int b) throws RemoteException {
        return a+b;
    }
}
