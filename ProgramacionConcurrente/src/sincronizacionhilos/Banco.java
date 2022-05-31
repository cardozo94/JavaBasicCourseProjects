package sincronizacionhilos;

//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;

public class Banco {

	private final double[] cuentas;
//	private Lock cierreBanco = new ReentrantLock();
//	private Condition saldoSuficiente;

	public Banco() {
		cuentas = new double[100];

		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;
		}

//		saldoSuficiente = cierreBanco.newCondition();
	}

	public synchronized void transferir(int cuentaOrigen, int cuentaDestino, double cantidad) {
//		cierreBanco.lock();// Para sincronizar
		try {

			while (cuentas[cuentaOrigen] < cantidad) {
				System.out.println("Hilo congelado " +Thread.currentThread());
//				saldoSuficiente.await();//congela el hilo hasta que la condición no se cumpla
				wait();//congela el hilo hasta que la condición no se cumpla
			}

			System.out.println(Thread.currentThread());
			cuentas[cuentaOrigen] -= cantidad;
			System.out.printf("Transfiriendo %10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
			cuentas[cuentaDestino] += cantidad;
			System.out.printf(" Saldo Total: %10.2f%n", getSaldoTotal());
//			saldoSuficiente.signalAll();//notifica a todos los hilos de cambios
			notifyAll();//notifica a todos los hilos de cambios

		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
//		finally {
//			cierreBanco.unlock();
//		}
	}

	public double getSaldoTotal() {
		double saldoTotal = 0;
		for (double cuenta : cuentas) {
			saldoTotal += cuenta;
		}
		return saldoTotal;
	}

}
