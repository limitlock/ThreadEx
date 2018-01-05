package multhread.nthread.nobject;

public class MainClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		// n개의 쓰레드가 n개의 객체에 알맞게 이루어지는 경우
		// 서로 독립된 객체로 생성되기 때문에 testNum이 공유되지 않는다.
		// B는 조건에 만족하지 못하기 때문에 testNum의 숫자가 올라가지 않고 그대로 0을 유지한다.

		ThreadTest threadTest0 = new ThreadTest();
		ThreadTest threadTest1 = new ThreadTest();

		Thread thread0 = new Thread(threadTest0, "A");
		Thread thread1 = new Thread(threadTest1, "B");

		thread0.start();
		thread1.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");

	}

}
