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

public class VDificultadesAprendizajes extends JFrame {

	private JPanel contentPane;
	Archivos archivo;
	/**
	 * Launch the application.
	 * clase de dificultad de aprendizaje
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VDificultadesAprendizajes frame = new VDificultadesAprendizajes();
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
	public VDificultadesAprendizajes() {
		archivo=new Archivos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPregunta = new JButton("Pregunta 26");
		btnPregunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=0;
				int b=26;
				archivo.leerArchivo4(a,b);
			}
		});
		btnPregunta.setBounds(46, 22, 111, 23);
		contentPane.add(btnPregunta);
		
		JButton btnPregunta_1 = new JButton("Pregunta 27");
		btnPregunta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=1;
				int b=27;
				archivo.leerArchivo4(a,b);
			}
		});
		btnPregunta_1.setBounds(194, 22, 111, 23);
		contentPane.add(btnPregunta_1);
		
		JButton btnPregunta_2 = new JButton("Pregunta 28");
		btnPregunta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=2;
				int b=28;
				archivo.leerArchivo4(a,b);
			}
		});
		btnPregunta_2.setBounds(46, 56, 111, 23);
		contentPane.add(btnPregunta_2);
		
		JButton btnPregunta_3 = new JButton("Pregunta 29");
		btnPregunta_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=3;
				int b=29;
				archivo.leerArchivo4(a,b);
			}
		});
		btnPregunta_3.setBounds(194, 56, 111, 23);
		contentPane.add(btnPregunta_3);
		
		JButton btnPregunta_4 = new JButton("Pregunta 30");
		btnPregunta_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=4;
				int b=30;
				archivo.leerArchivo4(a,b);
			}
		});
		btnPregunta_4.setBounds(46, 90, 111, 23);
		contentPane.add(btnPregunta_4);
		
		JButton btnPregunta_5 = new JButton("Pregunta 31");
		btnPregunta_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=5;
				int b=31;
				archivo.leerArchivo4(a,b);
			}
		});
		btnPregunta_5.setBounds(194, 90, 111, 23);
		contentPane.add(btnPregunta_5);
		
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
