package vistas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class PanelClientes extends JPanel {

	private static final long serialVersionUID = 1L;
	public  JTextField textNombre;
	public  JTextField textApellido;
	public  JTextField textTelefono;
	public  JTextField textEmail;
	public JTable tablaClientes;

	
	public JButton btnAgregar;
	public JButton btnEditar;
	public JButton btnEliminar;
	public JButton btnBuscar;
	public JTextField textId;
	
	public PanelClientes() {
		setLayout(null);
		
		JPanel panelFondoClientes = new JPanel();
		panelFondoClientes.setBounds(0, 0, 771, 527);
		panelFondoClientes.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CONTROL DE LOS CLIENTES", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelFondoClientes.setBackground(new Color(179, 231, 255));
		add(panelFondoClientes);
		panelFondoClientes.setLayout(null);
		
		JLabel lblControlDeClientes = new JLabel("Control de Clientes");
		lblControlDeClientes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblControlDeClientes.setBounds(263, 30, 249, 26);
		panelFondoClientes.add(lblControlDeClientes);
		
		JLabel lblIconoSuperior = new JLabel("");
		lblIconoSuperior.setIcon(new ImageIcon(PanelClientes.class.getResource("/img/cliente.png")));
		lblIconoSuperior.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIconoSuperior.setBounds(224, 11, 39, 46);
		panelFondoClientes.add(lblIconoSuperior);
		
		JLabel lblNombreCliente = new JLabel("Nombre:");
		lblNombreCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombreCliente.setBounds(62, 131, 81, 26);
		panelFondoClientes.add(lblNombreCliente);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNombre.setColumns(10);
		textNombre.setBounds(200, 136, 215, 26);
		panelFondoClientes.add(textNombre);
		
		JLabel lblApellidoCliente = new JLabel("Apellido:");
		lblApellidoCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblApellidoCliente.setBounds(62, 180, 81, 26);
		panelFondoClientes.add(lblApellidoCliente);
		
		textApellido = new JTextField();
		textApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textApellido.setColumns(10);
		textApellido.setBounds(200, 185, 215, 26);
		panelFondoClientes.add(textApellido);
		
		JLabel lblTelefonoCliente = new JLabel("Telefono:");
		lblTelefonoCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelefonoCliente.setBounds(62, 222, 81, 26);
		panelFondoClientes.add(lblTelefonoCliente);
		
		textTelefono = new JTextField();
		textTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textTelefono.setColumns(10);
		textTelefono.setBounds(200, 227, 215, 26);
		panelFondoClientes.add(textTelefono);
		
		JLabel lblEmailCliente = new JLabel("Email:");
		lblEmailCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmailCliente.setBounds(68, 279, 81, 26);
		panelFondoClientes.add(lblEmailCliente);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textEmail.setColumns(10);
		textEmail.setBounds(206, 284, 215, 26);
		panelFondoClientes.add(textEmail);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setIcon(new ImageIcon(PanelClientes.class.getResource("/img/guardar-el-archivo.png")));
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAgregar.setBounds(603, 83, 139, 26);
		panelFondoClientes.add(btnAgregar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(PanelClientes.class.getResource("/img/reporte1.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEditar.setBounds(603, 180, 139, 26);
		panelFondoClientes.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(PanelClientes.class.getResource("/img/eliminar.jpg")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEliminar.setBounds(603, 232, 139, 26);
		panelFondoClientes.add(btnEliminar);
		

		btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(PanelClientes.class.getResource("/img/historial1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBuscar.setBounds(603, 132, 139, 26);
		panelFondoClientes.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 368, 751, 136);
		panelFondoClientes.add(scrollPane);
		
		
		tablaClientes = new JTable();
		scrollPane.setViewportView(tablaClientes);
		tablaClientes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NOMBRE", "APELLIDO", "TELEFONO", "EMAIL"
			}
		));
		
		JLabel lblId = new JLabel("Id:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBounds(62, 83, 81, 26);
		panelFondoClientes.add(lblId);
		
		textId = new JTextField();
		textId.setEditable(false);
		textId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textId.setColumns(10);
		textId.setBounds(200, 88, 215, 26);
		panelFondoClientes.add(textId);

	}
}
