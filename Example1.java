import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> c = Arrays.asList(12, 45, 67, 89, 76, 34, 56);
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); // Create a modifiable list
        l.addAll(2,c); // Now you can add all elements from c to l
        l.add(98);
       // c.add(23);

        System.out.println(l); // This will print: [1, 2, 3, 4, 12, 45, 67, 89, 76, 34, 56]
    
    //Arrays.asList
        //List.of
        //.toList()
        List<Integer> m=List.of(12,34,56,78);
        m.add(21);
        System.out.println(m);
    }
}
