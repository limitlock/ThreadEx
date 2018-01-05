package synchronize;


public class MainClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		// n개의 쓰레드가 1개의 객체에 할당 될 때, 공유되는 값의 해결 방법으로
		// 먼저 특정 쓰레드가 cpu를 선점하고 있을 경우, 이 작업이 끝날때까지
		// 다른 쓰레드는 대기하게 만든다.

		ThreadTest threadTest = new ThreadTest();

		Thread thread0 = new Thread(threadTest, "A");
		Thread thread1 = new Thread(threadTest, "B");
		thread0.start();
		thread1.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");

	}

}
