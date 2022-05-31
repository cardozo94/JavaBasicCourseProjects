package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controlador.ActionListenerJComboBox;
import controlador.InitialLoader;
import modelo.DBHandler;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JComboBox<String> tablas;
	private JTextArea display;
	private DBHandler db;
	
	public VentanaPrincipal() {
		
		setBounds(200, 200, 400, 450);
		setTitle("BBDD Manager");
		initializeDatabase();
		JPanel panel = new JPanel(new BorderLayout());
		tablas = new  JComboBox<>();
		tablas.setEditable(false);
		tablas.addItem("Seleccione");
		tablas.addActionListener(new ActionListenerJComboBox(this));
		display = new JTextArea();
		display.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		panel.add(tablas, BorderLayout.NORTH);
		panel.add(display, BorderLayout.CENTER);
		add(panel);
		addWindowListener(new InitialLoader(this));
		
		setVisible(true);
		
	}
	

	public JComboBox<String> getTablas() {
		return tablas;
	}


	public JTextArea getDisplay() {
		return display;
	}


	public DBHandler getDb() {
		return db;
	}
	
	
	private void initializeDatabase() {
		try {
			db = new DBHandler();
		} catch (IOException e) {
			e.printStackTrace();
			if (e instanceof FileNotFoundException) {
				JOptionPane.showMessageDialog(this, "No se ha encontrado el archivo de conexion", "Error",
						JOptionPane.ERROR_MESSAGE);
				VentanaSeleccion seleccion = new VentanaSeleccion();
				db = new DBHandler(seleccion.getNewFilePath(this));
			}
		}
	}


}
