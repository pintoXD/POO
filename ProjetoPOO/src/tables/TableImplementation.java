package tables;

/*
 * TableDemo.java requires no other files.
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
public class TableImplementation extends JPanel {
    private boolean DEBUG = false;
    
    private List <Person> localPatientsList;
    private DeserializeData deserializeTask;
    public MyTableModel tableModel;

    public TableImplementation(List<Person> tablePatientsList) {
        super(new GridLayout(1,0));
        
        
        localPatientsList = new ArrayList<Person>(tablePatientsList);
        
        
       // deserializeTask = new DeserializeData("PatientsData.ser");
        
       // localPatientsList = deserializeTask.getList();
       /* 
        if(localPatientsList == null){
        	System.out.println("Lista de pacientes vazia");
        }
       */ 
        
        
        tableModel = new MyTableModel(localPatientsList);
        
       
        
        JTable table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }
    
  
}  
    
    
    

