package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JTabbedPane;

public class AddComponentsToPanel {
	
	public void addComponentsToPanel(Container pane){

		FirstTab schedulling = new FirstTab();
		SecondTab secondTab = new SecondTab();
		ThirdTab thirdTab = new ThirdTab();
		ForthTab forthTab = new ForthTab();
		FifthTab fifthTab = new FifthTab();
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.add(schedulling.getTabTitle(), schedulling.createFirstPane());
		tabbedPane.add(secondTab.getTabTitle(), secondTab.createSecondPane());
		tabbedPane.add(thirdTab.getTabTitle(), thirdTab.createThirdPane());
		tabbedPane.add(forthTab.getTabTitle(), forthTab.createForthPane());
		tabbedPane.add(fifthTab.getTabTitle(), fifthTab.createFifthPane());
		
		pane.add(tabbedPane,BorderLayout.CENTER);
		
		
		
		
		
	}
	
	
	

}
