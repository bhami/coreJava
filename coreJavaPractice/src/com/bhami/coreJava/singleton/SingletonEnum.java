package com.bhami.coreJava.singleton;

public enum SingletonEnum {
	INSTANCE;
	public void doStuff(){
		System.out.println("Singleton using Enum");
	}
	//And this can be called from clients :
	public static void main(String[] args) {
		  SingletonEnum.INSTANCE.doStuff();
		  SingletonEnum.INSTANCE.doStuff();
	}
}