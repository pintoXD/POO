package gui;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JTextField;

public class MainUserInterface extends JFrame {

	private JButton medButton, secButton;
	
	public MainUserInterface(){
		
	setLayout(new FlowLayout());	
		
	setSize(500,500);
	setTitle("Teste de GUI");
	
	medButton = new JButton("Medico");
	//medButton.setSize(100,100);
	//medButton.setAlignmentX(CENTER_ALIGNMENT);
	//medButton.setAlignmentY(CENTER_ALIGNMENT);
	
	
	
	medButton.setLayout(null);
	
	
	add(medButton);
	medButton.setLocation(255, 100);
		
	}
	
	
	
	

	
	
	
	public static void main (String[] args){
		 
		MainUserInterface teste = new MainUserInterface();
		
		teste.setVisible(true);
		
		
		
		
		
	}
	
	
	
}
  


