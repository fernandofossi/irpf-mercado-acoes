package com.fossi.irpf.mercado.acoes.command;

import picocli.CommandLine.Option;

public abstract class AbstractSpringCommand implements Runnable {

	@Option(names = "--spring.output.ansi.enabled")
	private String springOption;
	
}
