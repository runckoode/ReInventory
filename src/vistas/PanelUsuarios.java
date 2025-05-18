package vistas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class PanelUsuarios extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPasswordField textPassword;
	public JTextField textNombre;
	public JTextField textApellido;
	
	
	
	public JButton btnAgregarUsuario;
	public JButton btnEditarUsuario;
	public JButton btnBuscarUsuario;
	public JButton btnEliminar;
	public  JTextField textUsuario;
	private JLabel lblId;
	public JTextField textId;
	public  JTable tablaUsuarios;
	private JScrollPane scrollPane;
	
	
	
	public PanelUsuarios() {
		setLayout(null);
		
		JPanel panelFondoUsuarios = new JPanel();
		panelFondoUsuarios.setBounds(0, 0, 765, 527);
		panelFondoUsuarios.setBorder(new TitledBorder(null, "CONTROL DE USUARIOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFondoUsuarios.setBackground(new Color(215, 255, 255));
		add(panelFondoUsuarios);
		panelFondoUsuarios.setLayout(null);
		
		JLabel lblSuperiorTema = new JLabel("Control de Usuarios");
		lblSuperiorTema.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSuperiorTema.setBounds(227, 30, 249, 26);
		panelFondoUsuarios.add(lblSuperiorTema);
		
		JLabel lblNombreUsuario = new JLabel("Nombre:");
		lblNombreUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombreUsuario.setBounds(43, 128, 81, 26);
		panelFondoUsuarios.add(lblNombreUsuario);
		
		JLabel lblApellidoUsuario = new JLabel("Apellido:");
		lblApellidoUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblApellidoUsuario.setBounds(43, 177, 81, 26);
		panelFondoUsuarios.add(lblApellidoUsuario);
		
		JLabel lblPasswordUsuario = new JLabel("Contraseña:");
		lblPasswordUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPasswordUsuario.setBounds(43, 294, 108, 26);
		panelFondoUsuarios.add(lblPasswordUsuario);
		
		textPassword = new JPasswordField();
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPassword.setBounds(181, 299, 215, 26);
		panelFondoUsuarios.add(textPassword);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNombre.setBounds(181, 133, 215, 26);
		panelFondoUsuarios.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textApellido.setColumns(10);
		textApellido.setBounds(181, 182, 215, 26);
		panelFondoUsuarios.add(textApellido);
		
		btnAgregarUsuario = new JButton("Agregar");
		btnAgregarUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAgregarUsuario.setIcon(new ImageIcon(PanelUsuarios.class.getResource("/img/guardar-el-archivo.png")));
		btnAgregarUsuario.setBounds(438, 82, 125, 26);
		panelFondoUsuarios.add(btnAgregarUsuario);
		
		btnEditarUsuario = new JButton("Editar");
		btnEditarUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEditarUsuario.setIcon(new ImageIcon(PanelUsuarios.class.getResource("/img/reporte1.png")));
		btnEditarUsuario.setBounds(592, 82, 139, 26);
		panelFondoUsuarios.add(btnEditarUsuario);
		
		btnBuscarUsuario = new JButton("Buscar");
		btnBuscarUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBuscarUsuario.setIcon(new ImageIcon(PanelUsuarios.class.getResource("/img/historial1.png")));
		btnBuscarUsuario.setBounds(438, 128, 118, 26);
		panelFondoUsuarios.add(btnBuscarUsuario);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(PanelUsuarios.class.getResource("/img/eliminar.jpg")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEliminar.setBounds(592, 132, 139, 26);
		panelFondoUsuarios.add(btnEliminar);
		
		JLabel lblIconoSuperior = new JLabel("");
		lblIconoSuperior.setIcon(new ImageIcon(PanelUsuarios.class.getResource("/img/cliente.png")));
		lblIconoSuperior.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIconoSuperior.setBounds(188, 11, 39, 46);
		panelFondoUsuarios.add(lblIconoSuperior);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsuario.setBounds(43, 234, 108, 26);
		panelFondoUsuarios.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textUsuario.setColumns(10);
		textUsuario.setBounds(181, 239, 215, 26);
		panelFondoUsuarios.add(textUsuario);
		
		lblId = new JLabel("Id:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBounds(43, 82, 81, 26);
		panelFondoUsuarios.add(lblId);
		
		textId = new JTextField();
		textId.setEditable(false);
		textId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textId.setColumns(10);
		textId.setBounds(181, 87, 215, 26);
		panelFondoUsuarios.add(textId);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 365, 751, 151);
		panelFondoUsuarios.add(scrollPane);
		
		tablaUsuarios = new JTable();
		scrollPane.setViewportView(tablaUsuarios);
		tablaUsuarios.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NOMBRE", "APELLIDO", "USUARIO", "CONTRASE\u00D1A"
			}
		));

	}
}
