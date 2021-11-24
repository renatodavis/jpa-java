package com.gustavo.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.gustavo.interfaces.ICategoria;
import com.gustavo.models.*;

	public class CategoriaDAO implements ICategoria {
		
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

		// Método consultar id, do tipo Categoria, cria variável para fazer o find;
		public Categoria consultarById(int id, EntityManager entityManager) {
			Categoria categoria = entityManager.find(Categoria.class, id);
			
			return categoria;
		}

		/* Método consultar Id + o resto; faz uma variável que recebe o list categoria do tipo arrayList,
		*  instancia uma variável do tipo categoria e faz o find(redundante, pois já existe um método fazendo isso)
		*  depois adiciona o categoria(variável com apenas id) no categorias (variável setado com o List<Categorias>());
		*/
		public List<Categoria> consultarByIdList(int id, EntityManager entityManager) {
			List<Categoria> categorias = new ArrayList<Categoria>();
			Categoria categoria = new Categoria();
			categoria = entityManager.find(Categoria.class, id); 
			//entityManager.find(Categoria.class, id);
			categorias.add(categoria);
			return categorias;
		}

		public void alterar(Categoria categoria) {
			// TODO Auto-generated method stub
			
		}

		public List<Categoria> consultarTodos(EntityManager entityManager) {
		TypedQuery<Categoria> consulta = entityManager.createQuery("SELECT cat FROM Categoria cat",Categoria.class);
		List<Categoria> categorias = consulta.getResultList();
		    return categorias;
		}
}