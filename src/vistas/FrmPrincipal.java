package vistas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controlador.PrincipalController;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class FrmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	// Constantes de UI
	private static final Color COLOR_FONDO_PRINCIPAL = new Color(230, 230, 230);
	private static final Color COLOR_PANEL_TEMA = new Color(251, 224, 132);
	private static final Color COLOR_PANEL_IZQUIERDO = new Color(60, 70, 80);
	private static final Color COLOR_BOTON_BG = new Color(80, 90, 100);
	private static final Color COLOR_BOTON_FG = Color.WHITE;
	private static final Font FONT_TITULO_TEMA = new Font("Tahoma", Font.BOLD, 20);
	private static final Font FONT_BOTON_NAVEGACION = new Font("Segoe UI", Font.BOLD, 15);
	private static final Dimension DIMENSION_BOTON_NAVEGACION = new Dimension(210, 50);
	private static final Dimension DIMENSION_LOGO = new Dimension(200, 180);
	private static final Dimension DIMENSION_PANEL_TEMA = new Dimension(0, 45);
	private static final Dimension DIMENSION_PANEL_IZQUIERDO = new Dimension(240, 0);

	private JPanel contentPane;
	private JPanel panelIzquierdo;
	private JPanel panelVistasPaneles;

	public JButton btnProductos;
	public JButton btnReportes;
	public JButton btnCategorias;
	public JButton btnProveedores;
	public JButton btnClientes;
	public JButton btnUsuarios;

	public PanelProductos vistaProductos;
	public PanelCategorias vistaCategorias;
	public PanelReportes vistaReportes;
	public PanelUsuarios vistaUsuarios;
	public PanelClientes vistaClientes;
	public PanelProveedores vistaProveedores;

	public static final String PANEL_PRODUCTOS_VIEW = "PRODUCTOS_VIEW";
	public static final String PANEL_CATEGORIAS_VIEW = "CATEGORIAS_VIEW";
	public static final String PANEL_REPORTES_VIEW = "REPORTES_VIEW";
	public static final String PANEL_USUARIOS_VIEW = "USUARIOS_VIEW";
	public static final String PANEL_CLIENTES_VIEW = "CLIENTES_VIEW";
	public static final String PANEL_PROVEEDORES_VIEW = "PROVEEDORES_VIEW";

	private CardLayout cardLayoutVistas;
	private PrincipalController principalController;
	private final String TITULO_BASE_APP = "Sistema de Gestión de Inventario - Programadores Guiados por Dios";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmPrincipal() {
		setTitle(TITULO_BASE_APP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		initComponents();
		initVistaPanels();

		principalController = new PrincipalController(this);
		asignarActionListeners();

		mostrarPanel(PANEL_PRODUCTOS_VIEW);
	}

	private void initComponents() {
		JPanel panelTema = new JPanel();
		panelTema.setBackground(COLOR_PANEL_TEMA);
		panelTema.setPreferredSize(DIMENSION_PANEL_TEMA);
		panelTema.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 8));
		contentPane.add(panelTema, BorderLayout.NORTH);

		JLabel lblTema = new JLabel("ÁREA DE GESTIÓN SUPERMARKET");
		try {
			lblTema.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/anadir.png")));
		} catch (Exception e) {
			System.err.println("Error al cargar icono para el tema: /img/anadir.png - " + e.getMessage());
		}
		lblTema.setFont(FONT_TITULO_TEMA);
		panelTema.add(lblTema);

		panelIzquierdo = new JPanel();
		panelIzquierdo.setBackground(COLOR_PANEL_IZQUIERDO);
		panelIzquierdo.setPreferredSize(DIMENSION_PANEL_IZQUIERDO);
		panelIzquierdo.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
		contentPane.add(panelIzquierdo, BorderLayout.WEST);

		JLabel lblLogo = new JLabel();
		try {
			ImageIcon logoIcon = new ImageIcon(FrmPrincipal.class.getResource("/img/InventarioIza.png"));
			lblLogo.setIcon(logoIcon);
		} catch (Exception e) {
			System.err.println("Error al cargar logo: /img/InventarioIza.png - " + e.getMessage());
		}
		lblLogo.setPreferredSize(DIMENSION_LOGO);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		panelIzquierdo.add(lblLogo);

		btnProductos = crearBotonNavegacion("Productos", "/img/producto.png", PANEL_PRODUCTOS_VIEW);
		panelIzquierdo.add(btnProductos);

		btnCategorias = crearBotonNavegacion("Categorías", "/img/categorias.png", PANEL_CATEGORIAS_VIEW);
		panelIzquierdo.add(btnCategorias);

		btnClientes = crearBotonNavegacion("Clientes", "/img/cliente.png", PANEL_CLIENTES_VIEW);
		panelIzquierdo.add(btnClientes);

		btnProveedores = crearBotonNavegacion("Proveedores", "/img/nuevo-cliente.png", PANEL_PROVEEDORES_VIEW);
		panelIzquierdo.add(btnProveedores);

		btnUsuarios = crearBotonNavegacion("Usuarios", "/img/usuario.png", PANEL_USUARIOS_VIEW);
		panelIzquierdo.add(btnUsuarios);

		btnReportes = crearBotonNavegacion("Reportes", "/img/reporte1.png", PANEL_REPORTES_VIEW);
		panelIzquierdo.add(btnReportes);

		panelVistasPaneles = new JPanel();
		cardLayoutVistas = new CardLayout();
		panelVistasPaneles.setLayout(cardLayoutVistas);
		panelVistasPaneles.setBackground(COLOR_FONDO_PRINCIPAL);
		contentPane.add(panelVistasPaneles, BorderLayout.CENTER);
	}

	private JButton crearBotonNavegacion(String texto, String rutaIcono, String actionCommand) {
		JButton boton = new JButton(texto);
		try {
			if (rutaIcono != null && !rutaIcono.isEmpty()) {
				boton.setIcon(new ImageIcon(FrmPrincipal.class.getResource(rutaIcono)));
			}
		} catch (Exception e) {
			System.err.println("Error al cargar icono para el botón '" + texto + "': " + rutaIcono + " - " + e.getMessage());
		}
		boton.setFont(FONT_BOTON_NAVEGACION);
		boton.setForeground(COLOR_BOTON_FG);
		boton.setBackground(COLOR_BOTON_BG);
		boton.setBorder(new EmptyBorder(10, 15, 10, 15));
		boton.setFocusPainted(false);
		boton.setPreferredSize(DIMENSION_BOTON_NAVEGACION);
		boton.setHorizontalAlignment(SwingConstants.LEFT);
		boton.setIconTextGap(15);
		boton.setActionCommand(actionCommand);
		return boton;
	}

	private void initVistaPanels() {
		vistaProductos = new PanelProductos();
		panelVistasPaneles.add(vistaProductos, PANEL_PRODUCTOS_VIEW);

		vistaCategorias = new PanelCategorias();
		panelVistasPaneles.add(vistaCategorias, PANEL_CATEGORIAS_VIEW);

		vistaClientes = new PanelClientes();
		panelVistasPaneles.add(vistaClientes, PANEL_CLIENTES_VIEW);

		vistaProveedores = new PanelProveedores();
		panelVistasPaneles.add(vistaProveedores, PANEL_PROVEEDORES_VIEW);

		vistaUsuarios = new PanelUsuarios();
		panelVistasPaneles.add(vistaUsuarios, PANEL_USUARIOS_VIEW);

		vistaReportes = new PanelReportes();
		panelVistasPaneles.add(vistaReportes, PANEL_REPORTES_VIEW);
	}

	private void asignarActionListeners() {
		btnProductos.addActionListener(principalController);
		btnCategorias.addActionListener(principalController);
		btnClientes.addActionListener(principalController);
		btnProveedores.addActionListener(principalController);
		btnUsuarios.addActionListener(principalController);
		btnReportes.addActionListener(principalController);
	}

	public void mostrarPanel(String nombrePanel) {
		cardLayoutVistas.show(panelVistasPaneles, nombrePanel);
		String tituloSeccion = nombrePanel.replace("_VIEW", "").replace("_", " ");
		tituloSeccion = tituloSeccion.substring(0, 1).toUpperCase() + tituloSeccion.substring(1).toLowerCase();
		setTitle(TITULO_BASE_APP + " - " + tituloSeccion);
	}

	public PanelProductos getVistaProductos() { return vistaProductos; }
	public PanelCategorias getVistaCategorias() { return vistaCategorias; }
	public PanelClientes getVistaClientes() { return vistaClientes; }
	public PanelProveedores getVistaProveedores() { return vistaProveedores; }
	public PanelUsuarios getVistaUsuarios() { return vistaUsuarios; }
	public PanelReportes getVistaReportes() { return vistaReportes; }
}
