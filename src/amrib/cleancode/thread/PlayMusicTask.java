package amrib.cleancode.thread;

public class PlayMusicTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Playing MUSIC: " + Thread.currentThread().getName());
	}

}
