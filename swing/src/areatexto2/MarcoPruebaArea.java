package areatexto2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MarcoPruebaArea extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel laminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
	
	public MarcoPruebaArea() {
		setTitle("Probando Área de texto");
		setBounds(500, 300, 500, 350);
		setLayout(new BorderLayout());
		laminaBotones = new JPanel();
		botonInsertar = new JButton("Insertar");
		areaTexto = new JTextArea(8, 20);
		botonInsertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					areaTexto.append("En un lugar de la Manche de cuyo nombre no quiero acordarme.");			
			}
		});
		
		laminaBotones.add(botonInsertar);
		botonSaltoLinea = new JButton("Salto Línea");
		botonSaltoLinea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean saltar = !areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
				if(saltar)
					botonSaltoLinea.setText("Quitar Salto");
				else
					botonSaltoLinea.setText("Salto Línea");
			}
		});
		
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaBotones, BorderLayout.SOUTH);
		
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
		
	}
}
