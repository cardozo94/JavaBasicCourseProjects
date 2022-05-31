package threads;

import java.awt.Component;

public class PelotaHilos implements Runnable {
	
	private Pelota pelota;
	private Component componente;

	public PelotaHilos(Pelota pelota, Component componente) {
		this.pelota = pelota;
		this.componente = componente;
	}
	
	@Override
	public void run() {
		
		System.out.println("Estado del hilo al iniciar "+Thread.currentThread().isInterrupted());

//		for (int i = 1; i < 3000; i++) {
//			pelota.muevePelota(componente.getBounds());
//			componente.paint(componente.getGraphics());
//			try {
//				Thread.sleep(4);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//		}
		
//		while(!Thread.interrupted()) {
		while(!Thread.currentThread().isInterrupted()) {
			pelota.muevePelota(componente.getBounds());
			componente.paint(componente.getGraphics());
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Estado del hilo al finalizar "+Thread.currentThread().isInterrupted());

	}

}
