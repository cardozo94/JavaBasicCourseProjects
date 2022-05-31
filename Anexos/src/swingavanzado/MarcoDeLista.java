package swingavanzado;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MarcoDeLista extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JList<String> meses;
	private JPanel laminaLista, laminaTexto;
	private JLabel rotulo;

	public MarcoDeLista() {
		setTitle("Prueba de lista");
		setBounds(400, 300, 400, 300);
		String[] mesesArray = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		meses = new JList<String>(mesesArray);
		meses.setVisibleRowCount(4);
		JScrollPane scroll = new JScrollPane(meses);
		laminaLista = new JPanel();
		laminaLista.add(scroll);
		meses.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				List<String> valores = meses.getSelectedValuesList();
				StringBuilder texto = new StringBuilder("Mes seleccionado: ");
				valores.stream().forEach(valor -> texto.append(valor).append(" "));
				rotulo.setText(texto.toString());
			}
		});
		laminaTexto = new  JPanel();
		rotulo = new JLabel("Mes seleccionado:	");
		laminaTexto.add(rotulo);
		add(laminaLista, BorderLayout.NORTH);
		add(laminaTexto, BorderLayout.SOUTH);
	}

}
