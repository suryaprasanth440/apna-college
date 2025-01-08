import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordAndItsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am learning java java am";
		String[] arr=s.split(" ");
		
		Map<String,Integer> map=new HashMap<>();
		for(String str:arr) {
		 
				 if(map.get(str)!=null)
				 map.put(str,map.get(str)+1);
				 else
					 map.put(str, 1);
			
		}
		
		Iterator itr=map.keySet().iterator();
		while(itr.hasNext()) {
			String ss=(String)itr.next();
			if(map.get(ss)>1) {
				System.out.println("the word "+ss+" appeared for "+map.get(ss));
			}
		}
		
		
		System.out.println(map);
		

	}

}
