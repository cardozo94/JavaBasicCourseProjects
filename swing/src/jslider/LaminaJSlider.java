package jslider;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LaminaJSlider extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel texto;
	private JSlider control;
	
	public LaminaJSlider() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		add(texto, BorderLayout.CENTER);
		
		control = new JSlider(8, 50, 12);
		
		//imprimir marcas y rotulos
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif", Font.ITALIC, 12));
				
		//para aproximas a las marcas
		//control.setSnapToTicks(true);
		
		JPanel laminaSlider = new JPanel();
		
		control.addChangeListener(new EventoSlider());
		laminaSlider.add(control);
		
		add(laminaSlider, BorderLayout.NORTH);
	}
	
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			
			texto.setFont(new Font("Serif", Font.PLAIN, control.getValue()));			
		}
		
	}
}
