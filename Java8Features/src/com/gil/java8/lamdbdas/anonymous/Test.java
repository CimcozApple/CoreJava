package com.gil.java8.lamdbdas.anonymous;

//LAMBDAS AND ANONYMOUS CLASSES
/*
 * Anonymous classes enable you to make your code more concise. 
 * They enable you to declare and instantiate a class at the same time. 
 * They are like local classes except that they do not have a name. 
 * Use them if you need to use a local class only once.
 * https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
 */
public class Test {
	public static void main(String[] args) {
		// Thread t = new Thread(new Runnable(){

		// @Override
		// public void run() {
		// for(int i = 1; i<=10; i++){
		// System.out.println("Child Thread");
		// }
		// }

		// });
		// Using lambda expressions = less lines of code
		Thread t = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + ".Child Thread");
			}
		});
		t.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ".Main Thread");
		}
	}
}
