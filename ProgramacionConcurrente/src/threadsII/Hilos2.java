package threadsII;

public class Hilos2 extends Thread {
	
	private Thread hilo;
	
	public Hilos2(Thread hilo) {
		this.hilo=hilo;
	}

	@Override
	public void run() {
		
		try {
			hilo.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
