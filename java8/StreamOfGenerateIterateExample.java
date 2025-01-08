package java8;

import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stringStream=Stream.of("prasanth","dasa","divya","surya");
		stringStream.forEach(System.out::println);
		
		Stream.iterate(1, x->x*2).limit(10).forEach(System.out::println); //generate infinite loop limiting to 10 values

	}

}
