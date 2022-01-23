package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Archivos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabla4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 * clase ventana dificultad de aprendiizaje
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla4 frame = new Tabla4();
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
	public Tabla4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\4.JPG"));
		label.setBounds(55, 65, 532, 194);
		contentPane.add(label);
		//metodo de agegar respuestas y pasar a siguiente pregunta
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int tx1 = textField.getText().charAt(0);
				int tx2 = textField_1.getText().charAt(0);;
				int tx3 = textField_2.getText().charAt(0);;
				int tx4 = textField_3.getText().charAt(0);;
				int tx5 = textField_4.getText().charAt(0);;
				int tx6 = textField_5.getText().charAt(0);;
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty()|| textField_2.getText().isEmpty() || 
						textField_3.getText().isEmpty()||textField_4.getText().isEmpty()|| textField_5.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Por favor rellene los campos:  ");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					
				}else
				{
					System.out.print(""+tx1 + "" + 49);
					if (       tx1>= 49 && tx1<= 53
							&& tx2 >= 49 && tx2<= 53
							&& tx3 >= 49 && tx3 <= 53
							&& tx4>= 49 && tx4<= 53
							&& tx5>= 49 && tx5<= 53
							&& tx6>= 49 && tx6<= 53)
					{
						Archivos a1 = new Archivos();
						a1.almacenaArchivo4(textField.getText(), textField_1.getText(), textField_2.getText(),
								textField_3.getText(), textField_4.getText(), textField_5.getText());
						VPrincipal vp = new VPrincipal();
						vp.setVisible(true);
						setVisible(false);
					}else
					{
						
						JOptionPane.showMessageDialog(null,"Ole mk ponga numeros:  ");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
					}
					}
			}
		});
		btnTerminar.setBounds(304, 302, 89, 23);
		contentPane.add(btnTerminar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(611, 135, 86, 14);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(611, 154, 86, 14);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(611, 171, 86, 14);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(611, 193, 86, 14);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(611, 214, 86, 14);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(611, 239, 86, 14);
		contentPane.add(textField_5);
	}

}//fin de la clase
