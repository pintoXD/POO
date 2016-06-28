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

public class MainUserInterface extends JFrame {

	//private static final LayoutManager BorderLayout.CENTER = null;
	private JButton secButton;
	private JPanel testPanel;
	//private String tabOneTitle = "Schedulling";
	private String tabTwoTitle = "TestTab";
	private int extraWindowWidth = 100;
	
	
	
/*
	public MainUserInterface(){
		
	testPanel = new JPanel();
	setLayout(new GridLayout(2,2));	
		
	setSize(500,500);
	setTitle("Teste de GUI");
	
	medButton = new JButton("Medico");
	
	//medButton.setSize(100,100);
	//medButton.setAlignmentX(CENTER_ALIGNMENT);
	//medButton.setAlignmentY(CENTER_ALIGNMENT);
	
	//medButton.setLayout(null);
	
	testPanel.add(medButton);
	testPanel.setLocation(255, 100);
	this.add(testPanel);
*/

	
	
	public static void main (String[] args){
		
		
		CreateAndShowGUI teste = new CreateAndShowGUI();
		 
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
       // UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                teste.createAndShowGUI();
            }
        });
		
		
		
		
		
	}
	
	
	
}
  


