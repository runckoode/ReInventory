package vistas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class PanelCategorias extends JPanel {

	private static final long serialVersionUID = 1L;
	public  JTextField textNombre;
	public  JTextField textDescripcion;
	
	
	public JButton btnAgregar;
	public JButton btnBuscar;
	public JButton btnEditar;
	public JButton btnEliminar;
	public JTable tablaCategorias;
	public JScrollPane scrollPane;
	public JTextField textId;
	private JLabel lblId;
	
	
	public PanelCategorias() {
		setLayout(null);
		
		JPanel panelFondoCategorias = new JPanel();
		panelFondoCategorias.setBounds(0, 0, 771, 527);
		panelFondoCategorias.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CONTROL DE CATEGORIAS DE PRODUCTOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelFondoCategorias.setBackground(new Color(255, 174, 174));
		add(panelFondoCategorias);
		panelFondoCategorias.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNombre.setColumns(10);
		textNombre.setBounds(192, 150, 215, 26);
		panelFondoCategorias.add(textNombre);
		
		JLabel lblNombreProducto = new JLabel("Nombre:");
		lblNombreProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombreProducto.setBounds(35, 150, 81, 26);
		panelFondoCategorias.add(lblNombreProducto);
		
		JLabel lblSuperiorCategorias = new JLabel("Control de Categorias De Productos");
		lblSuperiorCategorias.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSuperiorCategorias.setBounds(233, 45, 309, 26);
		panelFondoCategorias.add(lblSuperiorCategorias);
		
		JLabel lblIconoProducto = new JLabel("");
		lblIconoProducto.setIcon(new ImageIcon(PanelCategorias.class.getResource("/img/nuevo-producto.png")));
		lblIconoProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIconoProducto.setBounds(188, 33, 50, 38);
		panelFondoCategorias.add(lblIconoProducto);
		
		JLabel lblDescripcionProducto = new JLabel("Descripcion:");
		lblDescripcionProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDescripcionProducto.setBounds(35, 199, 100, 26);
		panelFondoCategorias.add(lblDescripcionProducto);
		
		textDescripcion = new JTextField();
		textDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textDescripcion.setBounds(192, 199, 215, 26);
		panelFondoCategorias.add(textDescripcion);
		
	    btnAgregar = new JButton("Agregar");
		btnAgregar.setIcon(new ImageIcon(PanelCategorias.class.getResource("/img/guardar-el-archivo.png")));
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAgregar.setBounds(482, 126, 125, 26);
		panelFondoCategorias.add(btnAgregar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(PanelCategorias.class.getResource("/img/historial1.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBuscar.setBounds(632, 163, 118, 26);
		panelFondoCategorias.add(btnBuscar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(PanelCategorias.class.getResource("/img/reporte1.png")));
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEditar.setBounds(468, 163, 139, 26);
		panelFondoCategorias.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(PanelCategorias.class.getResource("/img/eliminar.jpg")));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEliminar.setBounds(622, 126, 139, 26);
		panelFondoCategorias.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 293, 722, 168);
		panelFondoCategorias.add(scrollPane);
		
		tablaCategorias = new JTable();
		scrollPane.setViewportView(tablaCategorias);
		tablaCategorias.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre de Categoria", "Descrpcion de Categoria"
			}
		));
		
		textId = new JTextField();
		textId.setEditable(false);
		textId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textId.setColumns(10);
		textId.setBounds(192, 107, 215, 26);
		panelFondoCategorias.add(textId);
		
		lblId = new JLabel("Id:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBounds(35, 107, 81, 26);
		panelFondoCategorias.add(lblId);

	}
}
