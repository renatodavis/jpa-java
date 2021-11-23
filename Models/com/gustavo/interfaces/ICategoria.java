package com.gustavo.interfaces;

import java.util.List;

import javax.persistence.EntityManager;

import com.gustavo.models.Categoria;

public interface ICategoria {

	void salvar(Categoria categoria, EntityManager entityManager);
	
	void excluir(int id);
	
	void incluir(Categoria categoria);
	
	Categoria consultar(int id);
	
	void alterar(Categoria categoria);
	
	List<Categoria> consultarTodos(EntityManager entityManager);
}