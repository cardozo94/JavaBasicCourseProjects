package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controlador.ButtonActionListener;

public class LaminaPrincipal extends JPanel {

	private JComboBox<String> seccion, pais;
	private JTextArea texto;
	private JButton consulta;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LaminaPrincipal() {
		setLayout(new BorderLayout());

		JPanel superior = new JPanel();
		superior.setLayout(new FlowLayout());

		texto = new JTextArea();
		texto.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

		initializeComboBox();
		initializeButon();

		superior.add(seccion);
		superior.add(pais);

		add(superior, BorderLayout.NORTH);
		add(texto, BorderLayout.CENTER);
		add(consulta, BorderLayout.SOUTH);
	}

	public JComboBox<String> getSeccion() {
		return seccion;
	}

	public JComboBox<String> getPais() {
		return pais;
	}

	public JTextArea getTexto() {
		return texto;
	}

	public void initializeComboBox() {
		seccion = new JComboBox<String>();
		pais = new JComboBox<String>();

		seccion.setEditable(false);
		pais.setEditable(false);

		seccion.addItem("TODAS");
		pais.addItem("TODOS");
	}

	public void initializeButon() {
		consulta = new JButton("Consulta");
		consulta.addActionListener(new ButtonActionListener(this));
	}

	public String getSelectedItem(JComboBox<String> comboBox) {
		return (String) comboBox.getSelectedItem();
	}

	public String getSelectedSeccion() {
		return getSelectedItem(seccion);
	}

	public String getSelectedPais() {
		return getSelectedItem(pais);
	}
}
