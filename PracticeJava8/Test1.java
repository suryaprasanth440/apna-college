package PracticeJava8;


@FunctionalInterface
 interface Functional {

	void m1(); //abstract method
	static void m2() {
		System.out.println("in static method");
	}
	default void m3() {}
} 

class Dummy implements Functional{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("first day in practice");
		
	}
	static void m5() {
		System.out.println("in static method");
	}
	
	static void m2() {
		System.out.println("in static in Dummy method");
	}
	
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//without lambda
		Functional f=new Dummy();
		f.m1();
		Functional.m2();
		
		
		//with lambda
		Functional f2=()-> System.out.println("hi");
		f2.m1();
		
		Functional f3=Dummy::m5;
		f3.m1();
		
		Functional f4= new Dummy();
		Dummy.m2();
		Functional.m2();
		
		

	}

}
