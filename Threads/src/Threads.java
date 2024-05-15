class Gorev extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<=20; i++) {
			System.out.println("- Görev Sınıfı - " + "Numara: " + i);
		}
	}
}
public class Threads {
//main metodu main thread' i temsil eder.
	public static void main(String[] args) {
//		Therad Nedir? 
//		1.Theradler processlerin hafif halidir.
//		2.Bir programın en küçük bağımsız birimidir.
//		3.Ayrı bir yürütülme yolu vardır.
//		4.Her java programı 1 tane thread içerir.
//		5. Java.lang Therad sınıfı tarafından bir thread oluşturulur ve kontrol edilir
		
		//JOB1
		System.out.println("PROGRAM BAŞLADI! ");
		System.out.println("Aktif Thread Sayısı: " + Thread.activeCount());
		
		//JOB2
		Gorev gorev = new Gorev();
		gorev.start();
		System.out.println("PROGRAM BİTTİ!");
	}
	

}
