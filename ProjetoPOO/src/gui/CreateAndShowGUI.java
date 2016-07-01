package gui;

import java.awt.Container;

import javax.swing.JFrame;

public class CreateAndShowGUI {
	
	public void createAndShowGUI(){
		
		JFrame frame = new JFrame("Teste Frame");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//MainUserInterface demo = new  MainUserInterface();
		AddComponentsToPanel demo = new AddComponentsToPanel();
		
		 demo.addComponentsToPanel(frame.getContentPane());
		 
		 frame.pack();
		 frame.setSize(1000, 250);
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
		
	}
	
	
	

}
