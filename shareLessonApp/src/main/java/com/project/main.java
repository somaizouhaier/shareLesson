package com.project;

public class main {
    inter1 obj = new object1();
    public interface inter1 {
	public void methode1();
    }

    public class object1 implements inter1{
	public void methode1(){
	    System.out.println("object1");
	}
    }
    
    public class object2 implements inter1{
   	public void methode1(){
   	    System.out.println("object2");
   	}
       }
    public static void main(String[] args) {
	main m = new main();
	m.obj.methode1();
	}
}
