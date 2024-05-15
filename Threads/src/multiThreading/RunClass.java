package multiThreading;

public class RunClass {

	public static void main(String[] args) throws InterruptedException {
		Printer printer = new Printer();
		// printer.printDocument(20, "Vize Sınavı.pdf");
		
		Runnable r1 = new Mission(printer, 5, "Vize_Sınav.pdf"),r2 = new Mission (printer, 10, "Final_Sınav_Notu.pdf");
		Thread mission1 = new Thread(r1);
		Thread mission2 = new Thread(r2);
//		join() metodu sayesinde mission2 işi bitene kdr mission1 çalışmaz.
		mission1.start();
//		mission2 ölene kadar bekle.
		mission2.join();
		mission2.start();
		
		
	}

}
