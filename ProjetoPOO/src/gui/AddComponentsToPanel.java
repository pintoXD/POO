package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JTabbedPane;

public class AddComponentsToPanel {
	
	public void addComponentsToPanel(Container pane){
		
		SecretaryTab secretary = new SecretaryTab();
		MedicTab medic = new MedicTab();
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.add("Secretary", secretary.createSecTab());
		tabbedPane.add("Medic", medic. createMedicPane());
		
		pane.add(tabbedPane,BorderLayout.CENTER);
		
		
		
		
		
	}
	
	
	

}
