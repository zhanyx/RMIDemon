package com.firestar.demontwo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by xiangzi on 2017/6/17.
 * 客户端测试，在客户端调用远程对象上的远程方法，并返回结果。
 */
public class HelloClient {
    public static void main(String args[]){
        try {
            //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法
            IHello rhello =(IHello) Naming.lookup("rmi://localhost:8889/Hello");
            System.out.println(rhello.helloWorld());
            System.out.println(rhello.sayHelloToSomeBody("熔岩"));
            IRMIService service =(IRMIService)Naming.lookup("rmi://localhost:8889/service");
            System.out.println(service.add(1,2));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
