package java8;


interface Divya{
	 
	 static void jkl() {
		 System.out.println("static method");
	 }
}





public class ComparatorImple implements Divya {
	
	 static void jkl() {
		 System.out.println("in main method");
	 }
	

	public static void main(String[] args) {
		ComparatorImple ll=new ComparatorImple();
		ll.jkl();
		
	
		
		Divya.jkl();

	}

	

}
