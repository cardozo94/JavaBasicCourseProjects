package practica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

public class LaminaProcesador extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextPane area;
	private JMenu fuente, estilo, tamano;
//	private JButton negritaBarra, cursivaBarra, subrayarBarra, azulBarra, amarilloBarra, rojoBarra, derechaBarra,
//			centroBarra, izquierdaBarra, justificadoBarra;
	private JToolBar barraH;

	public LaminaProcesador() {

		setLayout(new BorderLayout());

		JPanel laminaMenu = new JPanel();

		JMenuBar barra = new JMenuBar();

		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamano = new JMenu("Tamaño");

		configuraMenu("Arial", "Fuente", "Arial", Font.PLAIN, 12, "");
		configuraMenu("Courier", "Fuente", "Courier", Font.PLAIN, 12, "");
		configuraMenu("Verdana", "Fuente", "Verdana", Font.PLAIN, 12, "");

		configuraMenu("Negrita", "Estilo", "", Font.BOLD, 12, "resources/graphics/bold.gif");
		configuraMenu("Cursiva", "Estilo", "", Font.ITALIC, 12, "resources/graphics/italic.gif");

		/*
		 * JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new
		 * ImageIcon("resources/graphics/bold.gif")); JCheckBoxMenuItem cursiva = new
		 * JCheckBoxMenuItem("Cursiva", new ImageIcon("resources/graphics/italic.gif"));
		 * 
		 * negrita.addActionListener(new StyledEditorKit.BoldAction());
		 * cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		 * 
		 * estilo.add(negrita); estilo.add(cursiva);
		 */

		/*
		 * configuraMenu("12", "Tamaño", "", 1, 12, ""); configuraMenu("16", "Tamaño",
		 * "", 1, 16, ""); configuraMenu("20", "Tamaño", "", 1, 20, "");
		 * configuraMenu("24", "Tamaño", "", 1, 24, "");
		 */

		ButtonGroup tamanoletra = new ButtonGroup();

		JRadioButtonMenuItem tam12 = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem tam16 = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem tam20 = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem tam24 = new JRadioButtonMenuItem("24");
		/*
		 * atajos de teclado tam24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,
		 * InputEvent.CTRL_DOWN_MASK));
		 */

		tamanoletra.add(tam12);
		tamanoletra.add(tam16);
		tamanoletra.add(tam20);
		tamanoletra.add(tam24);

		tam12.addActionListener(new StyledEditorKit.FontSizeAction("cambioTamanño", 12));
		tam16.addActionListener(new StyledEditorKit.FontSizeAction("cambioTamanño", 16));
		tam20.addActionListener(new StyledEditorKit.FontSizeAction("cambioTamanño", 20));
		tam24.addActionListener(new StyledEditorKit.FontSizeAction("cambioTamanño", 24));

		tamano.add(tam12);
		tamano.add(tam16);
		tamano.add(tam20);
		tamano.add(tam24);

		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamano);

		laminaMenu.add(barra);

		add(laminaMenu, BorderLayout.NORTH);

		area = new JTextPane();
		add(area, BorderLayout.CENTER);

		JPopupMenu emergente = new JPopupMenu();

		JMenuItem negritaE = new JMenuItem("negrita");
		JMenuItem cursivaE = new JMenuItem("cursiva");

		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		// loq eu va a mostrar
		emergente.add(negritaE);
		emergente.add(cursivaE);
		// sobre que componete va funcionar
		area.setComponentPopupMenu(emergente);

		/*
		 * JToolBar barraH = new JToolBar();
		 * 
		 * JButton negritaBarra = new JButton(new
		 * ImageIcon("resources/graphics/bold.gif")); JButton cursivaBarra = new
		 * JButton(new ImageIcon("resources/graphics/italic.gif")); JButton
		 * subrayarBarra = new JButton(new
		 * ImageIcon("resources/graphics/underlined.gif"));
		 * 
		 * JButton azulBarra = new JButton(new
		 * ImageIcon("resources/graphics/blue.gif")); JButton amarilloBarra = new
		 * JButton(new ImageIcon("resources/graphics/yellow.gif")); JButton rojoBarra =
		 * new JButton(new ImageIcon("resources/graphics/red.gif"));
		 * 
		 * JButton derechaBarra = new JButton(new
		 * ImageIcon("resources/graphics/right.gif")); JButton centroBarra = new
		 * JButton(new ImageIcon("resources/graphics/center.gif")); JButton
		 * izquierdaBarra = new JButton(new ImageIcon("resources/graphics/left.gif"));
		 * JButton justificadoBarra = new JButton(new
		 * ImageIcon("resources/graphics/justified.gif"));
		 * 
		 * negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		 * cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		 * subrayarBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		 * 
		 * azulBarra.addActionListener(new
		 * StyledEditorKit.ForegroundAction("cambia color",Color.BLUE));
		 * amarilloBarra.addActionListener(new
		 * StyledEditorKit.ForegroundAction("cambia color",Color.YELLOW));
		 * rojoBarra.addActionListener(new
		 * StyledEditorKit.ForegroundAction("cambia color",Color.RED));
		 * 
		 * izquierdaBarra.addActionListener(new
		 * StyledEditorKit.AlignmentAction("izquieda", 0));
		 * centroBarra.addActionListener(new StyledEditorKit.AlignmentAction("izquieda",
		 * 1)); derechaBarra.addActionListener(new
		 * StyledEditorKit.AlignmentAction("izquieda", 2));
		 * justificadoBarra.addActionListener(new
		 * StyledEditorKit.AlignmentAction("izquieda", 3));
		 * 
		 * barraH.add(negritaBarra); barraH.add(cursivaBarra);
		 * barraH.add(subrayarBarra);
		 * 
		 * barraH.add(azulBarra); barraH.add(amarilloBarra); barraH.add(rojoBarra);
		 * 
		 * barraH.add(izquierdaBarra); barraH.add(centroBarra);
		 * barraH.add(derechaBarra); barraH.add(justificadoBarra);
		 */

		barraH = new JToolBar();
		
		configuraBarra("resources/graphics/bold.gif").addActionListener(new StyledEditorKit.BoldAction());
		configuraBarra("resources/graphics/italic.gif").addActionListener(new StyledEditorKit.ItalicAction());
		configuraBarra("resources/graphics/underlined.gif").addActionListener(new StyledEditorKit.UnderlineAction());
		
		barraH.addSeparator();
		
		configuraBarra("resources/graphics/blue.gif").addActionListener(new StyledEditorKit.ForegroundAction("Color azul", Color.BLUE));
		configuraBarra("resources/graphics/yellow.gif").addActionListener(new StyledEditorKit.ForegroundAction("Color amarillo", Color.YELLOW));
		configuraBarra("resources/graphics/red.gif").addActionListener(new StyledEditorKit.ForegroundAction("Color rojo", Color.RED));
		
		barraH.addSeparator();
		
		configuraBarra("resources/graphics/left.gif").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
		configuraBarra("resources/graphics/center.gif").addActionListener(new StyledEditorKit.AlignmentAction("centro", 1));
		configuraBarra("resources/graphics/right.gif").addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
		configuraBarra("resources/graphics/justified.gif").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
		
		barraH.setOrientation(1);
		add(barraH, BorderLayout.WEST);

	}

	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String iconPath) {
		JMenuItem elemMenu = new JMenuItem(rotulo, new ImageIcon(iconPath));
		if (menu == "Fuente") {
//			elemMenu.addActionListener(new GestionaFuente());
			elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", tipoLetra));
			fuente.add(elemMenu);
		} else if (menu == "Estilo") {
			if (estilos == Font.BOLD) {
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
			} else if (estilos == Font.ITALIC) {
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			estilo.add(elemMenu);
//			elemMenu.addActionListener(new GestionaEstilo());
		} /*
			 * else if (menu == "Tamaño") { elemMenu.addActionListener(new
			 * StyledEditorKit.FontSizeAction("Cambia tamaño", tam)); tamano.add(elemMenu);
			 * // elemMenu.addActionListener(new GestionaTamano()); }
			 */
	}
	
	public JButton configuraBarra(String ruta) {
		JButton boton = new JButton(new ImageIcon(ruta));
		barraH.add(boton);
		return boton;
	}

	/*
	 * private class GestionaFuente implements ActionListener {
	 * 
	 * @Override public void actionPerformed(ActionEvent e) { String font =
	 * ((JMenuItem) e.getSource()).getText(); Font letra = area.getFont();
	 * area.setFont(new Font(font, letra.getStyle(), letra.getSize())); }
	 * 
	 * }
	 * 
	 * private class GestionaEstilo implements ActionListener {
	 * 
	 * public int getStyle(String nombre, int previousStyle) { int estilo =
	 * Font.PLAIN; if (previousStyle == 1 || previousStyle == 2) estilo = Font.BOLD
	 * + Font.ITALIC; else if (nombre.equals("Negrita")) estilo = Font.BOLD; else if
	 * (nombre.equals("Cursiva")) estilo = Font.ITALIC; return estilo; }
	 * 
	 * @Override public void actionPerformed(ActionEvent e) { String estiloNombre =
	 * ((JMenuItem) e.getSource()).getText(); Font letra = area.getFont(); int
	 * estilo = getStyle(estiloNombre, letra.getStyle()); area.setFont(new
	 * Font(letra.getFontName(), estilo, letra.getSize())); }
	 * 
	 * }
	 * 
	 * private class GestionaTamano implements ActionListener {
	 * 
	 * @Override public void actionPerformed(ActionEvent e) { int tamano =
	 * Integer.parseInt(((JMenuItem) e.getSource()).getText()); Font letra =
	 * area.getFont(); area.setFont(new Font(letra.getFontName(), letra.getStyle(),
	 * tamano)); }
	 * 
	 * }
	 */
}
