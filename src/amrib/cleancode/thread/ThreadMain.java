package amrib.cleancode.thread;

public class ThreadMain {

	public static void main(String[] args) {
		startThread();
		// System.out.println(Thread.activeCount());
		// System.out.println(Runtime.getRuntime().availableProcessors());
	}

	public static void interruptThread() {
	}

	public static void joinThread() {
	}

	public static void pauseThread() {
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
