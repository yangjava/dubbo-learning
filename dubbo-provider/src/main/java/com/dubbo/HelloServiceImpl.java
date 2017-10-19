package com.dubbo;

public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
		return "Hello World" + name;
	}

}
