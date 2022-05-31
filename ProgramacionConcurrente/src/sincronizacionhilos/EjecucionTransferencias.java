package sincronizacionhilos;

public class EjecucionTransferencias implements Runnable {

	private Banco banco;
	private int cuentaOrigen;
	private double cantidadMax;

	public EjecucionTransferencias(Banco banco, int cuentaOrigen, double cantidadMax) {
		this.banco = banco;
		this.cuentaOrigen = cuentaOrigen;
		this.cantidadMax = cantidadMax;
	}

	@Override
	public void run() {
		try {
			while (true) {
				int cuentaDestino = (int) (Math.random() * 100);
				double cantidad = cantidadMax * Math.random();
				banco.transferir(cuentaOrigen, cuentaDestino, cantidad);

				Thread.sleep((int) (Math.random() * 10));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
