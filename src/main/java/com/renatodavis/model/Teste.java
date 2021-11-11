package com.renatodavis.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.renatodavis.controller.PessoaDAO;

public class Teste {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String[] args) {
	
		// FIND
		//Pessoa pessoa = entityManager.find(Pessoa.class, 1);
		
		Pessoa p = new Pessoa();
		
		p.setId(0);
		p.setNome("renata");
		
		PessoaDAO pd = new PessoaDAO();
		pd.salvar(p);
		
		//entityManager.getTransaction().begin();
		//entityManager.persist(cliente);
		//entityManager.getTransaction().commit();
		//System.out.println("Nome do cliente:" + pessoa.getNome());
		// DELETE
//		Cliente cliente = entityManager.find(Cliente.class, 2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(cliente);
//		entityManager.getTransaction().commit();
		
		// MODIFY
//		Cliente cliente = new Cliente();
//		cliente.setId(1);
//		cliente.setNome("FACEBOOK INC.");
		
//		entityManager.getTransaction().begin();
//		entityManager.merge(cliente);
//		entityManager.getTransaction().commit();

		//entityManager.close();
		//entityManagerFactory.close();
		
	}
	
}
