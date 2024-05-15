package multiThreading;

public class Printer {
//synchronized sayesinde bir görev bitmeden diğer göreve geçemiyor.
    synchronized void printDocument(int numberOfCopies, String documentName) {
			for(int i = 1 ; i <= numberOfCopies; i++) {
//				try {
//					Thread.sleep(500);
//				}catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				System.out.println(documentName + " isimli dosyanın " + i + ". kopyası yazdırılıyor.");
			}
		}
}


