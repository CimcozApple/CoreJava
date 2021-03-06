package synchronization.blocks;

public class DisplayMessage {
	public void sayHello(String name){
		//any code can go here
		System.out.println("Not synchronized code");
		//instead of locking the entire method we are locking few lines of code with synchronized block
		//synchronized(nameoftheclasstobelocked) no threads will be able to access that class
		//synchronized(this)
		//synchronized(DisplayMessage.class) if you want a class level lock,
		//synchronized(new String())
		synchronized(this){
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
}
