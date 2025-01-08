package codingpractice;

import java.util.Arrays;
import java.util.List;

public class ReverseInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> ls=Arrays.asList("divya","surya","java","madam","springboot");
       ls.stream().map(s->new StringBuilder(s).reverse().toString()).forEach(System.out::println);
	}

}
