package gui;

import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

import demos.TableDemo;

public class SecondTab {
	
	private JButton medButton, testButton;
	private String tabTitle = "Schedulling";
	private int extraWindowWidth = 100;
	private JTabbedPane tabbedPane;
	
	
	
	public JPanel createSecondPane(){
		
		
		
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
		
		
		TableDemo exemplo = new TableDemo();
		
		
		screenMedTab.add(exemplo, BorderLayout.CENTER);
		screenMedTab.add(buttonPanel, BorderLayout.SOUTH);
		
		
	
		
		//tabbedPane.addTab(tabOneTitle, screenMedTab);
		

		
		return screenMedTab;
		
		
	}
	
	
	public String getTabTitle(){
		
		return tabTitle;
		
	}
	
	
	

}
