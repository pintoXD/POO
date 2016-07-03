package tables;

import sourceCodes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sourceCodes.*;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import java.awt.Dimension;
import java.awt.GridLayout;



public class MyTableModel extends AbstractTableModel {
    /* Lista de Sócios que representam as linhas. */
    private List<Person> linhas;

    /* Array de Strings com o nome das colunas. */
    private String[] colunas = new String[] {
            "Nome", "Data Da Consulta", "Médico", "Chk"};


    /* Cria um FuncionarioTableModel vazio. */
    public MyTableModel() {
        linhas = new ArrayList<Person>();
        Person teste = new Person();
        
        teste.setName("Nome");
        teste.setConsultDate("hoje");
        teste.setMedType("Oi");
        teste.setStatusConsult(false);
        Person teste2 = new Person();
        
        teste2.setName("Ué");
        teste2.setConsultDate("amanhã");
        teste2.setMedType("Talvez");
        teste2.setStatusConsult(true);
        
        linhas.add(teste);
        linhas.add(teste2);
        
        
    }

    /* Cria um FuncionarioTableModel carregado com
     * a lista de sócios especificada. */
    public MyTableModel(List<Person> listaDePacientes) {
        linhas = new ArrayList<Person>(listaDePacientes);
    }


    /* Retorna a quantidade de colunas. */
    @Override
    public int getColumnCount() {
        // Está retornando o tamanho do array "colunas".
        // Mas como o array é fixo, vai sempre retornar 4.
        return colunas.length;
    }

    /* Retorna a quantidade de linhas. */
    @Override
    public int getRowCount() {
        // Retorna o tamanho da lista de sócios.
        return linhas.size();
    }

    /* Retorna o nome da coluna no índice especificado.
     * Este método é usado pela JTable para saber o texto do cabeçalho. */
    @Override
    public String getColumnName(int columnIndex) {
        // Retorna o conteúdo do Array que possui o nome das colunas
        // no índice especificado.
        return colunas[columnIndex];
    };

   
  
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    
    
    
    
    
    
    /* Retorna a classe dos elementos da coluna especificada.
     * Este método é usado pela JTable na hora de definir o editor da célula. */
 /*   @Override
    public Class<?> getColumnClass(int columnIndex) {
        // Retorna a classe referente a coluna especificada.
        // Aqui é feito um switch para verificar qual é a coluna
        // e retornar o tipo adequado. As colunas são as mesmas
        // que foram especificadas no array "colunas".
        switch (columnIndex) {

        case 0: // Primeira coluna é o nome, que é uma String.
            return Long.class;
        case 1: // Segunda coluna é o telefone, que também é uma String..
            return String.class;
        default:
            // Se o índice da coluna não for válido, lança um
            // IndexOutOfBoundsException (Exceção de índice fora dos limites).
            // Não foi necessário verificar se o índice da linha é inválido,
            // pois o próprio ArrayList lança a exceção caso seja inválido.
                    MsgBox.INFORMATIVO("O índice informado não existe!");
                    return null;
        }
    }
*/
    /* Retorna o valor da célula especificada
     * pelos índices da linha e da coluna. */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio da linha especificada.       
        Person pessoa = linhas.get(rowIndex);

