package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.awt.event.ActionEvent;

public class juego extends JFrame {
	protected int counter=1;
	HashSet<Integer> usadosHash = new HashSet<>();
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
		setResizable(false);
		int[] llamados= modelo.Sortear.sortear();
		Object[] data1 = new Object[llamados.length];
		for (int i = 0; i < llamados.length; i++) {
		        data1[i] = llamados[i]; // Autoboxing converts int to Integer
		    };
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 426, 113);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTablaDeBingo = new JLabel("TABLA DE BINGO");
		lblTablaDeBingo.setBounds(142, 0, 149, 23);
		lblTablaDeBingo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblTablaDeBingo);
	
		
		JLabel lblNewLabel = new JLabel("NUMERO ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(216, 33, 60, 14);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(216, 47, 54, 55);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		String sorteado="0";
		JLabel numSort = new JLabel(sorteado);
		numSort.setFont(new Font("Tahoma", Font.PLAIN, 19));
		numSort.setHorizontalAlignment(SwingConstants.CENTER);
		numSort.setBounds(0, 11, 54, 39);
		panel_2.add(numSort);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 199, 416, 395);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 5, 1, 1));
		
		int[][] carton1 = modelo.Carton.creaCarton();
		
		JButton btnNewButton_1 = new JButton(Integer.toString(+carton1[0][0]));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[0][0])) {
				btnNewButton_1.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(Integer.toString(carton1[0][1]));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[0][1])) {
				btnNewButton_2.setText("☺");		
			}}
		});
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(Integer.toString(carton1[0][2]));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[0][2])) {
					btnNewButton_3.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(Integer.toString(carton1[0][3]));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[0][3])) {
					btnNewButton_4.setText("☺");		
				}
			}
		});
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton(Integer.toString(carton1[0][4]));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[0][4])) {
					btnNewButton_6.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton(Integer.toString(carton1[1][0]));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[1][0])) {
					btnNewButton_5.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton(Integer.toString(carton1[1][1]));
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[1][1])) {
					btnNewButton_7.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton(Integer.toString(carton1[1][2]));
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[1][2])) {
					btnNewButton_8.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton(Integer.toString(carton1[1][3]));
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[1][3])) {
					btnNewButton_9.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(Integer.toString(carton1[1][4]));
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[1][4])) {
					btnNewButton_10.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_13 = new JButton(Integer.toString(carton1[2][0]));
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[2][0])) {
					btnNewButton_13.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_12 = new JButton(Integer.toString(carton1[2][1]));
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[2][1])) {
					btnNewButton_12.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton(Integer.toString(carton1[2][2]));
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[2][2])) {
					btnNewButton_11.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_16 = new JButton(Integer.toString(carton1[2][3]));
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[2][3])) {
					btnNewButton_16.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_19 = new JButton(Integer.toString(carton1[2][4]));
		btnNewButton_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[2][4])) {
					btnNewButton_19.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_19);
		
		JButton btnNewButton_15 = new JButton(Integer.toString(carton1[3][0]));
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[3][0])) {
					btnNewButton_15.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_20 = new JButton(Integer.toString(carton1[3][1]));
		btnNewButton_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[3][1])) {
					btnNewButton_20.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_20);
		
		JButton btnNewButton_23 = new JButton(Integer.toString(carton1[3][2]));
		btnNewButton_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[3][2])) {
					btnNewButton_23.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_23);
		
		JButton btnNewButton_14 = new JButton(Integer.toString(carton1[3][3]));
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[3][3])) {
					btnNewButton_14.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton = new JButton(Integer.toString(carton1[3][4]));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[3][4])) {
					btnNewButton.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_18 = new JButton(Integer.toString(carton1[4][0]));
		btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[4][0])) {
					btnNewButton_18.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_17 = new JButton(Integer.toString(carton1[4][1]));
		btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[4][1])) {
					btnNewButton_17.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_24 = new JButton(Integer.toString(carton1[4][2]));
		btnNewButton_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[4][2])) {
					btnNewButton_24.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_24);
		
		JButton btnNewButton_22 = new JButton(Integer.toString(carton1[4][3]));
		btnNewButton_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[4][3])) {
					btnNewButton_22.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_22);
		
		JButton btnNewButton_21 = new JButton(Integer.toString(carton1[4][4]));
		btnNewButton_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usadosHash.contains(carton1[4][4])) {
					btnNewButton_21.setText("☺");		
				}}
		});
		panel_1.add(btnNewButton_21);
		
		
		
		
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno.setBounds(296, 68, 60, 23);
		panel.add(lblTurno);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(359, 47, 44, 55);
		panel.add(panel_2_1);
		
		JLabel turno = new JLabel("0");
		turno.setBounds(0, 11, 44, 32);
		panel_2_1.add(turno);
		turno.setHorizontalAlignment(SwingConstants.CENTER);
		turno.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JLabel lblNewLabel_1 = new JLabel("B");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel_1.setBounds(10, 134, 79, 54);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("I");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel_1_1.setBounds(99, 134, 79, 54);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("N");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel_1_2.setBounds(176, 134, 79, 54);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("G");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel_1_3.setBounds(260, 134, 79, 54);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("O");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel_1_4.setBounds(347, 134, 79, 54);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnNewButton_25 = new JButton("¡SORTEAR!");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String localSorteado = "1";
				String localTurno = "0";
				if(counter<llamados.length) {
				localSorteado=Integer.toString(llamados[counter]);
				localTurno = Integer.toString(counter);
				numSort.setText(localSorteado);
				turno.setText(localTurno);
				usadosHash.add(llamados[counter]);
				counter+=1;}
				else {
					numSort.setText("Fin");
				}
			}
			
			
		});
		btnNewButton_25.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton_25.setBounds(25, 47, 176, 55);
		panel.add(btnNewButton_25);
	}
}
