package com.fossi.irpf.mercado.acoes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fossi.irpf.mercado.acoes.command.IrpfMercadoAcoesCommand;

import picocli.CommandLine;

@SpringBootApplication
public class IrfpMercadoAcoesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(IrfpMercadoAcoesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CommandLine comando = new CommandLine(new IrpfMercadoAcoesCommand());
		comando.execute(args);
	}

}
