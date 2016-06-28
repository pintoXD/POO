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
	private JButton medButton, secButton;
	private JPanel testPanel;
	private String tabOneTitle = "Schedulling";
	private String tabTwoTitle = "TestTab";
	private int extraWindowWidth = 100;
	
	
	public void addComponentToPane(Container pane){
		
		JTabbedPane tabbedPane = new JTabbedPane();
		JPanel screenOne = new JPanel(new BorderLayout())/*{
			//Make one test to see if it is really needed
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += extraWindowWidth;
                return size;
            }
			
			
			
		}*/;
		
		medButton = new JButton("Medico");
		secButton = new JButton("Secretary");
		
		//screenOne.setLayout(BorderLayout.CENTER);
		//Container testPane = null;
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, 2));
		buttonPanel.add(medButton);
		buttonPanel.add(secButton);
		buttonPanel.setSize(HEIGHT, HEIGHT);
		
		
		//screenOne.add(medButton,BorderLayout.SOUTH);
		
		//testPane.add(screenOne, BorderLayout.SOUTH);
		
		screenOne.add(buttonPanel, BorderLayout.SOUTH);
		
		
		JPanel screenTwo = new JPanel(new BorderLayout());
		
		screenTwo.add(new JTextField("Enter code here", 30), BorderLayout.SOUTH);
		
		tabbedPane.addTab(tabOneTitle, screenOne);
		tabbedPane.addTab(tabTwoTitle, screenTwo);
		
		pane.add(tabbedPane,BorderLayout.CENTER);
		
	
		
		
	}
	
	public static void createAndShowGUI(){
		
		JFrame frame = new JFrame("Teste Frame");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MainUserInterface demo = new  MainUserInterface();
		
		 demo.addComponentToPane(frame.getContentPane());
		 
		 frame.pack();
		 frame.setSize(500, 500);
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
		
	}
	
	
	
	
	
	
	
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
                createAndShowGUI();
            }
        });
		
		
		
		
		
	}
	
	
	
}
  


