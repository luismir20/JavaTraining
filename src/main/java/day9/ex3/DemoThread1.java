package day9.ex3;

public class DemoThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Running Child Thread: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread1 d1 = new DemoThread1(), d2 = new DemoThread1(), d3 = new DemoThread1();
		Thread t1 = new Thread(d1, "t1");
		Thread t2 = new Thread(d2, "t2");
		Thread t3 = new Thread(d3, "t3");
		t1.start();
		t2.start();
		t3.start();

	}

}
