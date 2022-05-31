package threadsII;

public class SincronizandoHilos {

	public static void main(String[] args) {
		
//		Hilos hilo1 = new Hilos();
//		Hilos hilo2 = new Hilos();
//		
//		hilo1.start();
//		try {
//			hilo1.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		hilo2.start();
//		try {
//			hilo2.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		System.out.println("Terminadas las tareas");
		
		Hilos hilo1 = new Hilos();
		Hilos2 hilo2 = new Hilos2(hilo1);
		
		hilo1.start();
		hilo2.start();
		System.out.println("Terminadas las tareas");
	}

}
