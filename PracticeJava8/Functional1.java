package PracticeJava8;

@FunctionalInterface
public interface Functional1 {

	void m1(); //abstract method
	static void m2() {}
	default void m3() {}
}


@FunctionalInterface
 interface Functional2 extends Functional1 {
	static void m2() {}
	default void m3() {}
	
}


@FunctionalInterface
 interface Functional3 extends Functional1 {

	void m1(); //we can override same method
	static void m2() {}
	default void m3() {}
}
