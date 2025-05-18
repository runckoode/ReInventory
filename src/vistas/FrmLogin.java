package vistas;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.LoginController;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class FrmLogin extends JFrame {
	


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textUsuario;
	public JPasswordField textContrasena;
	public JButton btnIngresar;
	


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin loginFrame = new FrmLogin();
					loginFrame.setVisible(true);

					LoginController usuarioController = new LoginController(loginFrame);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public FrmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelFondo = new JPanel();
		panelFondo.setBounds(0, 0, 586, 281);
		contentPane.add(panelFondo);
		panelFondo.setLayout(null);
		
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setForeground(new Color(255, 255, 255));
		panelIzquierdo.setBackground(new Color(255, 255, 255));
		panelIzquierdo.setBounds(0, 0, 292, 281);
		panelFondo.add(panelIzquierdo);
		panelIzquierdo.setLayout(null);
		
		JLabel lblImagenVentas = new JLabel("");
		lblImagenVentas.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/cajaInvent.jpg")));
		lblImagenVentas.setBounds(30, 11, 182, 201);
		panelIzquierdo.add(lblImagenVentas);
		
		JLabel lblNombreNegocio = new JLabel("SUPERMARKET");
		lblNombreNegocio.setForeground(new Color(0, 0, 0));
		lblNombreNegocio.setBackground(new Color(255, 255, 255));
		lblNombreNegocio.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNombreNegocio.setBounds(30, 198, 232, 47);
		panelIzquierdo.add(lblNombreNegocio);
		
		JLabel lblNombreProgramador = new JLabel("Ing- software l");
		lblNombreProgramador.setForeground(new Color(0, 0, 0));
		lblNombreProgramador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombreProgramador.setBackground(Color.WHITE);
		lblNombreProgramador.setBounds(163, 256, 119, 14);
		panelIzquierdo.add(lblNombreProgramador);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(213, 234, 234));
		panel.setBounds(292, 0, 294, 281);
		panelFondo.add(panel);
		panel.setLayout(null);
		
		JLabel lblImagenInicio = new JLabel("");
		lblImagenInicio.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/user1.png")));
		lblImagenInicio.setBounds(74, 0, 135, 137);
		panel.add(lblImagenInicio);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsuario.setBounds(52, 148, 90, 24);
		panel.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Contraseña: ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(52, 197, 124, 24);
		panel.add(lblPassword);
		
		textUsuario = new JTextField();
		textUsuario.setForeground(new Color(0, 0, 128));
		textUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		textUsuario.setBounds(168, 152, 103, 20);
		panel.add(textUsuario);
		textUsuario.setColumns(10);
		
		textContrasena = new JPasswordField();
		textContrasena.setForeground(new Color(0, 0, 0));
		textContrasena.setBounds(168, 202, 103, 20);
		panel.add(textContrasena);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setForeground(new Color(0, 0, 0));
		btnIngresar.setBackground(new Color(0, 128, 192));
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnIngresar.setBounds(148, 246, 123, 24);
		panel.add(btnIngresar);
		
		JLabel lblUsuarioIcono = new JLabel("");
		lblUsuarioIcono.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/user2.png")));
		lblUsuarioIcono.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUsuarioIcono.setBounds(10, 137, 39, 36);
		panel.add(lblUsuarioIcono);
		
		JLabel lblPasswordIcono = new JLabel("");
		lblPasswordIcono.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/password.png")));
		lblPasswordIcono.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPasswordIcono.setBounds(10, 185, 39, 36);
		panel.add(lblPasswordIcono);
	}
}
