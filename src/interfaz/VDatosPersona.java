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

public class VDatosPersona extends JFrame {

	private JPanel contentPane;
	Archivos archivo;
	/**
	 * Launch the application.
	 * clase de datos persona
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VDatosPersona frame = new VDatosPersona();
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
	public VDatosPersona() {
		archivo=new Archivos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPregunta = new JButton("Grafica edad");
		btnPregunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=0;
				archivo.leerArchivo5(a);
			}
		});
		btnPregunta.setBounds(68, 22, 175, 23);
		contentPane.add(btnPregunta);
		
		JButton btnPregunta_1 = new JButton("Grafica genero");
		btnPregunta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=1;
				archivo.leerArchivo5(a);
			}
		});
		btnPregunta_1.setBounds(68, 90, 175, 23);
		contentPane.add(btnPregunta_1);
		
		JButton btnPregunta_2 = new JButton("Grafica estratosocioeconomico");
		btnPregunta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=3;
				archivo.leerArchivo5(a);
			}
		});
		btnPregunta_2.setBounds(68, 56, 175, 23);
		contentPane.add(btnPregunta_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaEstadistica ve = new VentanaEstadistica();
				ve.setVisible(true);
				setVisible(false);
			}
		});
		btnVolver.setBounds(319, 22, 89, 23);
		contentPane.add(btnVolver);
	}

}
