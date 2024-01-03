package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class juego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					juego frame = new juego();
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
	public juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 426, 113);
		contentPane.add(panel);
		
		JLabel lblTablaDeBingo = new JLabel("TABLA DE BINGO");
		lblTablaDeBingo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblTablaDeBingo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 134, 416, 395);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 5, 1, 1));
		
		int[][] carton1 = modelo.Carton.creaCarton();
		
		JButton btnNewButton_1 = new JButton(Integer.toString(carton1[0][0]));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(Integer.toString(carton1[0][1]));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(Integer.toString(carton1[0][2]));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(Integer.toString(carton1[0][3]));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton(Integer.toString(carton1[0][4]));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton(Integer.toString(carton1[1][0]));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton(Integer.toString(carton1[1][1]));
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton(Integer.toString(carton1[1][2]));
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton(Integer.toString(carton1[1][3]));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(Integer.toString(carton1[1][4]));
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_13 = new JButton(Integer.toString(carton1[2][0]));
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_12 = new JButton(Integer.toString(carton1[2][1]));
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton(Integer.toString(carton1[2][2]));
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_16 = new JButton(Integer.toString(carton1[2][3]));
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_19 = new JButton(Integer.toString(carton1[2][4]));
		panel_1.add(btnNewButton_19);
		
		JButton btnNewButton_15 = new JButton(Integer.toString(carton1[3][0]));
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_20 = new JButton(Integer.toString(carton1[3][1]));
		panel_1.add(btnNewButton_20);
		
		JButton btnNewButton_23 = new JButton(Integer.toString(carton1[3][2]));
		panel_1.add(btnNewButton_23);
		
		JButton btnNewButton_14 = new JButton(Integer.toString(carton1[3][3]));
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton = new JButton(Integer.toString(carton1[3][4]));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_18 = new JButton(Integer.toString(carton1[4][0]));
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_17 = new JButton(Integer.toString(carton1[4][1]));
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_24 = new JButton(Integer.toString(carton1[4][2]));
		panel_1.add(btnNewButton_24);
		
		JButton btnNewButton_22 = new JButton(Integer.toString(carton1[4][3]));
		panel_1.add(btnNewButton_22);
		
		JButton btnNewButton_21 = new JButton(Integer.toString(carton1[4][4]));
		panel_1.add(btnNewButton_21);
	}
}
