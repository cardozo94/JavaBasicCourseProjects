package sincronizacionhilos;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		Banco banco = new Banco();
		for (int i = 0; i < 100; i++) {
			EjecucionTransferencias transferencias = new EjecucionTransferencias(banco, i, 2000);
			Thread hilo = new Thread(transferencias); 
			hilo.start();
		}
		 

	}

}
