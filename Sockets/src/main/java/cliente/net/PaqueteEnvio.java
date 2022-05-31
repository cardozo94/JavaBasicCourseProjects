package cliente.net;

import java.io.Serializable;
import java.util.Set;

public class PaqueteEnvio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nick, ip, mensaje;
	private Set<String> ipClientes;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Set<String> getIpClientes() {
		return ipClientes;
	}

	public void setIpClientes(Set<String> clientes) {
		this.ipClientes = clientes;
	}

}
