package multhread.voteprogram;

import java.util.Random;

public class VoteThread implements Runnable {

	int targetNum = 100;
	int sum = 0;
	Random random = new Random();

	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁

		StringBuffer stringBuffer = new StringBuffer();

		while (true) {
			sum = sum + random.nextInt(10);
			stringBuffer.delete(0, stringBuffer.toString().length());
			if (sum >= targetNum) {

				sum = 100;
				for (int i = 0; i < sum; i++) {
					stringBuffer.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t" + stringBuffer);
				break;
			} else {
				for (int i = 0; i < sum; i++) {
					stringBuffer.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t" + stringBuffer);

			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}

		}

	}

}
