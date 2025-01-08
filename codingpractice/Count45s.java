package codingpractice;

public class Count45s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "45abc45xyz45pqr45rst45455454";
		int count = 0;

		for (int i = 0; i < abc.length() - 1; i++) {
			if (abc.charAt(i) == '4' && abc.charAt(i + 1) == '5') {
				count++;
			}
		}
		System.out.println(count);
		String string = "hello";
		String substring = string.substring(1, 2); // Extracts "e"
		System.out.println(substring);
		int counting=0;
		for(int i=0;i<abc.length()-1;i++) {
			if(abc.substring(i, i+1).contains("4") && abc.substring(i+1, i+2).contains("5")) {
				counting++;
			}
		}
		System.out.println(counting);


	}

}
