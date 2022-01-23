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

public class VConocimientoRecursividad extends JFrame {

	private JPanel contentPane;
	Archivos archivo;
	/**
	 * Launch the application.
	 * clase de conocimiento recursividad
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VConocimientoRecursividad frame = new VConocimientoRecursividad();
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
	public VConocimientoRecursividad() {
		archivo=new Archivos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPregunta = new JButton("Pregunta 18");
		btnPregunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=0;
				int b=18;
				archivo.leerArchivo3(a,b);
			}
		});
		btnPregunta.setBounds(43, 22, 114, 23);
		contentPane.add(btnPregunta);
		
		JButton btnPregunta_1 = new JButton("Pregunta 19");
		btnPregunta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=1;
				int b=19;
				archivo.leerArchivo3(a,b);
			}
		});
		btnPregunta_1.setBounds(194, 22, 106, 23);
		contentPane.add(btnPregunta_1);
		
		JButton btnPregunta_2 = new JButton("Pregunta 20");
		btnPregunta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=2;
				int b=20;
				archivo.leerArchivo3(a,b);
			}
		});
		btnPregunta_2.setBounds(43, 56, 114, 23);
		contentPane.add(btnPregunta_2);
		
		JButton btnPregunta_3 = new JButton("Pregunta 21");
		btnPregunta_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=3;
				int b=21;
				archivo.leerArchivo3(a,b);
			}
		});
		btnPregunta_3.setBounds(194, 56, 106, 23);
		contentPane.add(btnPregunta_3);
		
		JButton btnPregunta_4 = new JButton("Pregunta 22");
		btnPregunta_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=4;
				int b=22;
				archivo.leerArchivo3(a,b);
			}
		});
		btnPregunta_4.setBounds(43, 90, 114, 23);
		contentPane.add(btnPregunta_4);
		
		JButton btnPregunta_5 = new JButton("Pregunta 23");
		btnPregunta_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=5;
				int b=23;
				archivo.leerArchivo3(a,b);
			}
		});
		btnPregunta_5.setBounds(194, 90, 106, 23);
		contentPane.add(btnPregunta_5);
		
		JButton btnPregunta_6 = new JButton("Pregunta 24");
		btnPregunta_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=6;
				int b=24;
				archivo.leerArchivo3(a,b);
			}
		});
		btnPregunta_6.setBounds(43, 124, 114, 23);
		contentPane.add(btnPregunta_6);
		
		JButton btnPregunta_7 = new JButton("Pregunta 25");
		btnPregunta_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=7;
				int b=25;
				archivo.leerArchivo3(a,b);
			}
		});
		btnPregunta_7.setBounds(194, 124, 106, 23);
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
