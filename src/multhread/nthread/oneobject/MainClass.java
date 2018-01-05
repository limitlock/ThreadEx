package multhread.nthread.oneobject;

public class MainClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		
		// n개의 쓰레드가 1개의 객체에 사용되는 경우
		// (thread0, thread1) 2개의 쓰레드가 (threadTest) 1개의 객체에 할당
		
		ThreadTest threadTest = new ThreadTest();

		Thread thread0 = new Thread(threadTest, "A");
		Thread thread1 = new Thread(threadTest, "B");

		thread0.start();
		thread1.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");

	}

}
