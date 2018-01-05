package threadex;

public class MainClass {
	public static void main(String[] args) {

		ThreadTest threadThest = new ThreadTest();
		threadThest.setName("B");

		threadThest.start();
		
		
		
		// 여기 또한, 위 쓰레드를 별도로 실행시키고 main쓰레드를 실행시켜
		// 아래 sysout을 출력시킨다.
		System.out.println(Thread.currentThread().getName());

	}
}
