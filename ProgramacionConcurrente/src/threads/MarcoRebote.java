package threads;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoRebote extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LaminaPelota lamina;
	private Thread hilo1, hilo2, hilo3;
	JButton dale1, dale2, dale3, detener1, detener2, detener3;

	public MarcoRebote() {
		setBounds(600, 300, 600, 350);
		setTitle("Rebotes");
		lamina = new LaminaPelota();
		add(lamina, BorderLayout.CENTER);
		JPanel laminaBotones = new JPanel();
//		ponerBoton(laminaBotones, "Dale!", new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				comienzaElJuego();
//
//			}
//		});

//		ponerBoton(laminaBotones, "Salir", new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//
//			}
//		});
//
//		ponerBoton(laminaBotones, "Detener", new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				detener();
//			}
//		});

		dale1 = new JButton("Hilo1");
		dale1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comienzaElJuego(e);

			}
		});
		laminaBotones.add(dale1);
		dale2 = new JButton("Hilo2");
		dale2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comienzaElJuego(e);

			}
		});
		laminaBotones.add(dale2);

		dale3 = new JButton("Hilo3");
		dale3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comienzaElJuego(e);

			}
		});
		laminaBotones.add(dale3);

		detener1 = new JButton("DetenerHilo1");
		detener1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				detener(e);

			}
		});
		laminaBotones.add(detener1);

		detener2 = new JButton("DetenerHilo2");
		detener2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				detener(e);

			}
		});
		laminaBotones.add(detener2);

		detener3 = new JButton("DetenerHilo3");
		detener3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				detener(e);

			}
		});
		laminaBotones.add(detener3);
		add(laminaBotones, BorderLayout.SOUTH);
	}

	public void ponerBoton(Container container, String titulo, ActionListener listener) {
		JButton boton = new JButton(titulo);
		container.add(boton);
		boton.addActionListener(listener);
	}

	public void comienzaElJuego(ActionEvent e) {
		Pelota pelota = new Pelota();
		lamina.add(pelota);
		Runnable runnable = new PelotaHilos(pelota, lamina);
//		hilo = new Thread(runnable);
//		hilo.start();
		if (e.getSource().equals(dale1)) {
			hilo1 = new Thread(runnable);
			hilo1.start();
		} else if (e.getSource().equals(dale2)) {
			hilo2 = new Thread(runnable);
			hilo2.start();
		} else if (e.getSource().equals(dale3)) {
			hilo3 = new Thread(runnable);
			hilo3.start();
		}

	}

	public void detener(ActionEvent e) {
//		hilo.stop();
//		hilo.interrupt();
		if (e.getSource().equals(detener1))
			hilo1.interrupt();
		else if (e.getSource().equals(detener2))
			hilo2.interrupt();
		else if (e.getSource().equals(detener3))
			hilo3.interrupt();
	}

}
