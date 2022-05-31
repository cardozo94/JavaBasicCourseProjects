package applets.parametros;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class LaminaGrafico extends JPanel {

	/*private int heightGraf1;
	private int heightGraf2;
	private int heightGraf3;
	
	public LaminaGrafico(int a, int b, int c) {
		heightGraf1 = a;
		heightGraf2 = b;
		heightGraf3 = c;
		
	}
	
	public int getHeightGraf1() {
		return heightGraf1;
	}

	public void setHeightGraf1(int heightGraf1) {
		this.heightGraf1 = heightGraf1;
	}

	public int getHeightGraf2() {
		return heightGraf2;
	}

	public void setHeightGraf2(int heightGraf2) {
		this.heightGraf2 = heightGraf2;
	}

	public int getHeightGraf3() {
		return heightGraf3;
	}

	public void setHeightGraf3(int heightGraf3) {
		this.heightGraf3 = heightGraf3;
	}*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int [] barras;
	
	public LaminaGrafico(int... barras) {
		this.setBarras(barras);
	}

	public int [] getBarras() {
		return barras;
	}

	public void setBarras(int [] barras) {
		this.barras = barras;
	}

	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.rotate(180/180.0*Math.PI, 125, 100);
		int location =0;
		for (int i = 0; i < getBarras().length; i++) {
			generateRectangle(location, barras[i], g2);
			location+=25;
		}
		
		/*Rectangle2D graf1 = new Rectangle2D.Double(50, 0, 50, getHeightGraf1());
		Rectangle2D graf2 = new Rectangle2D.Double(100, 0, 50, getHeightGraf2());
		Rectangle2D graf3 = new Rectangle2D.Double(150, 0, 50, getHeightGraf3());
		
		g2.setPaint(Color.RED);
		g2.fill(graf1);
		
		g2.setPaint(Color.YELLOW);
		g2.fill(graf2);
		
		g2.setPaint(Color.GREEN);
		g2.fill(graf3);*/
		
	}
	public void generateRectangle(int location, int height, Graphics2D g2) {
		Rectangle2D graf = new Rectangle2D.Double(location, 0, 25, height);
		g2.setPaint(new Color((int) Math.round(Math.random()*200),(int) Math.round(Math.random()*200),(int) Math.round(Math.random()*200)));
		g2.fill(graf);
	}
}