        // Retorna o campo referente a coluna especificada.
        // Aqui é feito um switch para verificar qual é a coluna
        // e retornar o campo adequado. As colunas são as mesmas
        // que foram especificadas no array "colunas".
        switch (columnIndex) {
        case 0: // Primeira coluna é o nome.
            return pessoa.getName();
        case 1: // Segunda coluna é o telefone.
            return pessoa.getConsultDate();
        case 2:
        	return pessoa.getMedType();
        case 3:
        	return pessoa.isStatusConsult();            
        default:
            // Se o índice da coluna não for válido, lança um
            // IndexOutOfBoundsException (Exceção de índice fora dos limites).
            // Não foi necessário verificar se o índice da linha é inválido,
            // pois o próprio ArrayList lança a exceção caso seja inválido.
        			JOptionPane.showMessageDialog(null, "Indice informado inválido");    
                    return null;
        }

    }

    /* Retorna um valor booleano que define se a célula em questão
     * pode ser editada ou não.
     * Este método é utilizado pela JTable na hora de definir o editor da célula.
     * Neste caso, estará sempre retornando false, não permitindo que nenhuma
     * célula seja editada. */
   
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 3)
        	return true;
        else
        	return false;
    }
    
    


    ////////////////////////////////////////////////////////////
    // Os métodos declarados até aqui foram as implementações //
    // de TableModel, que são continuamente utilizados        //
    // pela JTable para definir seu comportamento,            //
    // por isso o nome Table Model (Modelo da Tabela).        //
    //                                                        //
    // A partir de agora, os métodos criados serão            //
    // particulares desta classe. Eles serão úteis            //
    // em algumas situações.                                  //
    ////////////////////////////////////////////////////////////


    /* Retorna o sócio da linha especificada. */
    public Person getFuncionario(int indiceLinha) {
            if(indiceLinha < linhas.size()){
                return linhas.get(indiceLinha);
            }
        return null;
    }

    /* Adiciona um registro. */
    public void addPaciente(Person paciente) {
        // Adiciona o registro.
        linhas.add(paciente);

        // Pega a quantidade de registros e subtrai um para achar
        // o último índice. É preciso subtrair um, pois os índices
        // começam pelo zero.
        int ultimoIndice = getRowCount() - 1;

        // Reporta a mudança. O JTable recebe a notificação
        // e se redesenha permitindo que visualizemos a atualização.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /* Remove a linha especificada. */
    public void removePaciente(int indiceLinha) {
        // Remove o sócio da linha especificada.  
            if(indiceLinha < linhas.size()){
                linhas.remove(indiceLinha);

        // Reporta a mudança. O JTable recebe a notificação
        // e se redesenha permitindo que visualizemos a atualização.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
            }

    }

    /* Adiciona uma lista de sócios ao final dos registros. */
    public void addListaDePacientes(List<Person> funcs) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.
        linhas.addAll(funcs);

        // Reporta a mudança. O JTable recebe a notificação
        // e se redesenha permitindo que visualizemos a atualização.
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
    
    private boolean DEBUG = false;
    public void setValueAt(Object teste, int rowIndex, int columnIndex) {
    	
    	Person pessoa = linhas.get(rowIndex);
    	
    	
    	
    	
        switch (columnIndex) {
        case 0: // Primeira coluna é o nome.
            pessoa.setName(teste.toString());
            fireTableCellUpdated(rowIndex, columnIndex);
            linhas.set(rowIndex, pessoa);
            System.out.println("getName: "+pessoa.getName());
            break;
        case 1: // Segunda coluna é o telefone.
            pessoa.setConsultDate(teste.toString());
            fireTableCellUpdated(rowIndex, columnIndex);
            linhas.set(rowIndex, pessoa);
            System.out.println("getConsultDate: "+pessoa.getConsultDate());
            
            break;
        case 2:
        	pessoa.setMedType(teste);
        	linhas.set(rowIndex, pessoa);
        	System.out.println("getMedType: "+pessoa.getMedType());
        	fireTableCellUpdated(rowIndex, columnIndex);
        	break;
        case 3:
        	pessoa.setStatusConsult(((Boolean) teste).booleanValue()); 
        	linhas.set(rowIndex, pessoa);  
        	if(pessoa.isStatusConsult())
        		System.out.println("getMedType: True at Cell" +rowIndex);
        	else
        		System.out.println("getMedType: False ate Cell "+rowIndex);
        	break;
        	
        	
     
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }


    
    /* Remove todos os registros. */
  /*  public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Reporta a mudança. O JTable recebe a notificação
        // e se redesenha permitindo que visualizemos a atualização.
        fireTableDataChanged();
    }

    /* Verifica se este table model está vazio. */

    /*
    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public Object getObject(int index) {
        return linhas.get(index);
    }
*/
}
