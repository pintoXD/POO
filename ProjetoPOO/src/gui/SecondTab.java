package gui;

import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.JTabbedPane;

import tables.TableImplementation;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class SecondTab {
	
	private JButton medButton, testButton;
	private String tabTitle = "Schedulling";
	private int extraWindowWidth = 100;
	private JTabbedPane tabbedPane;
	private JComboBox optionList;
	
	
	
	
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
		  
		String options[] = {"Excluir", "Alterar", "Procurar"};	
		
		
		optionList = new JComboBox(options);
		
		
		
		
		
		
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		
		buttonPanel.add(medButton);
		buttonPanel.add(testButton);
		
		
		TableImplementation exemplo = new TableImplementation();
		
		
		
		
		screenMedTab.add(exemplo, BorderLayout.CENTER);
		screenMedTab.add(buttonPanel, BorderLayout.SOUTH);
		
		
	
		
		//tabbedPane.addTab(tabOneTitle, screenMedTab);
		

		
		return screenMedTab;
		
		
	}
	
	
	public String getTabTitle(){
		
		return tabTitle;
		
	}
	
	
	

}
