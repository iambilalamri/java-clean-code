package amrib.cleancode.thread;

public class DownloadFileTask implements Runnable {

	// @Override
	// public void run() {
	// // TODO Auto-generated method stub
	// System.out.println("Downloading a FILE: " +
	// Thread.currentThread().getName());
	//
	// try {
	// Thread.sleep(5000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// System.out.println("Download complete" + Thread.currentThread().getName());
	// }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Downloading a FILE: " + Thread.currentThread().getName());

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (Thread.currentThread().isInterrupted())
				return;
			System.out.println("Downloading byte " + i);
		}

		System.out.println("Download complete" + Thread.currentThread().getName());
	}

}
