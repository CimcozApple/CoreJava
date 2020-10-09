package threadcommunication;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		
		synchronized(t){
			System.out.println("Main thread is going to wait");
			//wait and notify must be in synchronized context (block, method, etc)
			t.wait();// t is going to wait untill the child thread finishes
			System.out.println("Main thread notified");
			System.out.println(t.total);
		}
	}
}