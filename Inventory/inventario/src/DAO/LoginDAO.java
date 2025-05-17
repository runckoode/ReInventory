package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;

import modelo.UsuarioModel;

public class LoginDAO extends Conexion {

	PreparedStatement ps;
	ResultSet rs;

	
	public LoginDAO(String inventario) {
		super(inventario);
		// TODO Auto-generated constructor stub
	}

	
	
	
  
    public boolean loginUser(UsuarioModel usuario) {
        String query = "SELECT * FROM tabla_usuarios WHERE usuario = ? AND contrasena = ? "; 
        boolean existeUsuario = false; 

        try {
            ps =  con.prepareStatement(query); 
            ps.setString(1, usuario.getUsuario()); 
            ps.setString(2, usuario.getContrasena()); 

            rs = ps.executeQuery();

          
            if (rs.next()) {
                existeUsuario = true; 
                
            }

           
            if (rs != null) rs.close(); 
            if (ps != null) ps.close(); 
            
        } catch (SQLException e) {
            e.printStackTrace(); 
        }

        return existeUsuario; 
    }
}	
	
	
	

