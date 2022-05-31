package cliente;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class Cliente {
//	private static Logger logger = LogManager.getLogger(Cliente.class);
	public static void main(String[] args) {
//		logger.info("Debug log message");
		MarcoCliente marco = new MarcoCliente();
		marco.setDefaultCloseOperation(MarcoCliente.EXIT_ON_CLOSE);
	}

}
