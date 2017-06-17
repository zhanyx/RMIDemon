package com.firestar.demonthree;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by xiangzi on 2017/6/17.
 */
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService{
    public HelloServiceImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "你好："+name;
    }
}
