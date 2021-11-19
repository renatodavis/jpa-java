package com.renatodavis.model;

import java.util.List;

import javax.persistence.EntityManager;

public interface ICategoria {

	void salvar(Categoria categoria, EntityManager entityManager);
	
	void excluir(int id);
	
	void incluir(Categoria categoria);
	
	Categoria consultar(int id);
	
	void alterar(Categoria categoria);
	
	List<Categoria> consultarTodos(EntityManager entityManager);
}