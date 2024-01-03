package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JCheckBoxMenuItem;
import java.awt.ScrollPane;

public class Carton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable carton;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carton frame = new Carton();
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
	public Carton() {
		setBackground(SystemColor.inactiveCaption);
		setTitle("carton de juego");
		int[][] carton1 = modelo.Carton.creaCarton();
		String[] columnNames = {"B", "I","N","G","O"};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setVisible(true);
		/*es necesario convertir el array a objeto para poder mostrarlo, acá se crea un objeto vacío 
		del tamaño del array y se llena espacio por espacio con la info del array*/
		Object[][] data = new Object[carton1.length][carton1[0].length];
		for (int i = 0; i < carton1.length; i++) {
		    for (int j = 0; j < carton1[i].length; j++) {
		        data[i][j] = carton1[i][j]; // Autoboxing converts int to Integer
		    }
		}		
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
	    contentPane.setLayout(null);
	    carton = new JTable(model);
	    carton.setBounds(75, 123, 375, 80);
	    contentPane.add(carton);
	    
	    JLabel lblNewLabel = new JLabel("Este es tu cartón de juego");
	    lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 32));
	    lblNewLabel.setBounds(71, 39, 462, 46);
	    contentPane.add(lblNewLabel);
	    
	    btnNewButton = new JButton("¡BINGO!");
	    btnNewButton.setBounds(203, 244, 89, 28);
	    contentPane.add(btnNewButton);
	    btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String resultado = modelo.Victoria.verificar();
		JOptionPane.showMessageDialog(null, resultado,"Bienvenido", JOptionPane.INFORMATION_MESSAGE);
	}
	});
	}
}
