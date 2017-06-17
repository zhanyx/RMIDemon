package com.firestar.demontwo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by xiangzi on 2017/6/17.
 */
public interface IRMIService extends Remote {
    int add(int a,int b) throws RemoteException;
}
