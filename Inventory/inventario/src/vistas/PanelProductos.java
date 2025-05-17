package vistas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.Choice;

public class PanelProductos extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField textNombre;
	public  JTextField textCantidadStop;
	public  JTextField textPrecioCompra;
	public JTextField textCantidadIngresada;
	public JTextField textIdCategoria;
	public JTextField textId;
	
	public JButton btnAgregar;
	public JButton btnEditar;
	public JButton btnBuscar;
	public JButton btnEliminar;
	public JTable tablaProductos;
	private JScrollPane scrollPane;
	public JTextField textFechaCompra;
	public JTextField textIdProveedor;
	public JTextField textFechaVencimiento;
	
	public JComboBox comboCategoria;
	public JComboBox comboTipoMedida;
	private JScrollPane scrollPane_1;
	
	
	
	public PanelProductos() {
		setLayout(null);
		
		JPanel panelFondoProductos = new JPanel();
		panelFondoProductos.setToolTipText("jhgfd");
		panelFondoProductos.setBounds(0, 0, 771, 527);
		panelFondoProductos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CONTROL DE PRODUCTOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelFondoProductos.setBackground(new Color(170, 255, 255));
		add(panelFondoProductos);
		panelFondoProductos.setLayout(null);
		
		JLabel lblNombreProducto = new JLabel("Nombre:");
		lblNombreProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombreProducto.setBounds(28, 84, 81, 26);
		panelFondoProductos.add(lblNombreProducto);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNombre.setColumns(10);
		textNombre.setBounds(189, 85, 215, 26);
		panelFondoProductos.add(textNombre);
		
		JLabel lblCategoriaProducto = new JLabel("Categoria:");
		lblCategoriaProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCategoriaProducto.setBounds(28, 269, 100, 26);
		panelFondoProductos.add(lblCategoriaProducto);
		
		JLabel lblSuperiorProductos = new JLabel("CONTROL DE PRODUCTOS");
		lblSuperiorProductos.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSuperiorProductos.setBounds(224, 11, 249, 26);
		panelFondoProductos.add(lblSuperiorProductos);
		
		JLabel lblCantidadStop = new JLabel("Cantidad Stock:");
		lblCantidadStop.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCantidadStop.setBounds(28, 121, 128, 26);
		panelFondoProductos.add(lblCantidadStop);
		
		textCantidadStop = new JTextField();
		textCantidadStop.setEditable(false);
		textCantidadStop.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCantidadStop.setColumns(10);
		textCantidadStop.setBounds(189, 121, 215, 26);
		panelFondoProductos.add(textCantidadStop);
		
		JLabel lblIconoProducto = new JLabel("");
		lblIconoProducto.setIcon(new ImageIcon(PanelProductos.class.getResource("/img/categorias.png")));
		lblIconoProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIconoProducto.setBounds(179, 11, 50, 26);
		panelFondoProductos.add(lblIconoProducto);
		
		textPrecioCompra = new JTextField();
		textPrecioCompra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPrecioCompra.setColumns(10);
		textPrecioCompra.setBounds(565, 86, 196, 26);
		panelFondoProductos.add(textPrecioCompra);
		
		JLabel lblPrecioCompra = new JLabel("Precio Compra:");
		lblPrecioCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrecioCompra.setBounds(427, 83, 128, 26);
		panelFondoProductos.add(lblPrecioCompra);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setIcon(new ImageIcon(PanelProductos.class.getResource("/img/guardar-el-archivo.png")));
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAgregar.setBounds(448, 273, 139, 26);
		panelFondoProductos.add(btnAgregar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(PanelProductos.class.getResource("/img/reporte1.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEditar.setBounds(606, 273, 139, 26);
		panelFondoProductos.add(btnEditar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(PanelProductos.class.getResource("/img/historial1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBuscar.setBounds(606, 327, 139, 26);
		panelFondoProductos.add(btnBuscar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(PanelProductos.class.getResource("/img/reporte1.png")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEliminar.setBounds(448, 327, 139, 26);
		panelFondoProductos.add(btnEliminar);
		
	
		textCantidadIngresada = new JTextField();
		textCantidadIngresada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCantidadIngresada.setColumns(10);
		textCantidadIngresada.setBounds(189, 159, 215, 26);
		panelFondoProductos.add(textCantidadIngresada);
		
		JLabel lblCantidad = new JLabel("Cantidad Ingresar");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCantidad.setBounds(28, 158, 163, 26);
		panelFondoProductos.add(lblCantidad);
		
		JLabel lblIdCategoiria = new JLabel("IdCategoria:");
		lblIdCategoiria.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdCategoiria.setBounds(28, 193, 128, 26);
		panelFondoProductos.add(lblIdCategoiria);
		
		textIdCategoria = new JTextField();
		textIdCategoria.setEditable(false);
		textIdCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textIdCategoria.setColumns(10);
		textIdCategoria.setBounds(189, 194, 215, 26);
		panelFondoProductos.add(textIdCategoria);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 364, 751, 152);
		panelFondoProductos.add(scrollPane_1);
		
		scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		tablaProductos = new JTable();
		scrollPane.setViewportView(tablaProductos);
		tablaProductos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID-PRODUCTO", "NOMBRE", "TIPO- MEDIDA", "PRECIO UNITARIO", "CANTIDAD-STOP", "IDCATEGORIA"
			}
		));
		tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(94);
		tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(89);
		tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(99);
		tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(111);
		tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(108);
		tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(93);
		tablaProductos.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblId = new JLabel("IdProducto:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBounds(28, 48, 116, 26);
		panelFondoProductos.add(lblId);
		
		textId = new JTextField();
		textId.setEditable(false);
		textId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textId.setColumns(10);
		textId.setBounds(189, 48, 215, 26);
		panelFondoProductos.add(textId);
		
		comboCategoria = new JComboBox();
		comboCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboCategoria.setBounds(189, 273, 215, 22);
		panelFondoProductos.add(comboCategoria);
		
		textFechaCompra = new JTextField();
		textFechaCompra.setToolTipText("ghjkl");
		textFechaCompra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFechaCompra.setColumns(10);
		textFechaCompra.setBounds(189, 306, 215, 26);
		panelFondoProductos.add(textFechaCompra);
		
		JLabel lblFechaCompra = new JLabel("Fecha Compra:");
		lblFechaCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFechaCompra.setBounds(28, 306, 152, 26);
		panelFondoProductos.add(lblFechaCompra);
		
		comboTipoMedida = new JComboBox();
		comboTipoMedida.setModel(new DefaultComboBoxModel(new String[] {"Tipo Medida", "Unidad", "Caja", "Paquete", "docena", "libra", "kilo", "bote"}));
		comboTipoMedida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboTipoMedida.setBounds(565, 123, 196, 26);
		panelFondoProductos.add(comboTipoMedida);
		
		JLabel lblTipoMedida = new JLabel("Tipo de Medida");
		lblTipoMedida.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTipoMedida.setBounds(427, 121, 128, 26);
		panelFondoProductos.add(lblTipoMedida);
		
		JLabel lblIdProveedor = new JLabel("IdProveedor:");
		lblIdProveedor.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdProveedor.setBounds(28, 230, 128, 26);
		panelFondoProductos.add(lblIdProveedor);
		
		textIdProveedor = new JTextField();
		textIdProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textIdProveedor.setEditable(false);
		textIdProveedor.setColumns(10);
		textIdProveedor.setBounds(189, 231, 215, 26);
		panelFondoProductos.add(textIdProveedor);
		
		JLabel lblFechaVencimiento = new JLabel("F-Vencimiento:");
		lblFechaVencimiento.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFechaVencimiento.setBounds(427, 48, 152, 26);
		panelFondoProductos.add(lblFechaVencimiento);
		
		textFechaVencimiento = new JTextField();
		textFechaVencimiento.setToolTipText("ghjkl");
		textFechaVencimiento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFechaVencimiento.setColumns(10);
		textFechaVencimiento.setBounds(565, 49, 196, 26);
		panelFondoProductos.add(textFechaVencimiento);

	}
}
