import java.util.Scanner;

public class JoinDemo extends Thread{
	static int n, sum = 0;
	public static void main(String[] args) {
		
		
		//THREAD 1 WE GET THE NUMBER FROM USER
		System.out.println("Sum of first N numbers");
		System.out.println("Enter a value");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();
		//get time
		long start = System.currentTimeMillis();
		//THREAD 2 WILL CALCULATE SUM
		//USING JOIN METHOD WILL COMPLETE THE THREAD IT WAS INVOKED TO (JD IN JD.JOIN()) BEFORE STARTING OTHER THHREAD
		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			System.out.println("Lol");
		}
		//We dont want to print this until the other thread finished completly
		//join() method allows one thread to wait until another thread completes its execution. 
		//so this syso will print only until jd completes calculating the sum
		//THREAD 3 WILL SHOW RESULTS ONLY AFTER THREAD 2 FINISHES
		System.out.println("Sum of first "+JoinDemo.n+" Numbers is " +JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("Total time taken: " + (end-start)/1000 + " seconds."); //time is in milliseconds so we divide by 1000 to get it in seconds
	}
	
	public void run(){
		for(int i = 1; i<=JoinDemo.n;i++){
			JoinDemo.sum+=i;
			try {
				//SLEEP TO VERIFY THAT THE PRINT WILL WAIT UNTIL THIS FOR FINISHES
				Thread.sleep(1000); //THIS WILL WAIT 5 SECONDS IF U GIVE 5 AS N AND 6 SECONDS IF N IS 6 AND SO ON
			} catch (InterruptedException e) {
				System.out.println("Lol 2xd");
			}
		}
	}

}
