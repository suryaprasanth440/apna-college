package MultiThreading;

public class UsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r1=new Runnable() {
			
			@Override
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
		};
		
		Runnable r2=new Runnable() {
			
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
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
