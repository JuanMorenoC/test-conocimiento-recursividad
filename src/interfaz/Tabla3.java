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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabla3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla3 frame = new Tabla3();
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
	public Tabla3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\3.JPG"));
		label.setBounds(102, 66, 535, 245);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(640, 142, 86, 14);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(640, 162, 86, 14);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(640, 184, 86, 14);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(640, 204, 86, 14);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(640, 223, 86, 14);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(640, 241, 86, 14);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(640, 262, 86, 14);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(640, 281, 86, 14);
		contentPane.add(textField_7);
		//metodo de agegar respuestas y pasar a siguiente pregunta
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{		
			
			if(textField.getText().isEmpty() || textField_1.getText().isEmpty()|| textField_2.getText().isEmpty() || 
					textField_3.getText().isEmpty()||textField_4.getText().isEmpty()|| textField_5.getText().isEmpty()||
					textField_6.getText().isEmpty()|| textField_7.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Por favor rellene los campos:  ");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				
			}else
			{
				int tx1 = textField.getText().charAt(0);
				int tx2 = textField_1.getText().charAt(0);
				int tx3 = textField_2.getText().charAt(0);
				int tx4 = textField_3.getText().charAt(0);
				int tx5 = textField_4.getText().charAt(0);
				int tx6 = textField_5.getText().charAt(0);
				int tx7 = textField_6.getText().charAt(0);
				int tx8 = textField_7.getText().charAt(0);
				System.out.print(""+tx1 + "" + 49);
				if (       tx1>= 49 && tx1<= 53
						&& tx2 >= 49 && tx2<= 53
						&& tx3 >= 49 && tx3 <= 53
						&& tx4>= 49 && tx4<= 53
						&& tx5>= 49 && tx5<= 53
						&& tx6>= 49 && tx6<= 53
						&& tx7>= 49 && tx7<= 53
						&& tx8>= 49 && tx8<= 53)
				{
					Archivos a1 = new Archivos();
					a1.almacenaArchivo3(textField.getText(), textField_1.getText(), textField_2.getText(),
							textField_3.getText(), textField_4.getText(), textField_5.getText(), textField_6.getText(),
							textField_7.getText());
					Tabla4 vp = new Tabla4();
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
					textField_6.setText("");
					textField_7.setText("");
				}
				}
			}
		});
		btnSiguiente.setBounds(291, 313, 89, 23);
		contentPane.add(btnSiguiente);
	}

}//fin de la clase
