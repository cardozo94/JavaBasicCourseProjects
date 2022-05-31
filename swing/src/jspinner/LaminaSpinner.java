package jspinner;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class LaminaSpinner extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LaminaSpinner() {
		//para dar la lista qeu va a mostrar
//		String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
//		JSpinner control = new JSpinner(new SpinnerListModel(lista));
		//para indicar el rango y los saltos de los números
		//JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 2));
		
		//especificar mi propia clse de comportamiento
//		JSpinner control = new JSpinner(new ModeloSpinner());
		//mismo anteriror pero con clase interna anonima
		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			
			@Override
			public Object getPreviousValue() {
				return super.getNextValue();
			}
		});
		Dimension d = new Dimension(150, 20);
		control.setPreferredSize(d);
		
		add(control);
	}
	
	/*private class ModeloSpinner extends SpinnerNumberModel{
		
		public ModeloSpinner() {
			
			super(5, 0, 10, 1);
			
		}
		
		@Override
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		
		@Override
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}*/
}
