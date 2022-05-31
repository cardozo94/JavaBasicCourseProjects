package disposicionesavanzadas;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class LaminaMuelle extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LaminaMuelle() {
	
		JButton boton1 = new JButton("Boton1");
		JButton boton2 = new JButton("Boton2");
		JButton boton3 = new JButton("Boton3");
		
		SpringLayout layout = new SpringLayout();
				
		setLayout(layout);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		//muelle
		Spring muelle = Spring.constant(0,0,10);
		Spring muelleRigido = Spring.constant(10);//separación de 10 pixeles
		
		layout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, boton2, muelleRigido, SpringLayout.EAST, boton1);
		layout.putConstraint(SpringLayout.WEST, boton3, muelleRigido, SpringLayout.EAST, boton2);
		layout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);
		
	}
}
