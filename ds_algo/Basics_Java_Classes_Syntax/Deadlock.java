package Basics_Java_Classes_Syntax;
public class Deadlock implements Runnable {

	public static void main(String[] args) {

		Runnable d1 = new Deadlock();
		 Runnable d2=new Deadlock();
		Thread t1 = new Thread(d1,"thread-1");
		Thread t2 = new Thread(d2,"thread-2");
		t1.start();
		t2.start();

	}

	@Override
	public void run() {
		
		method2();
		method1();
		
	}
	public  void method1() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object "+ Thread.currentThread().getName());

			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object "+ Thread.currentThread().getName());
			}
		}
	}

	public  void method2() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object "+ Thread.currentThread().getName());

			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object "+ Thread.currentThread().getName());
			}
		}
	}

}
