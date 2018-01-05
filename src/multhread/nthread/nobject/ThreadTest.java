package multhread.nthread.nobject;

public class ThreadTest implements Runnable {

	int testNum = 0;

	// /**
	// * n개의 쓰레드가 1개의 객체에 사용될 때에는 쓰레드 내부에 있는 변수는 서로 공유된다.
	
	// * ex) A쓰레드의 경우에만 조건에 맞추어서 testNum의 숫자가 올라가는데
	// * 이것이 B쓰레드가 사용될 때에도 testNum의 숫자가 올라가있다.
	// */

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			if (Thread.currentThread().getName().equals("A")) {
				System.out.println(Thread.currentThread().getName());
				System.out.println("------------------------------------");

				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}

	}

}
