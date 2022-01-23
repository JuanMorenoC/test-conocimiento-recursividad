package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Archivos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonaRegistro extends JFrame {
	//clase persona registro

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_4;
	private String genero = "";
	private String trabaja = "";
	private String repitente = "";
	private String egresado = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonaRegistro frame = new PersonaRegistro();
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
	public PersonaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 627, 813);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Edad:");
		lblNombre.setBounds(21, 54, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Genero:");
		lblApellido.setBounds(21, 94, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblEstratoScio = new JLabel("Estrato socioeconomico: ");
		lblEstratoScio.setBounds(21, 137, 142, 14);
		contentPane.add(lblEstratoScio);
		
		JLabel lblEstadoCivil = new JLabel("Estado civil:");
		lblEstadoCivil.setBounds(21, 170, 78, 14);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblTrabajaActualmente = new JLabel("Trabaja actualmente:");
		lblTrabajaActualmente.setBounds(21, 213, 142, 14);
		contentPane.add(lblTrabajaActualmente);
		
		JLabel lblNumeroDePersonas = new JLabel("Numero de personas a cargo:");
		lblNumeroDePersonas.setBounds(21, 259, 196, 14);
		contentPane.add(lblNumeroDePersonas);
		
		JLabel lblPromedioAcumuladoEn = new JLabel("Promedio acumulado en la universidad:");
		lblPromedioAcumuladoEn.setBounds(21, 298, 266, 14);
		contentPane.add(lblPromedioAcumuladoEn);
		
		JLabel lblRepitenteDelCurso = new JLabel("Repitente del curso:");
		lblRepitenteDelCurso.setBounds(21, 329, 125, 14);
		contentPane.add(lblRepitenteDelCurso);
		
		JLabel lblEgresadoDelColegio = new JLabel("Egresado del colegio:");
		lblEgresadoDelColegio.setBounds(21, 368, 125, 14);
		contentPane.add(lblEgresadoDelColegio);
		
		JLabel lblPromedioDeColegio = new JLabel("Promedio de colegio:");
		lblPromedioDeColegio.setBounds(21, 399, 142, 14);
		contentPane.add(lblPromedioDeColegio);
		
		JLabel lblPruebasDeEstado = new JLabel("Pruebas de estado:");
		lblPruebasDeEstado.setBounds(21, 438, 142, 14);
		contentPane.add(lblPruebasDeEstado);
		
		JLabel lblLugarDeResidencia = new JLabel("Lugar de residencia:");
		lblLugarDeResidencia.setBounds(21, 463, 142, 14);
		contentPane.add(lblLugarDeResidencia);
		
		textField = new JTextField();
		textField.setBounds(148, 51, 158, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblHombre = new JLabel("Hombre:");
		lblHombre.setBounds(131, 94, 63, 14);
		contentPane.add(lblHombre);
		
		JLabel lblMujer = new JLabel("Mujer:");
		lblMujer.setBounds(241, 94, 46, 14);
		contentPane.add(lblMujer);
		
		textField_1 = new JTextField();
		textField_1.setBounds(204, 91, 27, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(279, 91, 27, 20);
		contentPane.add(textField_2);
		
		JLabel lblEntreY = new JLabel("Entre 1 y 6");
		lblEntreY.setBounds(173, 137, 71, 14);
		contentPane.add(lblEntreY);
		
		textField_3 = new JTextField();
		textField_3.setBounds(254, 134, 52, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblmarqueConUna = new JLabel("  (Marque con una X)");
		lblmarqueConUna.setForeground(new Color(255, 0, 0));
		lblmarqueConUna.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblmarqueConUna.setBounds(371, 94, 158, 14);
		contentPane.add(lblmarqueConUna);
		
		JLabel lblmarqueConUna_1 = new JLabel("  (Marque con una de 1 a 6)");
		lblmarqueConUna_1.setForeground(Color.RED);
		lblmarqueConUna_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblmarqueConUna_1.setBounds(371, 137, 158, 14);
		contentPane.add(lblmarqueConUna_1);
		
		JLabel label = new JLabel("  (Marque con una X)");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(371, 213, 158, 14);
		contentPane.add(label);
		
		JLabel lblSi = new JLabel("si: ");
		lblSi.setBounds(171, 213, 46, 14);
		contentPane.add(lblSi);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(204, 213, 27, 20);
		contentPane.add(textField_8);
		
		JLabel lblNo = new JLabel("no: ");
		lblNo.setBounds(241, 213, 46, 14);
		contentPane.add(lblNo);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(279, 210, 27, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(254, 256, 52, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(243, 295, 63, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel label_2 = new JLabel("si: ");
		label_2.setBounds(171, 329, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("no: ");
		label_3.setBounds(241, 329, 46, 14);
		contentPane.add(label_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(204, 326, 27, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(279, 326, 27, 20);
		contentPane.add(textField_13);
		
		JLabel lblPublico = new JLabel("Publico:");
		lblPublico.setBounds(148, 368, 46, 14);
		contentPane.add(lblPublico);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(193, 365, 27, 20);
		contentPane.add(textField_14);
		
		JLabel lblPrivado = new JLabel("Privado");
		lblPrivado.setBounds(230, 368, 46, 14);
		contentPane.add(lblPrivado);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(279, 365, 27, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBounds(220, 396, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(220, 435, 86, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(220, 460, 86, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNivelEducativoDe = new JLabel("Nivel educativo de la madre: ");
		lblNivelEducativoDe.setBounds(21, 487, 169, 27);
		contentPane.add(lblNivelEducativoDe);
		
		JLabel lblNivelEducativoDel = new JLabel("Nivel educativo del padre:  ");
		lblNivelEducativoDel.setBounds(21, 525, 184, 20);
		contentPane.add(lblNivelEducativoDel);
		
		textField_19 = new JTextField();
		textField_19.setBounds(220, 491, 86, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(220, 525, 86, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNmeroDeHermanos = new JLabel("N\u00FAmero de hermanos: ");
		lblNmeroDeHermanos.setBounds(21, 568, 125, 14);
		contentPane.add(lblNmeroDeHermanos);
		
		textField_21 = new JTextField();
		textField_21.setBounds(220, 565, 86, 20);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Posici\u00F3n entre hermanos:");
		lblNewLabel.setBounds(21, 608, 152, 14);
		contentPane.add(lblNewLabel);
		
		textField_22 = new JTextField();
		textField_22.setBounds(220, 605, 86, 20);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblTipoDeVivienda = new JLabel("Tipo de Vivienda: ");
		lblTipoDeVivienda.setBounds(21, 642, 125, 14);
		contentPane.add(lblTipoDeVivienda);
		
		textField_23 = new JTextField();
		textField_23.setBounds(220, 636, 86, 20);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(220, 167, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VPrincipal vp = new VPrincipal();
				vp.setVisible(true);
				setVisible(false);
			}
		});
		btnAtras.setBounds(371, 614, 89, 23);
		contentPane.add(btnAtras);
		//boton para seguir a la siguiente ventana para llenar as preguntas
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			if(textField.getText().isEmpty() ||  textField_10.getText().isEmpty()||
					textField_11.getText().isEmpty()|| textField_16.getText().isEmpty()
					|| textField_17.getText().isEmpty() || textField_18.getText().isEmpty() || textField_19.getText().isEmpty()
					 || textField_20.getText().isEmpty() || textField_21.getText().isEmpty()
					|| textField_22.getText().isEmpty() || textField_23.getText().isEmpty() || textField_3.getText().isEmpty()
					|| textField_4.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Por favor rellene los campos:  ");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_8.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_9.setText("");
				
			}else
			{
				if(textField_1.getText()!= null && textField_18.getText().isEmpty() || textField_1.getText().isEmpty() && textField_2 != null ||
				   textField_8!= null && textField_9.getText().isEmpty() || textField_8.getText().isEmpty() && textField_9 != null ||
						textField_12!= null && textField_13.getText().isEmpty()|| textField_12.getText().isEmpty() && textField_13 != null ||
						textField_14 != null && textField_15.getText().isEmpty() || textField_14.getText().isEmpty() && textField_15 != null)
				{
					
					VentanaTablas vt = new VentanaTablas();
					vt.setVisible(true);
					setVisible(false);
					
				}else
				{
					JOptionPane.showMessageDialog(null,"Por favor seleccione solo un campo en donde tiene mas de 1 opcion ");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_10.setText("");
					textField_11.setText("");
					textField_12.setText("");
					textField_8.setText("");
					textField_13.setText("");
					textField_14.setText("");
					textField_15.setText("");
					textField_16.setText("");
					textField_17.setText("");
					textField_18.setText("");
					textField_19.setText("");
					textField_20.setText("");
					textField_21.setText("");
					textField_22.setText("");
					textField_23.setText("");
					textField_9.setText("");
					
				}
				
			}
			}//Final de metodo
		});
		btnSiguiente.setBounds(475, 614, 89, 23);
		contentPane.add(btnSiguiente);
		
		JLabel label_1 = new JLabel("  (Marque con una X)");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(371, 329, 158, 14);
		contentPane.add(label_1);
		
		JLabel label_4 = new JLabel("  (Marque con una X)");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(371, 368, 158, 14);
		contentPane.add(label_4);
		//boton de registrar datos de la persona
		//validaciones y registros
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(textField.getText().isEmpty() ||  textField_10.getText().isEmpty()||
						textField_11.getText().isEmpty()|| textField_16.getText().isEmpty()
						|| textField_17.getText().isEmpty() || textField_18.getText().isEmpty() || textField_19.getText().isEmpty()
						 || textField_20.getText().isEmpty() || textField_21.getText().isEmpty()
						|| textField_22.getText().isEmpty() || textField_23.getText().isEmpty() || textField_3.getText().isEmpty()
						|| textField_4.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Por favor rellene los campos:  ");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_10.setText("");
					textField_11.setText("");
					textField_12.setText("");
					textField_8.setText("");
					textField_13.setText("");
					textField_14.setText("");
					textField_15.setText("");
					textField_16.setText("");
					textField_17.setText("");
					textField_18.setText("");
					textField_19.setText("");
					textField_20.setText("");
					textField_21.setText("");
					textField_22.setText("");
					textField_23.setText("");
					textField_9.setText("");
					
				}else
				{
					if(textField_1.getText()!= null && textField_18.getText().isEmpty() || textField_1.getText().isEmpty() && textField_2 != null ||
					   textField_8!= null && textField_9.getText().isEmpty() || textField_8.getText().isEmpty() && textField_9 != null ||
							textField_12!= null && textField_13.getText().isEmpty()|| textField_12.getText().isEmpty() && textField_13 != null ||
							textField_14 != null && textField_15.getText().isEmpty() || textField_14.getText().isEmpty() && textField_15 != null)
					{
						if(textField_1.getText().toLowerCase().equals("x"))
						{
							genero = "m";
						}
						else
						{
							genero = "f";
						}
						if(textField_8.getText().toLowerCase().equals("x"))
						{
							trabaja = "si";
						}
						else
						{
							trabaja = "no";
						}
						if(textField_12.getText().toLowerCase().equals("x"))
						{
							repitente = "si";
						}
						else
						{
							repitente = "no";
						}
						if(textField_14.getText().toLowerCase().equals("x"))
						{
							egresado = "publico";
						}
						else
						{
							genero = "privado";
						}
						Archivos a1 = new Archivos();
						a1.almacenaArchivo5(textField.getText(), genero, textField_3.getText(), textField_4.getText(), trabaja, 
								textField_10.getText(), textField_11.getText(), repitente, egresado, textField_16.getText(), 
								textField_17.getText(), textField_18.getText(), textField_19.getText(), textField_20.getText(), 
								textField_21.getText(), textField_22.getText(), textField_23.getText());
						
					}else
					{
						JOptionPane.showMessageDialog(null,"Por favor seleccione solo un campo en donde tiene mas de 1 opcion ");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_10.setText("");
						textField_11.setText("");
						textField_12.setText("");
						textField_8.setText("");
						textField_13.setText("");
						textField_14.setText("");
						textField_15.setText("");
						textField_16.setText("");
						textField_17.setText("");
						textField_18.setText("");
						textField_19.setText("");
						textField_20.setText("");
						textField_21.setText("");
						textField_22.setText("");
						textField_23.setText("");
						textField_9.setText("");
						
					}
					
				}
			}
		});
		btnRegistrar.setBounds(371, 564, 89, 23);
		contentPane.add(btnRegistrar);
	}
}//fin dde la clase
