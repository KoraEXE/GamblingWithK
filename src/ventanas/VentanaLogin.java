package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.LoginControlador;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaLogin extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoUsuario;
	private JPasswordField campoContrasena;
	private JButton btnLogin;
	private JLabel lblNewLabel_1;
	private LoginControlador cont;

	public VentanaLogin(LoginControlador controlador) {
		this.cont=controlador;
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		campoUsuario = new JTextField();
		campoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		campoUsuario.setBounds(160, 86, 118, 19);
		contentPane.add(campoUsuario);
		campoUsuario.setColumns(10);

		campoContrasena = new JPasswordField();
		campoContrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		campoContrasena.setBounds(160, 127, 118, 19);
		contentPane.add(campoContrasena);

		btnLogin = new JButton("Login");
		btnLogin.setBounds(160, 209, 85, 21);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(this);

		JLabel lblNewLabel = new JLabel("User:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(57, 88, 97, 16);
		contentPane.add(lblNewLabel);

		JLabel Contarseña = new JLabel("Password:");
		Contarseña.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Contarseña.setBounds(57, 129, 97, 16);
		contentPane.add(Contarseña);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(78, 240, 274, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Register");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(160, 25, 92, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Insertar Imagen");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(288, 63, 138, 148);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBalance.setBounds(57, 173, 97, 16);
		contentPane.add(lblBalance);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-- Select Import --", "100", "200", "300", "400", "500", "600", "700", "800", "900", "1000"}));
		comboBox.setBounds(160, 173, 118, 20);
		contentPane.add(comboBox);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnLogin) {
		
			
		}
	}
}
