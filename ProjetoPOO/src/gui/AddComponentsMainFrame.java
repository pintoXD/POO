package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import sourceCodes.DeserializeData;
import sourceCodes.Person;

public class AddComponentsMainFrame implements ActionListener {
	private JButton medButton;
	private JButton secretaryButton;
	
	public void addComponentsToMainPanel(Container pane){
		
		//List<Person> = DeserializeData("PatientsData");
		
		JPanel mainPanel = new JPanel(new FlowLayout());
		
		medButton = new JButton("Médico");
		secretaryButton = new JButton("Secretária");
		
		ButtonHandler handler = new ButtonHandler(medButton, secretaryButton);
		
		medButton.addActionListener(handler);
		secretaryButton.addActionListener(handler);
		
		mainPanel.add(secretaryButton);
		mainPanel.add(medButton);
		
		
		
		
		pane.add(mainPanel,BorderLayout.CENTER);
		
	}
		
		public class ButtonHandler implements ActionListener
		{

			 
			private JButton medButton;
			private JButton secretaryButton;




			public ButtonHandler(JButton medButton, JButton secretaryButton) {
		
				// TODO Auto-generated constructor stub
			this.medButton = medButton;
			this.secretaryButton = secretaryButton;
					
			
			}
			 
			 
			
			
			//TRATA EVENTO DO BOTÃO
			//É aqui que fica os eventos pra engatilhar a comparaçãoe gravaçãode dados pro agendamento
			public void actionPerformed(ActionEvent event)
			{
				//JOptionPane.showMessageDialog(FirstTab.this, String.format("Você pressionou: %s", event.getActionCommand()));
			if(event.getSource() == medButton){
				JFrame medFrame = new JFrame("Painel Médico");
				medFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				AddComponentsToMedPanel medWindow = new AddComponentsToMedPanel();
				
				medWindow.addComponentsToMedPanel(medFrame.getContentPane());
				
				
				 medFrame.pack();
				 medFrame.setSize(1000, 250);
				 medFrame.setLocationRelativeTo(null);
				 medFrame.setVisible(true);
				
				
				
				
				
				
			}
			
			if(event.getSource() == secretaryButton){
				
				JFrame secretaryFrame = new JFrame("Painel Secretára");	
				secretaryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				AddComponentsToPanel demo = new AddComponentsToPanel();
				
				 demo.addComponentsToPanel(secretaryFrame.getContentPane());
				 
				 secretaryFrame.pack();
				 secretaryFrame.setSize(1000, 250);
				 secretaryFrame.setLocationRelativeTo(null);
				 secretaryFrame.setVisible(true);
				
						
			}
			
			
			
			}
		
		
		
		
		
		
		
		
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
