package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	protected static Connection con;
	private String driver;
	private String db;
	private String user;
	private String pass;
	private String url;
	

	public Conexion(String db) {
		super();
		this.driver = "com.mysql.jdbc.Driver";
		
	
		try {
			
			//Cargando driver
			System.out.println("Cargando driver de conexion...");
			Class.forName(driver);
			System.out.println("Se cargo el driver correctamente!");
			
			//Conectandose a la base de datos 
			
			this.db = db;
			this.url = "jdbc:mysql://localhost/"+this.db;
			this.user = "root";
			this.pass = "";
			
			System.out.println("Conectandose a la base de datos...");
			this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
			System.out.println("Se conecto, Con exito!");
			
			
		} catch (ClassNotFoundException | SQLException e) {
		
			System.out.println("Error al establecer la conexion!");
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public Connection getC()
	{
		return con;
	}
	
}











