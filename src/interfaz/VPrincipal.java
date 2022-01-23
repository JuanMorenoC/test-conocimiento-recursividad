package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * Proyecto final presentado por:
	 * JUAN DAVID MORENO CIFUENTES
	 * DIEGO ALEJANDRO CALVO
	 * JULIO CESAR LOAIZA
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VPrincipal frame = new VPrincipal();
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
	public VPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//boton estadistica
		JButton btnTestDeConocimiento = new JButton("Estadisticas");
		btnTestDeConocimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEstadistica ve = new VentanaEstadistica();
				ve.setVisible(true);
				setVisible(false);
			}
		});
		btnTestDeConocimiento.setBounds(195, 111, 158, 23);
		contentPane.add(btnTestDeConocimiento);
		//boton encuesta
		JButton btnEncuesta = new JButton("Encuesta");
		btnEncuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			PersonaRegistro pr = new PersonaRegistro();
			pr.setVisible(true);
			}
		});
		btnEncuesta.setBounds(195, 159, 158, 23);
		contentPane.add(btnEncuesta);
		//boton test
		JButton btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
			VTest3 vt = new VTest3();
			vt.setVisible(true);
			setVisible(false);
			}
		});
		btnTest.setBounds(195, 217, 158, 23);
		contentPane.add(btnTest);
		//boton salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			System.exit(0);
			
			}
		});
		btnSalir.setBounds(231, 277, 89, 23);
		contentPane.add(btnSalir);
	}
}//fin de la clase