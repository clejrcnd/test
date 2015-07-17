package com.bean;

public class EchoBean {

	int num;
	String name;
	
	public EchoBean(int n, String na){
System.out.println("인자 2개 (int n, String na) 생성자" + n+"\t"+na);
		num = n;
		name = na;
	}
	
	
	// constructor injection
	public EchoBean(int n){
		System.out.println(" 인자 1개 EchoBean(int n) 생성자" + n);
		num = n;
	}
	
	public EchoBean() {
		super();
		System.out.println("EchoBean 생성자");
	}

	public String sayEcho(String mesg){
		return "Hello" + mesg;
	}
	
}
