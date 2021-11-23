package com.gustavo.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.gustavo.interfaces.ICategoria;
import com.gustavo.models.*;
import java.util.ArrayList;

	public class CategoriaDAO implements ICategoria {
		
		//private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
		//private static EntityManager entityManager = entityManagerFactory.createEntityManager();

		public void salvar(Categoria categoria, EntityManager entityManager) {
			
			try {
				entityManager.getTransaction().begin();
				entityManager.persist(categoria);
			} catch (Exception e) {
				entityManager.getTransaction().rollback();
				// por mensagem "erro ao salvar + item"
			} finally {
				entityManager.getTransaction().commit();
				// por mensagem "salvo com sucesso!"
			}
		}
		
		public void excluir(int id) {
			// TODO Auto-generated method stub
			
		}

		public void incluir(Categoria categoria) {
			// TODO Auto-generated method stub
			
		}

		public Categoria consultar(int id) {
			//Categoria categoria = EntityManager
			return null;
		}

		public void alterar(Categoria categoria) {
			// TODO Auto-generated method stub
			
		}

		public List<Categoria> consultarTodos(EntityManager entityManager) {
			
			//Query query = entityManager.createQuery("");
		    return null;
		}
}