package com.gustavo.tableModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.AbstractTableModel;

import com.gustavo.models.Categoria;
import com.gustavo.DAO.CategoriaDAO;

	public class CategoriaTableModel extends AbstractTableModel {

		private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
		private static EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		private List<Categoria> dados = new CategoriaDAO().consultarTodos(entityManager);
		private String[] colunas = {"ID", "Nome"};
		
		 public String getColumnName(int column) {
		    return colunas[column];

		}   
		public int getRowCount() {
			Categoria cat = entityManager.find(Categoria.class, 158);
			entityManager.persist(cat);
			return dados.size();
		}
		public int getColumnCount() {
			return colunas.length;
		}
		public Object getValueAt(int linha, int coluna) {
			
			switch (coluna) {
			case 0:
				dados.get(linha).getId();
				break;
			case 1:
				dados.get(linha).getNome();
				break;
			}
			return null;
		}
		
	public void addRow(Categoria dadosCategoria) {
		this.dados.add(dadosCategoria);
		this.fireTableDataChanged();
	}
		
	public void removeRow(int linha) {
		this.dados.remove(linha);
		this.fireTableRowsDeleted(linha, linha);
	}

}
