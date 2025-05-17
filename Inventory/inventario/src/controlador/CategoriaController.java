package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DAO.CategoriaDAO;
import modelo.CategoriaModel;
import vistas.FrmPrincipal;


public class CategoriaController implements ActionListener {

	FrmPrincipal frame;
	CategoriaDAO categoriaDao;
	CategoriaModel categoriaModel;
	
	
	
	
	public CategoriaController(FrmPrincipal frame) {
		super();
		this.frame = frame;
		
		categoriaDao= new CategoriaDAO("inventario");
		
		
		this.frame.vistaCategorias.btnAgregar.addActionListener(this);
		this.frame.vistaCategorias.btnBuscar.addActionListener(this);
		this.frame.vistaCategorias.btnEditar.addActionListener(this);
		this.frame.vistaCategorias.btnEliminar.addActionListener(this);
		
		llenarTablaCategorias(this.frame.vistaCategorias.tablaCategorias);
		
		
	}



	
	

	//ACCIONES
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		//Agregar
		if(e.getSource() == this.frame.vistaCategorias.btnAgregar)
		{
					
			
			categoriaModel= new CategoriaModel(0,
					                    this.frame.vistaCategorias.textNombre.getText(),
					                    this.frame.vistaCategorias.textDescripcion.getText()
					                   );
			
			if(
				!this.frame.vistaCategorias.textNombre.getText().equals("") && 
				!this.frame.vistaCategorias.textDescripcion.getText().equals(""))
		
				
			{
				
			categoriaDao.agregar(categoriaModel);
			
			
			llenarTablaCategorias(this.frame.vistaCategorias.tablaCategorias);
			borrarCampos();
				
				
				JOptionPane.showMessageDialog(null, "!Categoria agregado con exito");
				
			    }
				
				else {
					
					JOptionPane.showMessageDialog(null, "!Invalido!Debes llenar todos los campos");
				     }	
		}//fin de agregar usuario
		
		
		
		
		
		
		
		//Buscar
		if (e.getSource() == this.frame.vistaCategorias.btnBuscar) {
		    try {
		        int fila = this.frame.vistaCategorias.tablaCategorias.getSelectedRow();
		        
		        int id = Integer.parseInt((String) this.frame.vistaCategorias.tablaCategorias.getValueAt(fila, 0));
		        System.out.print(id);
		        
		        
		        categoriaModel = new CategoriaModel(id, "", "");
		        
		      
		       categoriaDao.buscar(categoriaModel);
		        
		    
		    
		        
		      
		        this.frame.vistaCategorias.textId.setText(categoriaDao.buscar(categoriaModel).getIdCategoria() + "" );
				this.frame.vistaCategorias.textNombre.setText(categoriaDao.buscar(categoriaModel).getNombre());
				this.frame.vistaCategorias.textDescripcion.setText(categoriaDao.buscar(categoriaModel).getDescripcion()); 
				
			
				
		        
		    } catch (Exception ex) {
		        ex.printStackTrace();
		        JOptionPane.showMessageDialog(null, "!Invalido!Debes seleccionar una fila");
		    }
		}
		
		
		
		
		        //Editar
				if(e.getSource() == this.frame.vistaCategorias.btnEditar)
				{
					try {
					int idCategoria = Integer.parseInt(this.frame.vistaCategorias.textId.getText());
					
					categoriaModel= new CategoriaModel(idCategoria,
							                    this.frame.vistaCategorias.textNombre.getText(),
							                    this.frame.vistaCategorias.textDescripcion.getText());
							    				
					
					if(	!this.frame.vistaCategorias.textNombre.getText().equals("") && 
						!this.frame.vistaCategorias.textDescripcion.getText().equals(""))
						{
						categoriaDao.editar(categoriaModel);
						
						
						
						llenarTablaCategorias(this.frame.vistaCategorias.tablaCategorias);
						borrarCampos();
						
						JOptionPane.showMessageDialog(null, "!categoria editada con exito");
						
					    }
						
						else {
							
							JOptionPane.showMessageDialog(null, "¡Los campos no deben estar vacíos! Llenalos para continuar.");
						}	
					}catch(Exception exe)
					{
						exe.printStackTrace();
						JOptionPane.showMessageDialog(null, "!Invalido!Debes seleccionar una fila de la tabla categorias");
					}
				}
		
		
		
		
				
				//Eliminar
				if(e.getSource() == this.frame.vistaCategorias.btnEliminar)
				{
						
						int fila= this.frame.vistaCategorias.tablaCategorias.getSelectedRow();
					    System.out.print(fila);
					    
					    
					    int id= Integer.parseInt((String)this.frame.vistaCategorias.tablaCategorias.getValueAt(fila,0));
						
					    System.out.print(id);
						
					   categoriaModel = new CategoriaModel(id,"","");
					    
					   
					    
					    categoriaDao.buscar(categoriaModel);
						
						
					    this.frame.vistaCategorias.textId.setText(categoriaDao.buscar(categoriaModel).getIdCategoria() + "" );
						this.frame.vistaCategorias.textNombre.setText(categoriaDao.buscar(categoriaModel).getNombre());
						this.frame.vistaCategorias.textDescripcion.setText(categoriaDao.buscar(categoriaModel).getDescripcion()); 

						
						categoriaDao.eliminar(categoriaModel);
						
					
						
						llenarTablaCategorias(this.frame.vistaCategorias.tablaCategorias);
						borrarCampos();
						
						JOptionPane.showMessageDialog(null, "!categoria eliminada con exito");
						
						
					}
						
		
		
	}//fin de mis acciones
	
	
	
	
	
	//Metodo llenar tabla
	public void llenarTablaCategorias(JTable tablaCategorias) {
	    DefaultTableModel modelo = (DefaultTableModel) tablaCategorias.getModel();
	    

	    modelo.setRowCount(0);
	    
	    for (CategoriaModel categoria: categoriaDao.obtener()) {
	    	
	    	  
	    	
	        String[] fila = 
	        	{ 
	            String.valueOf(categoria.getIdCategoria()),	
	            categoria.getNombre(),
	            categoria.getDescripcion()
	            };
	        
	        modelo.addRow(fila);
	    }
	}
	


	

	public void borrarCampos() {
		this.frame.vistaCategorias.textNombre.setText("");
		this.frame.vistaCategorias.textDescripcion.setText("");
		
		
	}
	

}//Fin de mi clase
