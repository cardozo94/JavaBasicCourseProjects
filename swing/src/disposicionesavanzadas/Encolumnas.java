package disposicionesavanzadas;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
/**
 * Construye disposición propia
 **/
public class Encolumnas implements LayoutManager {
	
	private int x;
	private int y = 20;

	@Override
	public void addLayoutComponent(String name, Component comp) {
		

	}

	@Override
	public void removeLayoutComponent(Component comp) {
		

	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		
		return null;
	}

	@Override
	public void layoutContainer(Container parent) {
		
		int contador = 0;
		int n = parent.getComponentCount();
		
		int d= parent.getWidth();
		x= d /2;
		
		for (int i = 0; i < n; i++) {
			contador++;
			Component c = parent.getComponent(i);
			c.setBounds(x-100, y, 100, 20);
			x+= 100;
			if(contador%2==0) {
				x=d/2;
				y+=40;
			}
		}

	}

}
