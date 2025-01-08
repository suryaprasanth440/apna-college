package codingpractice;

import java.util.HashMap;
import java.util.Map;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//А -> C
		//C -> A
		//G -> T
		//T -> G
		String str="AGGTCA";
     
        //Easiest way
        StringBuffer sf=new StringBuffer();
        for(char t:str.toCharArray()) {
        	switch(t) {
        	case 'A': sf.append("C"); break;
        	case 'G': sf.append("T"); break;
        	case 'T': sf.append("G"); break;
        	case 'C': sf.append("A"); break;
        	default: sf.append(t); break;
        	}
        	
        }
        
        System.out.println("easiest way:"+ sf);
        
        
        StringBuilder sb=new StringBuilder(str);
        for(char ch:str.toCharArray()) {
        	if(ch=='A') {
        		sb.setCharAt(str.indexOf("A"), 'C');
        	}
        	if(ch=='G') {
        		sb.setCharAt(str.indexOf("G"), 'T');
        	}
        	if(ch=='T') {
        		sb.setCharAt(str.indexOf("T"), 'G');
        	}
        	if(ch=='C') {
        		sb.setCharAt(str.indexOf("C"), 'A');
        	}
        }
        System.out.println(sb );
        
        //using switch case
        StringBuilder stb=new StringBuilder(str);
        for(int i=0;i<str.length();i++) {
        	char c=str.charAt(i);
        	switch(c) {
        	case 'A': stb.setCharAt(str.indexOf(String.valueOf(c)), 'C');break;
        	case 'G': stb.setCharAt(str.indexOf(String.valueOf(c)), 'T');break;
        	case 'T': stb.setCharAt(str.indexOf(String.valueOf(c)), 'G');break;
        	case 'C': stb.setCharAt(str.indexOf(String.valueOf(c)), 'A');break;
        	//default: stb.setCharAt(str.indexOf(String.valueOf(c)), c);break;
        	}
        }
        System.out.println("using switch case:"+stb);
        
        //using map
        Map<Character,Character> map=new HashMap<>();
        map.put('A', 'C');
        map.put('G','T');
        map.put('T','G');
        map.put('C', 'A');
        String sp="";
        for(char ct:str.toCharArray()) {
        	switch(ct) {
        	case 'A': sp+=String.valueOf(map.get('A')); break;
        	case 'G': sp+=String.valueOf(map.get('G')); break;
        	case 'T': sp+=String.valueOf(map.get('T')); break;
        	case 'C': sp+=String.valueOf(map.get('C')); break;
        	}
        }
		
        System.out.println("using map:"+sp);
		
	}

}
