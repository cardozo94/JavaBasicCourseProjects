package layout2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaPrincipal extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel teclas;
	private	JButton pantalla; 
	private boolean principio;
	
	private String operador;
	private double resultado;
	
	
	public LaminaPrincipal() {
		
		setLayout(new BorderLayout());
		pantalla = new JButton("0"); 
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		
		teclas = new JPanel();
		//se crea el grid y se dice la division qeu se quiere
		teclas.setLayout(new GridLayout(4,4));
		principio = true;
		
		ActionListener oyente = new InsertaNumero();
		ActionListener oyente2 = new Operar();
		
		ponerBoton("7", oyente);
		ponerBoton("8", oyente);
		ponerBoton("9", oyente);
		ponerBoton("/", oyente2);
		
		ponerBoton("4", oyente);
		ponerBoton("5", oyente);
		ponerBoton("6", oyente);
		ponerBoton("*", oyente2);

		ponerBoton("1", oyente);
		ponerBoton("2", oyente);
		ponerBoton("3", oyente);
		ponerBoton("-", oyente2);
		
		ponerBoton("0", oyente);
		ponerBoton(".", oyente);
		ponerBoton("=", oyente2);
		ponerBoton("+", oyente2);
						
		add(teclas);
		
		operador ="=";
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);
		teclas.add(boton);
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String entrada = e.getActionCommand();
			String pantallaText =pantalla.getText();
			if(principio) {
				if(!entrada.equals("."))
					pantalla.setText("");
				principio = false;
			}else if(pantallaText.equals("0")&&entrada.equals("0"))
				entrada = "";
			else if(pantallaText.equals("0")&&!entrada.equals("0")&&!entrada.equals("."))
				pantalla.setText("");
			if(pantallaText.contains(".")&&entrada.equals(".")) 
				entrada="";
			pantalla.setText(pantalla.getText()+entrada);
		}
		
	}
	
	private class Operar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String operadorSeleccionado = e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			operador = operadorSeleccionado;
			principio = true;
		}
		
		public void calcular(double x) {
			if(operador.equals("+")) 
				resultado+=x;
			else if(operador.equals("="))
				resultado=x;
			else if(operador.equals("/"))
				resultado /= x;
			else if(operador.equals("-"))
				resultado -= x;
			else if(operador.equals("*"))
				resultado *= x;
			pantalla.setText(""+resultado);
		}
		
	}

}
