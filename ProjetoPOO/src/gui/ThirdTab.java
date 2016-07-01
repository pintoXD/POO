package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ThirdTab {
	
	private JButton medButton, testButton;
	private String tabTitle = "Schedulling";
	private int extraWindowWidth = 100;
	private JTabbedPane tabbedPane;
	
	
	
	public JPanel createThirdPane(){
		
		
		
		JPanel screenMedTab = new JPanel(new BorderLayout())/*{
				//Make one test to see if it is really needed 
	            public Dimension getPreferredSize() {
	                Dimension size = super.getPreferredSize();
	                size.width += extraWindowWidth;
	                return size;
	            }*/;
				
		medButton = new JButton("Medico");	
		testButton = new JButton("Test Button");
		
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		
		buttonPanel.add(medButton);
		buttonPanel.add(testButton);
				
		screenMedTab.add(buttonPanel, BorderLayout.SOUTH);
		
	
		
		//tabbedPane.addTab(tabOneTitle, screenMedTab);
		

		
		return screenMedTab;
		
		
	}
	
	
	public String getTabTitle(){
		
		return tabTitle;
		
	}
	
	
	

}
