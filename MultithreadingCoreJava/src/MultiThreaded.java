
public class MultiThreaded extends Thread {

	/*
	 * EXAMPLE OF SLEEP METHOD USABILITY
	 * When we are waiting for a particular resource like a db connection or a webservice connection or connecting to a server
	 * and trys to connect to a server and the server is not ready yet we will use Thread.sleep and our 
	 * application will try to connect to that server again after the Thread comes out of the sleep
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		//Instance of a thread
		MultiThreaded mt = new MultiThreaded();
		//default priority is 5
		mt.setPriority(MAX_PRIORITY); //1 to 10 value 1 is min 10 is highest priority.. MAX_PRIORITY is 10, MIN_PRIORITY IS 1, NORM_PRIORITY IS 5
		mt.setName("mt");
		//to start the thread
		mt.start();
		//IT IS NOT GUARANTEED THAT A HIGHER PRIORITY THREAD WILL RUN FIRST... IT DEPENDS ON THE JVM... 
		//BUT IN MOST CASES IT WORKS
		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("MT1");
		mt1.start();
		//Thread currentThread = Thread.currentThread(); //the currentThread() will get the main thread
		//System.out.println("Main thread Name is " +currentThread.getName()); //to get the threads name
		/*for (int j = 1; j<= 200; j++){
			System.out.print("j: "+ j + "\t");
			Thread.sleep(1000);

		}*/

	}
	
	//Starting point of execution for a thread
	public void run(){
		System.out.println("Thread name: " + Thread.currentThread().getName());
		/*Thread currentThread = Thread.currentThread();
		System.out.println("Thread 2 Name is " +currentThread.getName()); //to get the threads name
		currentThread.setName("Gilberto Thread"); //to change threads name
		System.out.println("Thread 2 new Name is " +currentThread.getName()); //to get the threads name */
		/*for (int i = 1; i<= 200; i++){
			System.out.print("j: "+ i + "\t");
			try {
				//the thread will not do anything for the time we pass to the the SLEEP METHOD in milliseconds
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Child thread Exiting..");
			}
		}*/
	}
	

}
