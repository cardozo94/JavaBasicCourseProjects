package threadsII;

public class Hilos extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("Ejecutando hilo "+getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
