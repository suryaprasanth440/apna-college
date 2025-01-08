import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> c = new ArrayList<>(Arrays.asList(12, 45, 67, 89, 76, 34, 56,34,23,12));
		 c.add(100);
		List m=Collections.synchronizedList(c);
		 
		 System.out.println(c);
		 
	}

}
