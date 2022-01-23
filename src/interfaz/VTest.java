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

public class VTest extends JFrame {

	private JPanel contentPane;
	Archivos archivo;
	/**
	 * Launch the application.
	 * clase de la ventana de test de conocimiento
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VTest frame = new VTest();
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
	public VTest() {
		archivo=new Archivos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPregunta = new JButton("Pregunta 1");
		btnPregunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=0;
				int b=1;
				archivo.leerArchivo6(a, b);
			}
		});
		btnPregunta.setBounds(68, 22, 89, 23);
		contentPane.add(btnPregunta);
		
		JButton btnPregunta_1 = new JButton("Pregunta 2");
		btnPregunta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=1;
				int b=2;
				archivo.leerArchivo6(a, b);
			}
		});
		btnPregunta_1.setBounds(194, 22, 89, 23);
		contentPane.add(btnPregunta_1);
		
		JButton btnPregunta_2 = new JButton("Pregunta 3");
		btnPregunta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=2;
				int b=3;
				archivo.leerArchivo6(a, b);
			}
		});
		btnPregunta_2.setBounds(68, 56, 89, 23);
		contentPane.add(btnPregunta_2);
		
		JButton btnPregunta_3 = new JButton("Pregunta 4");
		btnPregunta_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=3;
				int b=4;
				archivo.leerArchivo6(a, b);
			}
		});
		btnPregunta_3.setBounds(194, 56, 89, 23);
		contentPane.add(btnPregunta_3);
		
		JButton btnPregunta_4 = new JButton("Pregunta 5");
		btnPregunta_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=4;
				int b=5;
				archivo.leerArchivo6(a, b);
			}
		});
		btnPregunta_4.setBounds(68, 90, 89, 23);
		contentPane.add(btnPregunta_4);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaEstadistica ve = new VentanaEstadistica();
				ve.setVisible(true);
				setVisible(false);
			}
		});
		btnVolver.setBounds(333, 22, 89, 23);
		contentPane.add(btnVolver);
	}

}
