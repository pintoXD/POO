package gui;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;
import javax.swing.text.MaskFormatter;

import sourceCodes.*;
import tables.MyTableModel;
import tables.TableImplementation;


public class FirstTab extends TableImplementation implements ActionListener {
	
	private JButton medButton, testButton;
	private String tabTitle = "Schedulling";
	private JTextField nameReceive;
	private JFormattedTextField dateReceive;
	private JComboBox medList;
	private int count = 0;
	private List <Person> patientsListOuter;
	
	public void setPatientsList(List<Person> patientsList) {
		this.patientsListOuter = patientsList;
	
		if(this.patientsListOuter == null){
			System.out.println("Tá Null o Array em setPatientsList FirstTab   ");
		}
	
	}




	public JPanel createFirstPane(){
		
		//patientsList = list.getList();
		//patientsList = new ArrayList<Person>();
		
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
		
		
		 nameReceive = new JTextField(50);
		 
			
			DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
			 dateReceive = new JFormattedTextField(df);
			 dateReceive.setColumns(20);
		
		FirstTab teste = new FirstTab();
		ButtonHandler handler = teste.new ButtonHandler(medButton, testButton, medList, nameReceive, dateReceive);
		
		medList.setSelectedIndex(0);
		medList.addActionListener(handler);
		
		medButton.addActionListener(handler);
		testButton.addActionListener(handler);
		
		
		this.patientsListOuter = handler.returnList();
		


		
       // MaskFormatter dateMask = new MaskFormatter("##/##/####");
      //  dateMask.install(tf);
		
		
		
		
		
		//buttonPanel.add(medButton);
		//buttonPanel.add(testButton);
				
		//genericPanel.add(medList);
		//genericPanel.add(buttonPanel);

		/*-------------------------------------*/

		

        try {
            MaskFormatter dateMask = new MaskFormatter("##/##/####");
            dateMask.install(dateReceive);
        } catch (ParseException ex) {
            Logger.getLogger(MaskFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		genericPanelOne.add(dateReceive,FlowLayout.LEFT);
		genericPanelOne.add(date,FlowLayout.LEFT);
		
		/*----------------------------------*/
		genericPanelTwo.add(nameReceive,FlowLayout.LEFT);
		genericPanelTwo.add(name,FlowLayout.LEFT);
		
		/*-------------------------------------*/
		
		
		screenFirstTab.add(medButton, FlowLayout.LEFT );
		screenFirstTab.add(testButton, FlowLayout.LEFT);
		
		
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
		 private JFormattedTextField dateReceive;
		 private List <Person> patientsList;
		 private DeserializeData deSerialize = new DeserializeData("PatientsData.ser");
		 
		public ButtonHandler(JButton medButton, JButton testButton, JComboBox medList, JTextField nameReceive, JFormattedTextField dateReceive ) {
	
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
			System.out.println("Data:"+date);
			System.out.println("Médico:" +medic);
			
			if(medic.equals("<Selecionar>")){
				JOptionPane.showMessageDialog(null, "Por favor, selecione o tipo de médico.");
			}
			else if(date.equals("  /  /    ")){
				
				JOptionPane.showMessageDialog(null, "Por favor, entre com a data");
			}
			else{	
			addToList(name, date, medic, false);
			//addPaciente();
			//addListaDePacientes(patientsList);
			
			//TableImplementation teste = new TableImplementation(patientsList);
			//teste.teste();
			
					
			JOptionPane.showMessageDialog(null, "Consulta agendada com sucesso.");
			
			
			
			
			clearFields();
			}
			teste();
			
			}
			
			
			if(event.getSource() == testButton){
			//JOptionPane.showMessageDialog(null, "O botão testButton foi clicado");
			clearFields();
			}
			
			
		}
	
	public void clearFields(){
		medList.setSelectedIndex(0);
		
        try {
            MaskFormatter dateMask = new MaskFormatter("##/##/####");
            dateMask.install(dateReceive);
        } catch (ParseException ex) {
            Logger.getLogger(MaskFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
		
		
		nameReceive.setText(null);
		
		
		
	}
	
	public void addToList(String name, String date, String medic, boolean state){
		
		
		if(patientsList == null){
			System.out.println("PatiensList null em addToList");
		}
		
		
		
		
		if(deSerialize.getList() == null){
			patientsList = new ArrayList<Person>();
		
			//tableModel.addPaciente(new Person(name, date, medic, false));
			patientsList.add(new Person(name, date, medic, false));
			
			
			//setPatientsList(patientsList);
			SerializeData serialize = new SerializeData(patientsList);
		}
			
		else{	
		patientsList = deSerialize.getList();
		Person paciente = new Person(name, date, medic, false);
		  if(patientsList == null)
			    System.out.println("array não está null");
		  int count =0;
		  
		  int i = 0;
		  
		  for(i = 0; i<patientsList.size(); i++){
			  if(patientsList.get(i).equals(paciente)){
				  JOptionPane.showMessageDialog(null, "Paciente já agendado. Tente outra data ou outro médico");
				  count++;
			  
		  }
		  
			  else if (patientsList.get(i).getConsultDate().equals(date) && patientsList.get(i).getMedType().equals(medic)){
				  JOptionPane.showMessageDialog(null, "Data já ocupada. Selecione outra data ou médico");
				  count++;
			  }
		  
			  
			  else
				  count = 0;
		  

		}
		  
		  if(count == 0){
			patientsList.add(paciente);
			//setPatientsList(patientsList);
			SerializeData serialize = new SerializeData(patientsList);	  
		  }
		}
	}
	
  public List<Person> returnList(){
	  
	  if(patientsList == null)
	    System.out.println("ReturnList array está null");
	  return patientsList;
  }
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Person> getPatientsList() {
		
		DeserializeData localDeserialize = new DeserializeData("PatientsData.ser");
		/*if(localDeserialize.getList() == null && patientsListOuter == null){
			createFirstPane();		
			
		}
		
		
		else*/ if(patientsListOuter == null){
			System.out.println("Tá Null o Array em getPatientsList FirstTab   ");
			
			setPatientsList(localDeserialize.getList());
			
		}
		
		return patientsListOuter;
	}	

}
