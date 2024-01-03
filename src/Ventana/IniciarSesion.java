package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class IniciarSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion frame = new IniciarSesion();
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
	public IniciarSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Contraseña");
		passwordField.setBackground(SystemColor.activeCaption);
		passwordField.setBounds(200, 119, 113, 32);
		contentPane.add(passwordField);
		
		JTextPane txtpnUsuario = new JTextPane();
		txtpnUsuario.setToolTipText("asdasd");
		txtpnUsuario.setBackground(SystemColor.activeCaption);
		txtpnUsuario.setText("Usuario");
		txtpnUsuario.setBounds(200, 75, 113, 24);
		contentPane.add(txtpnUsuario);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setBounds(145, 189, 106, 32);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "Ingresaste con exito","Bienvenido", JOptionPane.INFORMATION_MESSAGE);
			Ventana.Carton.main(null);
				}
		});
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(95, 75, 61, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(95, 127, 80, 24);
		contentPane.add(lblNewLabel_1);
	}
}
