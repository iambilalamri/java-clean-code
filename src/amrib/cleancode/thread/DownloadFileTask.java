package amrib.cleancode.thread;

public class DownloadFileTask implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Downloading a FILE: " + Thread.currentThread().getName());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Download complete" + Thread.currentThread().getName());
	}

}
