package banco;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasClientes {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Camilo Cardozo", "00001", 200000);
		Cliente cliente2 = new Cliente("Lorena Cardozo", "00002", 250000);
		Cliente cliente3 = new Cliente("Mireya Moreno", "00003", 300000);
		Cliente cliente4 = new Cliente("Francisco Cardozo", "00004", 500000);
		Cliente cliente5 = new Cliente("Briyith Betancourth", "00005", 400000);
		Cliente cliente6 = new Cliente("Camilo Cardozo", "00006", 200000);

		Set<Cliente> clientes = new HashSet<>();
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
		clientes.add(cliente6);
		
		Iterator<Cliente> itCliente = clientes.iterator();
		
		while(itCliente.hasNext()) {
			String nombreCliente = itCliente.next().getNombre();
			System.out.println("Nombre del cliente: "+nombreCliente);
//			String numeroCuenta = 
			if(nombreCliente.equals("Mireya Moreno"))
				itCliente.remove();
			 
		}
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
//			if(cliente.getNombre().equals("Mireya Moreno"))
//				clientes.remove(cliente); NO ES PERMITIDO
		}
	}

}
