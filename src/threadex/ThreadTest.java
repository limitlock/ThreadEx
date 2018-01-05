package threadex;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}

		}
	}
}
