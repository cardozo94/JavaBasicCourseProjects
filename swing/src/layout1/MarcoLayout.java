package layout1;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MarcoLayout extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoLayout() {
		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		PanelLayout myPanel = new PanelLayout();
		//componentes se pondran alineados a donde se le especifique al constructor
//		FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER);
		//para indicar la separación vertical y horizontal
//		FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 50, 100);
//		myPanel.setLayout(disposicion);
		PanelLayout2 myPanel2 = new PanelLayout2();
		
		//se indica posición para qeu no se sobrepongan
		add(myPanel, BorderLayout.NORTH);
		add(myPanel2, BorderLayout.SOUTH);
		
	}

}
