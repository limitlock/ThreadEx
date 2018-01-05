package multhread.voteprogram;

public class MainClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		//n개의 쓰레드를 n개의 객체에 각각 할당하여 서로 독립적으로 프로그램이 실행된다.
		
		VoteThread voteLocation1 = new VoteThread();
		VoteThread voteLocation2 = new VoteThread();
		VoteThread voteLocation3 = new VoteThread();
		
		Thread location1 = new Thread(voteLocation1,"A");
		Thread location2 = new Thread(voteLocation2,"B");
		Thread location3 = new Thread(voteLocation3,"C");
		
		location1.start();
		location2.start();
		location3.start();
		
		
		
		
	}

}
