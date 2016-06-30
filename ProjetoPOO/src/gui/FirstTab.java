package gui;

import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;


public class FirstTab {
	
	private JButton medButton, testButton;
	private String tabTitle = "Schedulling";
	private int extraWindowWidth = 100;
	private JTabbedPane tabbedPane;
	
	
	
	public JPanel createFirstPane(){
		
		
		
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
