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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VTest3 extends JFrame {

	private JPanel contentPane;
	private JTextField respuesta3;
	private JTextField respuesta1;
	private JTextField respuesta2;
	private JTextField respuesta4;
	private JTextField respuesta5;

	/**
	 * Launch the application.
	 * clase de ventana de test de conocimiento. el usuario responde las preguntas
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VTest3 frame = new VTest3();
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
	public VTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1360, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnA = new JButton("FINALIZAR");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int cont = 0;
				
				if(Integer.parseInt(respuesta1.getText()) == 3)
				{
					cont++;
				}
					if(Integer.parseInt(respuesta2.getText()) == 1)
					{
						cont++;
					}
						if(Integer.parseInt(respuesta3.getText()) == 5)
						{
							cont++;
						}
							if(Integer.parseInt(respuesta4.getText()) == 3)
							{
								cont++;
							}
								if(Integer.parseInt(respuesta5.getText()) == 3)
								{
									cont++;
								}
							
						
					
				
				System.out.println(cont);
				if(cont >= 3)
				{
					JOptionPane.showMessageDialog(null,"APROVADO");
				}else
				{
					JOptionPane.showMessageDialog(null,"REPROVADO");
				}
				if(respuesta3.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Poravor seleccione una opcion:  ");
					respuesta3.setText("");
				
				}else
					{
						int tx1 = respuesta1.getText().charAt(0);
						int tx2 = respuesta2.getText().charAt(0);
						int tx3 = respuesta3.getText().charAt(0);
						int tx4 = respuesta4.getText().charAt(0);
						int tx5 = respuesta5.getText().charAt(0);
						System.out.print(""+tx1 + "" + 49);
						if (       tx1>= 49 && tx1 <= 53 ||
								   tx2>= 49 && tx2 <= 53||
								   tx3>= 49 && tx3 <= 53||
												tx4>= 49 && tx4 <= 53||
												tx5>= 49 && tx5 <= 53)
						{
							Archivos a1 = new Archivos();
							a1.almacenaArchivo6(respuesta1.getText(), respuesta2.getText(), respuesta3.getText(), 
									respuesta4.getText(), respuesta5.getText());
							VPrincipal vt = new VPrincipal();
							vt.setVisible(true);
							setVisible(false);
					
					}else
					{
						JOptionPane.showMessageDialog(null,"Seleccione una respuesta A,B,C,D o E");
						respuesta3.setText("");
					}
					}					
			}
		});
		btnA.setBounds(79, 492, 286, 180);
		contentPane.add(btnA);
		
		JPanel panel = new JPanel();
		panel.setBounds(971, 11, 342, 380);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\test3.JPG"));
		label.setBounds(0, 11, 330, 200);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\test3.1.JPG"));
		label_1.setBounds(40, 205, 148, 171);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("1");
		label_2.setBounds(0, 231, 30, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("2");
		label_3.setBounds(0, 256, 30, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("3");
		label_4.setBounds(0, 281, 30, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("4");
		label_5.setBounds(0, 306, 30, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("5");
		label_6.setBounds(0, 331, 30, 14);
		panel.add(label_6);
		
		JLabel lblRespuesta = new JLabel("RESPUESTA");
		lblRespuesta.setBounds(177, 231, 88, 14);
		panel.add(lblRespuesta);
		
		respuesta3 = new JTextField();
		respuesta3.setBounds(177, 253, 70, 20);
		panel.add(respuesta3);
		respuesta3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 400, 442);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\test1.JPG"));
		label_7.setBounds(0, -18, 400, 237);
		panel_1.add(label_7);
		
		JLabel label_9 = new JLabel("1");
		label_9.setBounds(0, 233, 30, 14);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("2");
		label_10.setBounds(0, 272, 30, 14);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("3");
		label_11.setBounds(0, 323, 30, 14);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("4");
		label_12.setBounds(0, 367, 30, 14);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("5");
		label_13.setBounds(0, 412, 30, 14);
		panel_1.add(label_13);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\tes1.1.JPG"));
		label_8.setBounds(40, 225, 97, 226);
		panel_1.add(label_8);
		
		respuesta1 = new JTextField();
		respuesta1.setColumns(10);
		respuesta1.setBounds(190, 291, 70, 20);
		panel_1.add(respuesta1);
		
		JLabel label_14 = new JLabel("RESPUESTA");
		label_14.setBounds(190, 266, 88, 14);
		panel_1.add(label_14);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(428, 11, 510, 389);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\Test2.JPG"));
		label_15.setBounds(92, 0, 418, 161);
		panel_2.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\test2.1.JPG"));
		label_16.setBounds(41, 128, 179, 278);
		panel_2.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\test2.2.JPG"));
		label_17.setBounds(230, 181, 157, 180);
		panel_2.add(label_17);
		
		JLabel label_18 = new JLabel("1");
		label_18.setBounds(10, 181, 30, 14);
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("2");
		label_19.setBounds(1, 250, 30, 14);
		panel_2.add(label_19);
		
		JLabel label_20 = new JLabel("3");
		label_20.setBounds(10, 334, 30, 14);
		panel_2.add(label_20);
		
		JLabel label_21 = new JLabel("4");
		label_21.setBounds(190, 245, 30, 14);
		panel_2.add(label_21);
		
		JLabel label_22 = new JLabel("5");
		label_22.setBounds(190, 352, 30, 14);
		panel_2.add(label_22);
		
		JLabel label_23 = new JLabel("RESPUESTA");
		label_23.setBounds(397, 265, 88, 14);
		panel_2.add(label_23);
		
		respuesta2 = new JTextField();
		respuesta2.setColumns(10);
		respuesta2.setBounds(397, 288, 70, 20);
		panel_2.add(respuesta2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(438, 396, 500, 334);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\Test4.JPG"));
		label_24.setBounds(0, 0, 500, 169);
		panel_3.add(label_24);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\test4.1.JPG"));
		lblNewLabel.setBounds(25, 180, 241, 143);
		panel_3.add(lblNewLabel);
		
		JLabel label_25 = new JLabel("1");
		label_25.setBounds(0, 192, 30, 14);
		panel_3.add(label_25);
		
		JLabel label_26 = new JLabel("2");
		label_26.setBounds(0, 213, 30, 14);
		panel_3.add(label_26);
		
		JLabel label_27 = new JLabel("3");
		label_27.setBounds(0, 244, 30, 14);
		panel_3.add(label_27);
		
		JLabel label_28 = new JLabel("4");
		label_28.setBounds(0, 273, 30, 14);
		panel_3.add(label_28);
		
		JLabel label_29 = new JLabel("5");
		label_29.setBounds(0, 309, 30, 14);
		panel_3.add(label_29);
		
		JLabel label_30 = new JLabel("RESPUESTA");
		label_30.setBounds(331, 213, 88, 14);
		panel_3.add(label_30);
		
		respuesta4 = new JTextField();
		respuesta4.setColumns(10);
		respuesta4.setBounds(331, 252, 70, 20);
		panel_3.add(respuesta4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(948, 385, 386, 345);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_31 = new JLabel("");
		label_31.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\test5.JPG"));
		label_31.setBounds(0, 11, 376, 132);
		panel_4.add(label_31);
		
		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon("C:\\Users\\ABSALON MORENO P\\Desktop\\test5.1.JPG"));
		label_32.setBounds(52, 154, 129, 180);
		panel_4.add(label_32);
		
		JLabel label_33 = new JLabel("RESPUESTA");
		label_33.setBounds(207, 175, 88, 14);
		panel_4.add(label_33);
		
		respuesta5 = new JTextField();
		respuesta5.setColumns(10);
		respuesta5.setBounds(207, 214, 70, 20);
		panel_4.add(respuesta5);
		
		JLabel label_34 = new JLabel("1");
		label_34.setBounds(10, 175, 30, 14);
		panel_4.add(label_34);
		
		JLabel label_35 = new JLabel("2");
		label_35.setBounds(10, 217, 30, 14);
		panel_4.add(label_35);
		
		JLabel label_36 = new JLabel("3");
		label_36.setBounds(10, 241, 30, 14);
		panel_4.add(label_36);
		
		JLabel label_37 = new JLabel("4");
		label_37.setBounds(10, 268, 30, 14);
		panel_4.add(label_37);
		
		JLabel label_38 = new JLabel("5");
		label_38.setBounds(12, 300, 30, 14);
		panel_4.add(label_38);
	}
}
