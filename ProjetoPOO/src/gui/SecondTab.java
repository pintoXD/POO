package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import sourceCodes.*;
import tables.MyTableModel;
import tables.TableImplementation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class SecondTab extends MyTableModel implements ActionListener{
	
	private JButton saveButton, clearButton;
	private String tabTitle = "Schedulling";
	private int extraWindowWidth = 100;
	private JTabbedPane tabbedPane;
	private JComboBox optionList;
	private JTextField searchField;
	private List<Person> tablePatientsList;
	private JPanel screenMedTab = new JPanel(new BorderLayout());
	TableImplementation exemplo = new TableImplementation();
	
	public JPanel createSecondPane(/*List<Person>tablePatientsList*/){
		
		if(tablePatientsList == null)
			tablePatientsList = new ArrayList<Person>();

		
			
		
		/*screenMedTab = new JPanel(new BorderLayout())/*{
				//Make one test to see if it is really needed
	            public Dimension getPreferredSize() {
	                Dimension size = super.getPreferredSize();
	                size.width += extraWindowWidth;
	                return size;
	            }*/;
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		
	//	exemplo = new TableImplementation(/*tablePatientsList*/);
		
		JLabel searchLabel = new JLabel("Pesquisar");
		searchField = new JTextField(50);
		
		saveButton = new JButton("Salvar");	
		clearButton = new JButton("Cancelar");
		  
		String options[] = {"<Selecione>","Excluir", "Alterar"};	
		optionList = new JComboBox(options);
		optionList.setSelectedIndex(0);
		
		
		SecondTab teste = new SecondTab();
		ButtonHandler handler = teste.new ButtonHandler(saveButton, clearButton, optionList, searchField);
		
		optionList.addActionListener(handler);
		saveButton.addActionListener(handler);
		clearButton.addActionListener(handler);
		
	
		
		
		
		buttonPanel.add(saveButton);
		buttonPanel.add(clearButton);
		
		
		
		JPanel listAndSearch = new JPanel(new FlowLayout());
		
		listAndSearch.add(optionList);
		listAndSearch.add(searchLabel);
		listAndSearch.add(searchField);
		
		
		this.screenMedTab.add(listAndSearch, BorderLayout.NORTH);
		this.screenMedTab.add(exemplo, BorderLayout.CENTER);
		this.screenMedTab.add(buttonPanel, BorderLayout.SOUTH);
		
		
	
		
		//tabbedPane.addTab(tabOneTitle, screenMedTab);
		

		
		return screenMedTab;
		
		
	}
	
	
	public String getTabTitle(){
		
		return tabTitle;
		
	}


	
	public class ButtonHandler implements ActionListener
	{
		 private JButton saveButton, clearButton;
		 private JComboBox optionList;
		 //private JTextField nameReceive;
		 private JTextField searchField;
		 private List <Person> patientsList;
		 private DeserializeData deSerialize = new DeserializeData("PatientsData.ser");
		 
		public ButtonHandler(JButton saveButton, JButton clearButton, JComboBox optionList, JTextField searchField) {
	
			// TODO Auto-generated constructor stub
		
			this.saveButton = saveButton;
			this.clearButton = clearButton;
			this.optionList = optionList;
			this.searchField = searchField;
		
		
		}
		 
		 
		
		
		//TRATA EVENTO DO BOTÃO
		//É aqui que fica os eventos pra engatilhar a comparaçãoe gravaçãode dados pro agendamento
		public void actionPerformed(ActionEvent event)
		{
			//JOptionPane.showMessageDialog(FirstTab.this, String.format("Você pressionou: %s", event.getActionCommand()));
			
			if(event.getSource() == optionList){
				if(optionList.getSelectedItem().toString().equals("Excluir")){
					System.out.println();
					
					setPermissionVerifier(0);
					setLastColumn(1);
					
					screenMedTab.remove(exemplo);
					
					screenMedTab.add(exemplo);
					
					
					
				}
				
				if(optionList.getSelectedItem().toString().equals("Alterar")){
					setPermissionVerifier(1);
									
				}
				
			
				
				
			}
			
			
			
			
			
			
			if(event.getSource() == saveButton){
			//JOptionPane.showMessageDialog(null, "O botão medButton foi clicado");
			
			String option = optionList.getSelectedItem().toString();
			String search = searchField.getText().toString();
			
			setPermissionVerifier(0);
			
			
			JOptionPane.showMessageDialog(null, "Consulta agendada com sucesso.");
			
			//clearFields();
			
			}
			
			
			if(event.getSource() == clearButton){
			//JOptionPane.showMessageDialog(null, "O botão testButton foi clicado");
			//clearFields();
			}
			
			
		}
	/*
	public void clearFields(){
		optionList.setSelectedIndex(0);
		nameReceive.setText(null);
		dateReceive.setText(null);
		
		
	}
	*/
	public void addToFile(){
		
		/*if(deSerialize.getList() == null){
			patientsList = new ArrayList<Person>();
		
			patientsList.add(new Person(name, date, medic, false));
			
			SerializeData serialize = new SerializeData());
		}
			
		else{	*/
		
		
		//patientsList = deSerialize.getList();
		
		//patientsList.add(new Person(name, date, medic, false));
		
		SerializeData serialize = new SerializeData(getLinhasPatientsList());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
