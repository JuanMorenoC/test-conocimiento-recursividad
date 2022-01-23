package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Archivos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VConocimientoPrevio extends JFrame {

	private JPanel contentPane;
	Archivos archivo;
	/**
	 * Launch the application.
	 * clase de ventana de conocimeinto previo
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VConocimientoPrevio frame = new VConocimientoPrevio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VConocimientoPrevio() {
		archivo=new Archivos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPregunta = new JButton("Pregunta 1");
		btnPregunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=0;
				int b=1;
				archivo.leerArchivo1(a,b);
			}
		});
		btnPregunta.setBounds(49, 22, 108, 23);
		contentPane.add(btnPregunta);
		
		JButton btnPregunta_1 = new JButton("Pregunta 2");
		btnPregunta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=1;
				int b=2;
				archivo.leerArchivo1(a,b);
			}
		});
		btnPregunta_1.setBounds(194, 22, 108, 23);
		contentPane.add(btnPregunta_1);
		
		JButton btnPregunta_2 = new JButton("Pregunta 3");
		btnPregunta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=2;
				int b=3;
				archivo.leerArchivo1(a,b);
			}
		});
		btnPregunta_2.setBounds(49, 56, 108, 23);
		contentPane.add(btnPregunta_2);
		
		JButton btnPregunta_3 = new JButton("Pregunta 4");
		btnPregunta_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=3;
				int b=4;
				archivo.leerArchivo1(a,b);
			}
		});
		btnPregunta_3.setBounds(194, 56, 108, 23);
		contentPane.add(btnPregunta_3);
		
		JButton btnPregunta_4 = new JButton("Pregunta 5");
		btnPregunta_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=4;
				int b=5;
				archivo.leerArchivo1(a,b);
			}
		});
		btnPregunta_4.setBounds(49, 90, 108, 23);
		contentPane.add(btnPregunta_4);
		
		JButton btnPregunta_5 = new JButton("Pregunta 6");
		btnPregunta_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=5;
				int b=6;
				archivo.leerArchivo1(a,b);
			}
		});
		btnPregunta_5.setBounds(194, 90, 108, 23);
		contentPane.add(btnPregunta_5);
		
		JButton btnPregunta_6 = new JButton("Pregunta 7");
		btnPregunta_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=6;
				int b=7;
				archivo.leerArchivo1(a,b);
			}
		});
		btnPregunta_6.setBounds(49, 124, 108, 23);
		contentPane.add(btnPregunta_6);
		
		JButton btnPregunta_7 = new JButton("Pregunta 8");
		btnPregunta_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=7;
				int b=8;
				archivo.leerArchivo1(a,b);
			}
		});
		btnPregunta_7.setBounds(194, 124, 108, 23);
		contentPane.add(btnPregunta_7);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaEstadistica ve = new VentanaEstadistica();
				ve.setVisible(true);
				setVisible(false);
			}
		});
		btnVolver.setBounds(328, 56, 89, 23);
		contentPane.add(btnVolver);
	}

}
