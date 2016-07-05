package tables;

/*
 * TableDemo.java requires no other files.
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import sourceCodes.*;
/** 
 * TableDemo is just like SimpleTableDemo, except that it
 * uses a custom TableModel.
 */
public class TableImplementation extends JPanel implements TableModelListener{
    private boolean DEBUG = false;
    
    private List <Person> localPatientsList;
    private DeserializeData deserializeTask;
    private MyTableModel tableModel;
    private JTable table;
    public TableImplementation(List<Person> tablePatientsList) {
        super(new GridLayout(1,0));
        
        
        //localPatientsList = new ArrayList<Person>(tablePatientsList);
        
        
       // deserializeTask = new DeserializeData("PatientsData.ser");
        
       // localPatientsList = deserializeTask.getList();
       /* 
        if(localPatientsList == null){
        	System.out.println("Lista de pacientes vazia");
        }
       */ 
        
        if(tablePatientsList == null){
        	 this.tableModel = new MyTableModel();
        	 System.out.println("Tá vazio aqui ein");
        	 
        }
        else {  
        	System.out.println("Tá vazio aqui ein");
        this.tableModel = new MyTableModel(tablePatientsList);
        
        }
       tableModel.addPaciente();
       
        
        
        table = new JTable(tableModel);
       
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        
       
        
        
        
       // table.addAncestorListener(null);
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }
   
    
    
    public TableImplementation() {
		// TODO Auto-generated constructor stub
	}
    
    
    
   public void teste(){
	   
	   System.out.println("Entrou em teste");
	try{
	   if(tableModel == null){
		   System.out.println("Table model null");
		   
		   
	   }
	   
	   
	   tableModel.addPaciente();
	   //tableModel.fireTableDataChanged();
	   table.revalidate();
	}catch(NullPointerException e){
		System.out.println("Table model null");
	}
   }

@Override
public void tableChanged(TableModelEvent e) {
	// TODO Auto-generated method stub
	
}
}  
    
    
    

