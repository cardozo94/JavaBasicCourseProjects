package disposicionesavanzadas;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaminaLibre extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LaminaLibre() {
	
		//setLayout(null);//disposición libre
		setLayout(new Encolumnas());
		
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JLabel edad = new JLabel("Edad: ");
		JLabel telefono = new JLabel("Teléfono: ");
		
		JTextField textNombre = new JTextField();
		JTextField textApellido= new JTextField();
		JTextField textEdad= new JTextField();
		JTextField textTelefono= new JTextField();
		
		//se debe establcer las coordenaanda con setBounds para que aparesca.
		/*nombre.setBounds(20, 20, 80, 10);
		textNombre.setBounds(100, 17, 100, 20);
		apellido.setBounds(20, 60, 80, 15);
		textApellido.setBounds(100, 55, 100, 20);*/
		
		add(nombre);
		add(textNombre);
		add(apellido);
		add(textApellido);
		add(edad);
		add(textEdad);
		add(telefono);
		add(textTelefono);
	}
}
