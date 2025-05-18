package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.FrmPrincipal;

import javax.swing.JPanel;

public class PrincipalController implements ActionListener {

	
	//Atributos
	FrmPrincipal frame;

	
	//Constructor
	public PrincipalController(FrmPrincipal frame) {
		super();
		this.frame = frame;

		this.frame.btnProductos.addActionListener(this);
		this.frame.btnReportes.addActionListener(this);
		this.frame.btnCategorias.addActionListener(this);
		this.frame.btnClientes.addActionListener(this);
		this.frame.btnProveedores.addActionListener(this);
		

	}
	
	
	
	
	//Metodos
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== this.frame.btnProductos)
		{
			mostrarPanel(this.frame.vistaProductos);
		}
		
		
		
		if(e.getSource()==this.frame.btnCategorias)
		{
			mostrarPanel(this.frame.vistaCategorias);
		}
		
		
		if(e.getSource()==this.frame.btnReportes)
		{
			mostrarPanel(this.frame.vistaReportes);
		}
		
		
		if(e.getSource()==this.frame.btnClientes)
		{
			mostrarPanel(this.frame.vistaClientes);
		}
		
		
		if(e.getSource()==this.frame.btnProveedores)
		{
			mostrarPanel(this.frame.vistaProveedores);
		}
		
	}
	
	
	public void mostrarPanel(JPanel panel)
	{
		this.frame.vistaProductos.setVisible(false);
        this.frame.vistaCategorias.setVisible(false);
        this.frame.vistaReportes.setVisible(false);
        this.frame.vistaClientes.setVisible(false);
        this.frame.vistaProveedores.setVisible(false);
    
       
        panel.setVisible(true);
        
	
	
}
	
}
