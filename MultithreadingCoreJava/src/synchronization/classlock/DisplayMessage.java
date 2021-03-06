package synchronization.classlock;

public class DisplayMessage {
	public synchronized static void sayHello(String name){
		for(int i= 1; i<=5; i++){
			System.out.println("Hi "+name);
			try {
				//using sleep method to prove t2 will have to wait for t1 to finish using sayHello() but its not necessary
				// just for showcase purposes
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
