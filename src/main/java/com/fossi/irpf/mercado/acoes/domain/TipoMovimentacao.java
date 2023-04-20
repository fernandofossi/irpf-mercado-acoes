package com.fossi.irpf.mercado.acoes.domain;

import lombok.Getter;

public enum TipoMovimentacao {

	COMPRA("Compra"),
	VENDA("Venda");
	
	private TipoMovimentacao(String texto) {
		this.texto = texto;
	}
	
	@Getter
	private String texto;
	
}
