package MultiThreading;

public class UsingLambdaInsingleLine {

	public static void main(String[] args) throws InterruptedException {
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
		
		
		
		Thread t1=new Thread(()-> {
			
			
				for(int i=0;i<5;i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
		});
		Thread t2=new Thread(()-> {
			for(int i=0;i<5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	});
		t1.setName("Hi Thread"); //set the name for thread
		t2.setName("Hello thread");
		System.out.println(t1.getName()); //get the name of thread
		System.out.println(t2.getName());
		
		
		t1.start();
		t2.start();
		System.out.println(t1.isAlive()); //it will check whether thread is in running state or not
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive()); //t1 is not in running state
		
		System.out.println("bye");

	}

}
