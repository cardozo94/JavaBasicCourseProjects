package swingavanzado;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MarcoTabla extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String[] nombresColumnas = {"Nombre", "Radio", "Lunas", "Gaseoso"};
	private Object[][] datosFilas = {
			{"Mercurio", 2440.0, 0, false},
			{"Venus", 6052.0, 0, false},
			{"Tierra", 6378.0, 1, false},
			{"Marte", 3397.0, 2, false},
			{"Jupiter", 71492.0, 16, true},
			{"Saturno", 60268.0, 18, true},
			{"Urano", 25559.0, 17, true},
			{"Neptuno", 24766.0, 8, true},
			{"Plutón", 1137.0, 1, false},
	};
	
	public MarcoTabla() {
		setTitle("Los Planetas");
		setBounds(300, 300, 400, 200);
		
		JTable tabla = new JTable(datosFilas, nombresColumnas);
		add(new JScrollPane(tabla), BorderLayout.CENTER);
		JButton impirmir = new JButton("Impimir");
		impirmir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					tabla.print();
				}catch (Exception ex) {
					ex.printStackTrace();
				}
				
			}
		});
		
		JPanel laminaBoton = new JPanel();
		laminaBoton.add(impirmir);
		add(laminaBoton, BorderLayout.SOUTH);
	}

}
