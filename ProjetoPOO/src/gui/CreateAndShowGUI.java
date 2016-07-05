package gui;

import java.awt.Container;

import javax.swing.JFrame;

public class CreateAndShowGUI {
	
	public void createAndShowGUI(){
		
		
		
		JFrame mainFrame = new JFrame("Tela Principal");
		
		

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//MainUserInterface demo = new  MainUserInterface();
		AddComponentsMainFrame window = new AddComponentsMainFrame();
		
		 window.addComponentsToMainPanel(mainFrame.getContentPane());
		 
		 mainFrame.pack();
		 mainFrame.setSize(1000, 250);
		 mainFrame.setLocationRelativeTo(null);
		 mainFrame.setVisible(true);
		

		
	}
	
	
	

}
