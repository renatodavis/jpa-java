package com.renatodavis.model;

public interface IPessoa {

	void salvar(Pessoa pessoa);
	
	void excluir(int id);
	
	void incluir(Pessoa pessoa);
	
	Pessoa consultar(int id);
	
	void alterar(Pessoa pessoa);
}
