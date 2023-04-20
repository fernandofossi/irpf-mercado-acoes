package com.fossi.irpf.mercado.acoes.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Negociacao {

	private LocalDate data;
	private TipoMovimentacao tipo;
	private String papel;
	private int quantidade;
	private BigDecimal preco;
	private BigDecimal valor;
	
}
