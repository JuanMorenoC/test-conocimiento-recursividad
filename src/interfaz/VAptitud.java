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

public class VAptitud extends JFrame {

	private JPanel contentPane;
	Archivos archivo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VAptitud frame = new VAptitud();
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
	public VAptitud() {
		archivo=new Archivos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPregunta = new JButton("Pregunta 9");
		btnPregunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=0;
				int b=9;
				archivo.leerArchivo2(a,b);
			}
		});
		btnPregunta.setBounds(48, 22, 109, 23);
		contentPane.add(btnPregunta);
		
		JButton btnPregunta_1 = new JButton("Pregunta 10");
		btnPregunta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=1;
				int b=10;
				archivo.leerArchivo2(a,b);
			}
		});
		btnPregunta_1.setBounds(194, 22, 109, 23);
		contentPane.add(btnPregunta_1);
		
		JButton btnPregunta_2 = new JButton("Pregunta 11");
		btnPregunta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=2;
				int b=11;
				archivo.leerArchivo2(a,b);
			}
		});
		btnPregunta_2.setBounds(48, 56, 109, 23);
		contentPane.add(btnPregunta_2);
		
		JButton btnPregunta_3 = new JButton("Pregunta 12");
		btnPregunta_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=3;
				int b=12;
				archivo.leerArchivo2(a,b);
			}
		});
		btnPregunta_3.setBounds(194, 56, 109, 23);
		contentPane.add(btnPregunta_3);
		
		JButton btnPregunta_4 = new JButton("Pregunta 13");
		btnPregunta_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=4;
				int b=13;
				archivo.leerArchivo2(a,b);
			}
		});
		btnPregunta_4.setBounds(48, 90, 109, 23);
		contentPane.add(btnPregunta_4);
		
		JButton btnPregunta_5 = new JButton("Pregunta 14");
		btnPregunta_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=5;
				int b=14;
				archivo.leerArchivo2(a,b);
			}
		});
		btnPregunta_5.setBounds(194, 90, 109, 23);
		contentPane.add(btnPregunta_5);
		
		JButton btnPregunta_6 = new JButton("Pregunta 15");
		btnPregunta_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=6;
				int b=15;
				archivo.leerArchivo2(a,b);
			}
		});
		btnPregunta_6.setBounds(48, 124, 109, 23);
		contentPane.add(btnPregunta_6);
		
		JButton btnPregunta_7 = new JButton("Pregunta 16");
		btnPregunta_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=7;
				int b=16;
				archivo.leerArchivo2(a,b);
			}
		});
		btnPregunta_7.setBounds(194, 124, 109, 23);
		contentPane.add(btnPregunta_7);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaEstadistica ve = new VentanaEstadistica();
				ve.setVisible(true);
				setVisible(false);
			}
		});
		btnVolver.setBounds(324, 124, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnPregunta_8 = new JButton("Pregunta 17");
		btnPregunta_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=8;
				int b=17;
				archivo.leerArchivo2(a, b);
			}
		});
		btnPregunta_8.setBounds(324, 22, 109, 23);
		contentPane.add(btnPregunta_8);
	}

}
