
class MyException extends Exception{
	public MyException(String str) {
		//System.out.println("in my exception"+str);
		super(str); 
	}
}

public class ExceptionHandling {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		
		int a=0;
		try {
			System.out.println(5/a);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("can not be divisible by zero");
			System.out.println("by using message:"+e.getMessage());
			e.printStackTrace();
			
		}
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			int[] arr= {1,3,4,6,7,34};
			Thread.sleep(100);
			System.out.println(arr[6]);
		}
		catch(Exception t) {
			t.printStackTrace();
			throw new MyException("Please select index below 6");
		}

	}

}
