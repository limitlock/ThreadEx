package runableex;

public class MainClass {
	public static void main(String[] args) {

		ThreadTest threadTest = new ThreadTest();
		Thread thread = new Thread(threadTest, "A");

		thread.start();

		// 위에 쓰레드를 실행시켜두고 Main쓰레드를 따로 실행시키기 때문에
		// 콘솔창에 main이 먼저 출력된다. 즉, 메인쓰레드와 내가 생성한 쓰레드는 서로
		// 다르게 작용한다.

		System.out.println(Thread.currentThread().getName());

	}
}
