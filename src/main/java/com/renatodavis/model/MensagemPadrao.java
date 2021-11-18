package com.renatodavis.model;

public enum MensagemPadrao {

	MENSAGEM_SALVAR ("Salvo com sucesso!"),
	MENSAGEM_EXCLUIR (""),
	MENSAGEM_ALTERAR ("");
	
	private String descricao;
	
	MensagemPadrao (String descricao) {
		this.descricao = descricao;
	}
	
	
}

