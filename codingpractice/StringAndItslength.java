package codingpractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringAndItslength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=List.of ("madam", "rar", "hello", "aaple");
		Map<String,Integer> map=li.stream().collect(Collectors.toMap(i->i, String::length));
		System.out.println(map);


	}

}
