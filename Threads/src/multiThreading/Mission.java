package multiThreading;

public class Mission implements Runnable {
	Printer printerRef;
	String documentName;
	int copyOfDocument;
	
	
//	constructor oluşturduk.
	public Mission(Printer printerRef, int copyOfDocument, String documentName) {
		this.printerRef = printerRef;
		this.documentName = documentName;
		this.copyOfDocument = copyOfDocument;
	}
	@Override
	public void run() {
		synchronized (printerRef) {
			printerRef.printDocument(copyOfDocument, documentName);		
		}
	}

}
