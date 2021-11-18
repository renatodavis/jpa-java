package com.renatodavis.model;

import javax.persistence.EntityManager;

public interface IPessoa {

	void salvar(Pessoa pessoa, EntityManager entityManager);
	
	void excluir(int id);
	
	void incluir(Pessoa pessoa);
	
	Pessoa consultar(int id);
	
	void alterar(Pessoa pessoa);
}
