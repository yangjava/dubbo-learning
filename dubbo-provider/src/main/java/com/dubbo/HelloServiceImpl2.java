package com.dubbo;

public class HelloServiceImpl2 implements HelloService{

	@Override
	public String sayHello(String name) {
		return "Hello World 222" + name;
	}

}
