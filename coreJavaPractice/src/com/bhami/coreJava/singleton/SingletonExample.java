package com.bhami.coreJava.singleton;

public class SingletonExample {
	// Static member holds only one instance of the
    // SingletonExample class
    private static SingletonExample singletonInstance;
    // SingletonExample prevents any other class from instantiating
    private SingletonExample() {
    }
    // Providing Global point of access
    public static SingletonExample getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new SingletonExample();
            System.out.println("First timecreating instance");
        }
        return singletonInstance;
    }
    public void printSingleton(){
        System.out.println("Inside print Singleton");
    }
    public static void main(String[] args){
    	SingletonExample.getSingletonInstance().printSingleton();
    	SingletonExample.getSingletonInstance().printSingleton();
    }
}

