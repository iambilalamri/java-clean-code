package amrib.cleancode.thread;

public class ThreadMain {

	public static void main(String[] args) {
		// startThread();
		// System.out.println(Thread.activeCount());
		// System.out.println(Runtime.getRuntime().availableProcessors());
		interruptThread();
	}

	public static void interruptThread() {
		Thread thread = new Thread(new DownloadFileTask());
		thread.start();

		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
	}

	public static void joinThread() {
		Thread thread = new Thread(new DownloadFileTask());
		thread.start();

		try {
			// Permet au thread de terminer task (completion of task before use it)
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("FILE is ready to be scanned!");
	}

	public static void startThread() {
		System.out.println(Thread.currentThread().getName());
		for (var i = 0; i < 10; i++) {
			Thread thread1 = new Thread(new DownloadFileTask());
			thread1.start();
		}
		// Thread thread2 = new Thread(new PlayMusicTask());
		// thread2.start();
	}

}
