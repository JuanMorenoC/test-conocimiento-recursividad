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
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VCorrelacion extends JFrame {

	private JPanel contentPane;
	Archivos archivo;
	/**
	 * Launch the application.
	 * clase de correlacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCorrelacion frame = new VCorrelacion();
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
	public VCorrelacion() {
		archivo=new Archivos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEstadistica ve = new VentanaEstadistica();
				ve.setVisible(true);
				setVisible(false);
			}
		});
		btnVolver.setBounds(314, 30, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnCorrelacionConocimientoPrevio = new JButton("Correlacion conocimiento previo");
		btnCorrelacionConocimientoPrevio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=2;
				int b=4;
				archivo.leerArchivos1(a, b);
			}
		});
		btnCorrelacionConocimientoPrevio.setBounds(20, 30, 250, 23);
		contentPane.add(btnCorrelacionConocimientoPrevio);
		
		JButton btnCorrelacionAptitudY = new JButton("Correlacion aptitud y actitud");
		btnCorrelacionAptitudY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=10;
				int b=16;
				archivo.leerArchivos2(a, b);
			}
		});
		btnCorrelacionAptitudY.setBounds(20, 76, 250, 23);
		contentPane.add(btnCorrelacionAptitudY);
		
		JButton btnCorrelacionConocimientoRecursividad = new JButton("Correlacion conocimiento recursividad ");
		btnCorrelacionConocimientoRecursividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a= 19;
				int b=24;
				archivo.leerArchivos3(a, b);
			}
		});
		btnCorrelacionConocimientoRecursividad.setBounds(20, 123, 250, 23);
		contentPane.add(btnCorrelacionConocimientoRecursividad);
		
		JButton btnNewButton = new JButton("Correlacion dificcultad de aprendizaje");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=28;
				int b=30;
				archivo.leerArchivos4(a, b);
			}
		});
		btnNewButton.setBounds(20, 170, 250, 23);
		contentPane.add(btnNewButton);
	}

}
