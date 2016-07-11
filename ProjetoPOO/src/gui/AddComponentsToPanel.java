package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.List;

import sourceCodes.*;
import javax.swing.JTabbedPane;

public class AddComponentsToPanel {
	
	//private List<Person> listOfPatients;
	
	
	public void addComponentsToPanel(Container pane){
		
		//List<Person> = DeserializeData("PatientsData");
		
		
		

		FirstTab schedulling = new FirstTab();
		SecondTab secondTab = new SecondTab();
		//ThirdTab thirdTab = new ThirdTab();
		//ForthTab forthTab = new ForthTab();
		//FifthTab fifthTab = new FifthTab();
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.add(schedulling.getTabTitle(), schedulling.createFirstPane());
		tabbedPane.add(secondTab.getTabTitle(), secondTab.createSecondPane(/*schedulling.getPatientsList()*/));
		//tabbedPane.add(thirdTab.getTabTitle(), thirdTab.createThirdPane());
		//tabbedPane.add(forthTab.getTabTitle(), forthTab.createForthPane());
		//tabbedPane.add(fifthTab.getTabTitle(), fifthTab.createFifthPane());
		
		pane.add(tabbedPane,BorderLayout.CENTER);
		
		
		
		
		
	}
	
	
	

}
