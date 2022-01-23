package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEstadistica extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * 
	 * Clase ventana estadistica
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEstadistica frame = new VentanaEstadistica();
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
	public VentanaEstadistica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//boton conocimiento estadistica
		JButton btnConocimientosPrevios = new JButton("Conocimiento previo en programaci\u00F3n");
		btnConocimientosPrevios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VConocimientoPrevio vc = new VConocimientoPrevio();
				vc.setVisible(true);
				setVisible(false);
			}
		});
		btnConocimientosPrevios.setBounds(81, 52, 268, 23);
		contentPane.add(btnConocimientosPrevios);
		//boton aptitud y actitud
		JButton btnActitudesYAptitudes = new JButton("Actitud y aptitud frente a la programaci\u00F3n");
		btnActitudesYAptitudes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VAptitud va = new VAptitud();
				va.setVisible(true);
				setVisible(false);
			}
		});
		btnActitudesYAptitudes.setBounds(81, 103, 268, 23);
		contentPane.add(btnActitudesYAptitudes);
		//boton conocimiento de recursividad
		JButton btnConocimientosDeLa = new JButton("Conocimientos de la recursividad");
		btnConocimientosDeLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VConocimientoRecursividad vcr = new VConocimientoRecursividad();
				vcr.setVisible(true);
				setVisible(false);
			}
		});
		btnConocimientosDeLa.setBounds(81, 149, 268, 23);
		contentPane.add(btnConocimientosDeLa);
		//boton de dificultad de aprendizaje
		JButton btnDificultadesDelAprendizaje = new JButton("Dificultades del aprendizaje de la recursividad");
		btnDificultadesDelAprendizaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VDificultadesAprendizajes vd = new VDificultadesAprendizajes();
				vd.setVisible(true);
				setVisible(false);
			}
		});
		btnDificultadesDelAprendizaje.setBounds(81, 197, 268, 23);
		contentPane.add(btnDificultadesDelAprendizaje);
		//boton de 5 preguntas
		JButton btnTestPreguntas = new JButton("Test 5 preguntas");
		btnTestPreguntas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VTest vt = new VTest();
				vt.setVisible(true);
				setVisible(false);
			}
		});
		btnTestPreguntas.setBounds(81, 242, 268, 23);
		contentPane.add(btnTestPreguntas);
		//boton volver
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			VPrincipal vp = new VPrincipal();
			vp.setVisible(true);
			setVisible(false);
			}
		});
		btnVolver.setBounds(453, 52, 89, 23);
		contentPane.add(btnVolver);
		//botyon datos persona
		JButton btnDatosPersona = new JButton("Datos persona");
		btnDatosPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VDatosPersona vdp = new VDatosPersona();
				vdp.setVisible(true);
				setVisible(false);
			}
		});
		btnDatosPersona.setBounds(81, 287, 268, 23);
		contentPane.add(btnDatosPersona);
		
		JButton btnNewButton = new JButton("Correlaci\u00F3n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VCorrelacion vco = new VCorrelacion();
				vco.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(81, 321, 268, 23);
		contentPane.add(btnNewButton);
	}
}//fin de la clase
