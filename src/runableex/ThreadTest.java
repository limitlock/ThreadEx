package runableex;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest");

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
