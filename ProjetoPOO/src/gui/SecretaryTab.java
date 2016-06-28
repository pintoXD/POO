package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class SecretaryTab {

	private JButton secButton;
	private JTextField textSec;
	
	public JPanel createSecTab(){
		
		//JTabbedPane tabbedPane = new JTabbedPane();

		 secButton = new JButton("Secretary");
		 textSec = new JTextField("Madafucka!", 15);
		
		//screenOne.setLayout(BorderLayout.CENTER);
		//Container testPane = null;
		
		JPanel secComponents = new JPanel();
		secComponents.setLayout(new GridLayout(1, 3));
		secComponents.add(textSec);
		secComponents.add(secButton);
		secComponents.add(new JTextField("Enter code here", 30));
		//secComponents.setSize(HEIGHT, HEIGHT);
		
		
		//screenOne.add(medButton,BorderLayout.SOUTH);
		
		//testPane.add(screenOne, BorderLayout.SOUTH);
		
		JPanel screenSecretaryTab = new JPanel(new BorderLayout());
		
		screenSecretaryTab.add(secComponents, BorderLayout.SOUTH);
		
		//screenTwo.add(, BorderLayout.SOUTH);
		
		//tabbedPane.addTab("HAeuahuehuahe", secTab);
		//tabbedPane.addTab(tabTwoTitle, screenTwo);
		
		//pane.add(tabbedPane,BorderLayout.CENTER);
		
	
		return screenSecretaryTab;
		
		
	}
	
	
	
}
