package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ClienteController;
import controlador.PrincipalController;
import controlador.ProveedorController;
import controlador.UsuarioController;
import controlador.ProductoController;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnProductos;
	public JButton btnReportes;
	public JButton btnCategorias;
	public JButton btnProveedores;
	public JButton btnClientes;
	
	public PanelProductos vistaProductos= new PanelProductos();
	public PanelCategorias vistaCategorias= new PanelCategorias();
	public PanelReportes vistaReportes= new PanelReportes();
	public PanelUsuarios vistaUsuarios= new PanelUsuarios();
	public PanelClientes vistaClientes= new PanelClientes();
	public PanelProveedores vistaProveedores= new PanelProveedores();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setVisible(true);
					frame.setTitle("Programadores Guiados por Dios");
			         
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTema = new JPanel();
		panelTema.setBackground(new Color(251, 224, 132));
		panelTema.setBounds(0, 0, 987, 35);
		contentPane.add(panelTema);
		panelTema.setLayout(null);
		
		JLabel lblTema = new JLabel("AREA DE GESTION SUPERMARKET");
		lblTema.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/anadir.png")));
		lblTema.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTema.setBounds(273, 0, 369, 35);
		panelTema.add(lblTema);
		
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setBackground(new Color(255, 255, 255));
		panelIzquierdo.setBounds(0, 35, 214, 527);
		contentPane.add(panelIzquierdo);
		panelIzquierdo.setLayout(null);
		
		btnProductos = new JButton("Productos");
		btnProductos.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/categorias.png")));
		btnProductos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnProductos.setBounds(23, 232, 181, 39);
		panelIzquierdo.add(btnProductos);
		
		btnReportes = new JButton("Reportes");
		btnReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReportes.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/reporte1.png")));
		btnReportes.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReportes.setBounds(23, 461, 181, 39);
		panelIzquierdo.add(btnReportes);
		
		btnCategorias = new JButton("Categorias");
		btnCategorias.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/nuevo-producto.png")));
		btnCategorias.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCategorias.setBounds(23, 292, 181, 39);
		panelIzquierdo.add(btnCategorias);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/InventarioIza.png")));
		lblNewLabel.setBounds(23, 43, 150, 178);
		panelIzquierdo.add(lblNewLabel);
		
		btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClientes.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/cliente.png")));
		btnClientes.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClientes.setBounds(23, 350, 181, 39);
		panelIzquierdo.add(btnClientes);
		
		btnProveedores = new JButton("Proveedores");
		btnProveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProveedores.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/nuevo-cliente.png")));
		btnProveedores.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnProveedores.setBounds(23, 411, 181, 39);
		panelIzquierdo.add(btnProveedores);
		
		JPanel panelVistasPaneles = new JPanel();
		panelVistasPaneles.setBackground(new Color(16, 100, 200));
		panelVistasPaneles.setBounds(214, 35, 771, 527);
		contentPane.add(panelVistasPaneles);
		panelVistasPaneles.setLayout(null);
		
		
		
		vistaProductos = new PanelProductos();
		vistaProductos.setBounds(0,0,771,527);
		vistaProductos.setVisible(false);
	    panelVistasPaneles.add(vistaProductos);
		 
		
	    
	    vistaCategorias= new PanelCategorias();
	    vistaCategorias.setBounds(0,0,771,527);
	    vistaCategorias.setVisible(false);
	    panelVistasPaneles.add(vistaCategorias);
	    
		 
	    vistaClientes = new PanelClientes();
		vistaClientes.setBounds(0,0,771,527);
		vistaClientes.setVisible(false);
	    panelVistasPaneles.add(vistaClientes);
	    
	    
	    vistaUsuarios = new PanelUsuarios();
	    vistaUsuarios.setBounds(0,0,771,527);
	    vistaUsuarios.setVisible(false);
	    panelVistasPaneles.add(vistaUsuarios);
	    
	    
	    vistaReportes= new PanelReportes();
	    vistaReportes.setBounds(0,0,771,527);
	    vistaReportes.setVisible(false);
	    panelVistasPaneles.add(vistaReportes);
	    
	    
	    
	    vistaProveedores= new PanelProveedores();
	    vistaProveedores.setBounds(0,0,771,527);
	    vistaProveedores.setVisible(false);
	    panelVistasPaneles.add(vistaProveedores);
		
		
		
	}
}
