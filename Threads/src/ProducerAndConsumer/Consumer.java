package ProducerAndConsumer;

public class Consumer implements Runnable {
	
	private Source source;
	public Consumer(Source source) {
		this.source = source;
		Thread mission = new Thread(this, "Consumer");
		mission.start();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(source.getTuketimNo() + " değer tüketildi.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
