package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface FunctionalInterface1 {
	
	int add(int a,int b);
	//void subtract(int c, int d);
	default void divya() {
		System.out.println("divyaaaa");
	}
	static void dasa() {
		System.out.println("dasa ");
	}

} 
public class FunctionalImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionalInterface1 f=( c, d)->{return c+d;};
		int b=f.add(3, 4);
		System.out.println(b);
		FunctionalInterface1.dasa();
		//FunctionalInterface1 c=new FunctionalImplementation();
		
		f.divya();
		
		Predicate<String> p1=s->s.length()>5;
		Predicate<String> p2=sp->sp.equals("male");
		System.out.println(p1.or(p2).test("divyad"));
		System.out.println(p1.negate().test("dasa"));
		
		Function<String,Integer> p=s->s.length();
		System.out.println(p.apply("divya"));
		
		Function<Integer,Integer> f1=i->2*i; //6
		Function<Integer,Integer> f2=i->i*i*i; //216
		System.out.println(f1.andThen(f2).apply(3)); //216
		System.out.println(f1.compose(f2).apply(3)); //54
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("dasa");
		
		
		
		
	
		
		
		
	}



}
