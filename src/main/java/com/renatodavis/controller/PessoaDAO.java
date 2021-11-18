package com.renatodavis.controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.renatodavis.model.IPessoa;
import com.renatodavis.model.Pessoa;
import java.awt.*;

public class PessoaDAO implements IPessoa {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void salvar(Pessoa pessoa, EntityManager entityManager) {
		
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(pessoa);
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

	public void incluir(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	public Pessoa consultar(int id) {
		Pessoa pessoa = entityManager.find(Pessoa.class, id);
		return pessoa;
	}

	public void alterar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}
}