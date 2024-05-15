package ProducerAndConsumer;

public class Source {

	private int tuketimNo;
    private boolean urettinMi = true;
    
//    consumer 
	public synchronized int getTuketimNo() {
		while(urettinMi) {
		try {
//			consumer'ı bekletecek.
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		urettinMi = true;
		//wait() ile beklettiğimiz thread' i uyandırdık.
		notify();
		return tuketimNo;
	}

//	producer
	public synchronized void setTuketimNo(int tuketimNo) {
		while(!urettinMi) {
		try {
//		producer' ı bekletecek.
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		System.out.println(tuketimNo + " değeri üretildi.");
//		üretimi yaptktan sonra false ile üretimi bitiriyoruz.
		this.tuketimNo = tuketimNo;
		urettinMi = false;
//		producer uyandırılıyor.
		notify();
}

}
