package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import DAO.LoginDAO;
import modelo.UsuarioModel;
import vistas.FrmLogin;
import vistas.FrmPrincipal;


public class LoginController implements ActionListener{

	LoginDAO loginDao;
	UsuarioModel usuarioModel;
	FrmLogin vistaLogin;
	
	
	
	public LoginController(FrmLogin vistaLogin) {
		super();
		this.vistaLogin=vistaLogin;
		this.loginDao= new LoginDAO("inventario");
		
		this.vistaLogin.btnIngresar.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		//Si se presiona ingresar
				if(e.getSource()==this.vistaLogin.btnIngresar)
				{
				    usuarioModel = new UsuarioModel(0,"","","",""); 
					
					
					usuarioModel.setUsuario(vistaLogin.textUsuario.getText());
					char[] contrasenaChars = vistaLogin.textContrasena.getPassword();
			        usuarioModel.setContrasena(new String(contrasenaChars)); 
			        
			        
			        if(loginDao.loginUser(usuarioModel))
			        {
			        	FrmPrincipal menu = new FrmPrincipal();
			            menu.setVisible(true);
			            menu.setLocationRelativeTo(menu);
			            
			          
			         
			       	 PrincipalController controladorPrincipal= new  PrincipalController(menu);
					 UsuarioController controladorUsuarios= new  UsuarioController(menu);
			         ClienteController controladorClientes= new   ClienteController(menu);
			         ProveedorController controladorProveedores= new   ProveedorController(menu);
			         ProductoController controladorProducto= new ProductoController(menu);
			         CategoriaController controladorCategoria= new  CategoriaController(menu);
			            
			      
			            
			            
			            vistaLogin.dispose();
			        }else {
			        	JOptionPane.showMessageDialog(null,"Usuario o contraseña invalido","Mensaje de error", JOptionPane.ERROR_MESSAGE);
			        }
				}
		
	}

}
