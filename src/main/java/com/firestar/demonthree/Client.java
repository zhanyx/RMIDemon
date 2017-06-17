package com.firestar.demonthree;

/**
 * Created by xiangzi on 2017/6/17.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        ServiceConsumer consumer = new ServiceConsumer();

        while (true) {
            HelloService helloService = consumer.lookup();
            String result = helloService.sayHello("Jack");
            System.out.println(result);
            Thread.sleep(3000);
        }
    }
}
