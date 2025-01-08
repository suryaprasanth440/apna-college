package MultiThreading;

class Hii implements Runnable {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class Helloo implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MyThread2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hii obj1=new Hii();
//		Helloo obj2=new Helloo();
//		
//		Thread t1=new Thread(obj1);
//		Thread t2=new Thread(obj2); 
		Thread t1=new Thread(new Hii());
		Thread t2=new Thread(new Helloo());
		
		
		t1.start();
		t2.start();
		

	}

}
