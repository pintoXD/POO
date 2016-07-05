package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import sourceCodes.*;

import javax.swing.JTabbedPane;

public class AddComponentsToMedPanel {
	
	public void addComponentsToMedPanel(Container pane){
		
		DeserializeData localAux = new DeserializeData("PatientsData.ser");
				
		List<Person> listLocal = new ArrayList<Person>(localAux.getList());
		
		SecondTab secondTab = new SecondTab();

		JTabbedPane tabbedPane = new JTabbedPane();
		
		
		tabbedPane.add(secondTab.getTabTitle(), secondTab.createSecondPane(listLocal));
		//tabbedPane.add(thirdTab.getTabTitle(), thirdTab.createThirdPane());
		//tabbedPane.add(forthTab.getTabTitle(), forthTab.createForthPane());
		//tabbedPane.add(fifthTab.getTabTitle(), fifthTab.createFifthPane());
		
		pane.add(tabbedPane,BorderLayout.CENTER);
		
		
		
		
		
	}
	
	
	
	

}
