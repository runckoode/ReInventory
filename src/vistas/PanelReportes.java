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
import javax.swing.border.EtchedBorder;

public class PanelReportes extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField textNombre;
	public JTextField textId;
	
	public JButton btnReporteGeneral;
	public JButton btnReporteNombre;
	public JButton btnReporteId;
	
	
	
	public PanelReportes() {
		setLayout(null);
		
		JPanel panelFondoUsuarios = new JPanel();
		panelFondoUsuarios.setBounds(0, 0, 771, 527);
		panelFondoUsuarios.setLayout(null);
		panelFondoUsuarios.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CONTROL DE REPORTES", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelFondoUsuarios.setBackground(new Color(215, 255, 255));
		add(panelFondoUsuarios);
		
		JLabel lblControlDeLos = new JLabel("Control de los Reportes");
		lblControlDeLos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblControlDeLos.setBounds(214, 44, 249, 26);
		panelFondoUsuarios.add(lblControlDeLos);
		
		JLabel lblNombreUsuario = new JLabel("Nombre Producto:");
		lblNombreUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombreUsuario.setBounds(24, 203, 169, 26);
		panelFondoUsuarios.add(lblNombreUsuario);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNombre.setColumns(10);
		textNombre.setBounds(248, 204, 215, 26);
		panelFondoUsuarios.add(textNombre);
		
		btnReporteGeneral = new JButton("Reporte Stock General Productos");
		btnReporteGeneral.setIcon(new ImageIcon(PanelReportes.class.getResource("/img/guardar-el-archivo.png")));
		btnReporteGeneral.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReporteGeneral.setBounds(101, 301, 362, 26);
		panelFondoUsuarios.add(btnReporteGeneral);
		
		btnReporteId = new JButton("Reporte Stock Por ID Producto");
		btnReporteId.setIcon(new ImageIcon(PanelReportes.class.getResource("/img/historial1.png")));
		btnReporteId.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReporteId.setBounds(101, 354, 362, 26);
		panelFondoUsuarios.add(btnReporteId);
		
		btnReporteNombre = new JButton("Reporte Stock Por Nombre Producto");
		btnReporteNombre.setIcon(new ImageIcon(PanelReportes.class.getResource("/img/historial1.png")));
		btnReporteNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReporteNombre.setBounds(101, 415, 367, 26);
		panelFondoUsuarios.add(btnReporteNombre);
		
		JLabel lblIconoSuperior = new JLabel("");
		lblIconoSuperior.setIcon(new ImageIcon(PanelReportes.class.getResource("/img/reporte1.png")));
		lblIconoSuperior.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIconoSuperior.setBounds(180, 44, 44, 43);
		panelFondoUsuarios.add(lblIconoSuperior);
		
		JLabel lblIDProducto = new JLabel("Id Producto:");
		lblIDProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIDProducto.setBounds(24, 153, 144, 26);
		panelFondoUsuarios.add(lblIDProducto);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textId.setColumns(10);
		textId.setBounds(248, 154, 215, 26);
		panelFondoUsuarios.add(textId);
		
		

	}
}
