package com.firestar.demonthree;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by xiangzi on 2017/6/17.
 */
public interface HelloService extends Remote {
    String sayHello(String name) throws RemoteException;
}
