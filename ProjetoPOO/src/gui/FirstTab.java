package gui;


import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;

import sourceCodes.*;


public class FirstTab extends JPanel implements ActionListener {
	
	private JButton medButton, testButton;
	private String tabTitle = "Schedulling";
	private JTextField nameReceive, dateReceive;
	private JComboBox medList;
	private List <Person> patientsList = new ArrayList<Person>();
	
	public JPanel createFirstPane(){
		String medTypes[] = {"<Selecionar>","Cardiologista",
				"Clínico Geral",
				"Gastroenterologista",
				"Odontologista",
				"Ortopedista",
				"Pediatra"};
		
		//JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		//JPanel genericPanel = new JPanel(new GridLayout(1, 2));
		
		JPanel genericPanelOne = new JPanel(new FlowLayout());
		JPanel genericPanelTwo = new JPanel(new FlowLayout());
		
		JPanel screenFirstTab = new JPanel(new FlowLayout())/*{
				//Make one test to see if it is really needed
	            public Dimension getPreferredSize() {
	                Dimension size = super.getPreferredSize();
	                  size.width += extraWindowWidth;
	                return size;
	            }*/;
				
		
		medList = new JComboBox(medTypes);
		
		medButton = new JButton("OK");	
		testButton = new JButton("Limpar");
		
		
		JLabel name = new JLabel("Nome do Paciente");
		JLabel date = new JLabel("Data Desejada");
		
		
		 nameReceive = new JTextField(20);
		 dateReceive = new JTextField(20);
		
		
		FirstTab teste = new FirstTab();
		ButtonHandler handler = teste.new ButtonHandler(medButton, testButton, medList, nameReceive, dateReceive);
		
		medList.setSelectedIndex(0);
		medList.addActionListener(handler);
		
		medButton.addActionListener(handler);
		testButton.addActionListener(handler);
		
		
		//buttonPanel.add(medButton);
		//buttonPanel.add(testButton);
				
		//genericPanel.add(medList);
		//genericPanel.add(buttonPanel);

		/*-------------------------------------*/
		genericPanelOne.add(dateReceive,FlowLayout.LEFT);
		genericPanelOne.add(date,FlowLayout.LEFT);
		
		/*----------------------------------*/
		genericPanelTwo.add(nameReceive,FlowLayout.LEFT);
		genericPanelTwo.add(name,FlowLayout.LEFT);
		
		/*-------------------------------------*/
		
		
		screenFirstTab.add(medButton, LEFT_ALIGNMENT);
		screenFirstTab.add(testButton, LEFT_ALIGNMENT);
		
		
		screenFirstTab.add(medList, FlowLayout.LEFT);
		screenFirstTab.add(new JLabel("Médico:"), FlowLayout.LEFT);
		
		screenFirstTab.add(genericPanelOne, FlowLayout.LEFT);		
		screenFirstTab.add(genericPanelTwo,FlowLayout.LEFT);
		
	
		
		
		//screenMedTab.add(new JPanel(),BorderLayout.WEST);
		//screenMedTab.add(new JPanel(),BorderLayout.EAST);
		
		
		//tabbedPane.addTab(tabOneTitle, screenMedTab);

		//screenMedTab.add(buttonPanel, BorderLayout.PAGE_START);
		
		
	
		
		
		return screenFirstTab;
		
		
	}
	
	


	public String getTabTitle(){
		
		return tabTitle;
		
	}

/*
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == medButton);
		JOptionPane.showMessageDialog(null, "O botão medButton foi clicado");
		
		if(e.getSource() == testButton);
		JOptionPane.showMessageDialog(null, "O botão testButton foi clicado");
		
	}*/
	
	//Handler dos botões, lá embaixo coloquei o ComboBox, mas acho que tem de tirar pra dar bom
	public class ButtonHandler implements ActionListener
	{
		 private JButton medButton, testButton;
		 private JComboBox medList;
		 private JTextField nameReceive;
		 private JTextField dateReceive;
		 
		public ButtonHandler(JButton medButton, JButton testButton, JComboBox medList, JTextField nameReceive, JTextField dateReceive ) {
	
			// TODO Auto-generated constructor stub
		
		this.medButton = medButton;
		this.testButton = testButton;
		this.medList = medList;
		this.nameReceive = nameReceive;
		this.dateReceive = dateReceive;
		
		}
		 
		 
		
		
		//TRATA EVENTO DO BOTÃO
		//É aqui que fica os eventos pra engatilhar a comparaçãoe gravaçãode dados pro agendamento
		public void actionPerformed(ActionEvent event)
		{
			//JOptionPane.showMessageDialog(FirstTab.this, String.format("Você pressionou: %s", event.getActionCommand()));
			if(event.getSource() == medButton){
			//JOptionPane.showMessageDialog(null, "O botão medButton foi clicado");
			
			String medic = medList.getSelectedItem().toString();
			String name= nameReceive.getText().toString();
			String date= dateReceive.getText().toString();
			
			System.out.println("Nome: "+name);
			System.out.println("Data; "+date);
			System.out.println("Médico:" +medic);
			
			addToList(name, date, medic, false);
			
			JOptionPane.showMessageDialog(null, "Consulta agendada com sucesso.");
			
			clearFields();
			
			}
			
			
			if(event.getSource() == testButton){
			//JOptionPane.showMessageDialog(null, "O botão testButton foi clicado");
			clearFields();
			}
			
			
		}
	
	public void clearFields(){
		medList.setSelectedIndex(0);
		nameReceive.setText(null);
		dateReceive.setText(null);
		
		
	}
	
	public void addToList(String name, String date, String medic, boolean state){
		patientsList.add(new Person(name, date, medic, false));
	}
	
	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
