package com.gustavo.FormCategoria;

import java.awt.EventQueue;

import com.gustavo.DAO.CategoriaDAO;
import com.gustavo.models.Categoria;
import com.gustavo.tableModel.CategoriaTableModel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class FormCategoriaView extends JFrame {

	private JPanel contentPane;
	private JTable jTCategoria;
	public int comboIndex;
	JComboBox comboBox = new JComboBox();	
	private JTextField textField;
		
	public void setUpTableData() {
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCategoriaView frame = new FormCategoriaView();
					frame.setVisible(true);
					//frame.categoriaTable.getRowCount();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormCategoriaView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 888, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 84, 852, 301);
		contentPane.add(scrollPane);
		
		jTCategoria = new JTable();
		scrollPane.setViewportView(jTCategoria);
		
		textField = new JTextField();
		textField.setBounds(85, 30, 567, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//ComboBox alterado pela interface gráfica
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Nome", "Todos"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(10, 30, 65, 29);
		comboBox.getSelectedIndex();
		contentPane.add(comboBox);
		
		/*Botão pesquisar com switch case, no caso 0 (ID) instancia categoriaTable do tipo categoriaTableModel
		* setando o valor do contrutor nesta variavel e depois chama o setModel com a variável instanciada;
		* Caso 1 e 2 são outros construtores; 
		*/
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CategoriaDAO categoriaDao = new CategoriaDAO();
				//
				int valor = comboBox.getSelectedIndex(); 
				switch (valor) {
				case 0:
					CategoriaTableModel categoriaTable = new CategoriaTableModel(Integer.parseInt(textField.getText()));
					//categoriaTable.CategoriaTableModel(Integer.parseInt(textField.getText())); 
					jTCategoria.setModel(categoriaTable);
				break;	

				case 1:
					//categoriaDao.consultarById(WIDTH, null)
					break;
				case 2:
					CategoriaTableModel categoriaTable2 = new CategoriaTableModel();
					jTCategoria.setModel(categoriaTable2);
				
				}
			}
		});
		btnNewButton.setBounds(662, 30, 200, 29);
		contentPane.add(btnNewButton);
		//jTCategoria.repaint();
	}
}
