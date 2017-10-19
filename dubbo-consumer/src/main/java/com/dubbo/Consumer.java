package com.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();

        // 获取远程服务代理
        HelloService demoService = (HelloService) context.getBean("helloService");
        //执行远程方法
        String hello = demoService.sayHello("world");

        System.out.println(hello);
    }
}
