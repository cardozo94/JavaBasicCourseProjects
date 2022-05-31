package swingavanzado;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class MarcoArbol extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MarcoArbol() {
		setTitle("Arbol sencillo");
		setBounds(350, 300, 600, 200);
		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Mundo");
		DefaultMutableTreeNode continente = new DefaultMutableTreeNode("Europa");
		raiz.add(continente);
		DefaultMutableTreeNode pais = new DefaultMutableTreeNode("España");
		continente.add(pais);
		DefaultMutableTreeNode comunidad = new DefaultMutableTreeNode("Madrid");
		pais.add(comunidad);
		DefaultMutableTreeNode ciudad = new DefaultMutableTreeNode("Móstoles");
		comunidad.add(ciudad);
		ciudad = new DefaultMutableTreeNode("Alcobendas");
		comunidad.add(ciudad);
		comunidad = new DefaultMutableTreeNode("Cantabria");
		pais.add(comunidad);
		ciudad = new DefaultMutableTreeNode("Santillana del Mar");
		comunidad.add(ciudad);
		pais = new DefaultMutableTreeNode("Alemania");
		continente.add(pais);
		comunidad = new DefaultMutableTreeNode("Baviera");
		pais.add(comunidad);
		ciudad = new DefaultMutableTreeNode("Munich");
		comunidad.add(ciudad);
		JTree arbol = new JTree(raiz);
//		LaminaArbol lamina = new LaminaArbol(arbol);
//		add(lamina);
		Container laminaContenido = getContentPane();
		laminaContenido.add(new JScrollPane(arbol));
	}

}
