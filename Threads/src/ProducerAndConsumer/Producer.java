package ProducerAndConsumer;

public class Producer implements Runnable {

	private Source source;
	public Producer (Source source) {
		this.source = source;
		Thread mission = new Thread(this,"Producer");
		mission.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			source.setTuketimNo(i ++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
