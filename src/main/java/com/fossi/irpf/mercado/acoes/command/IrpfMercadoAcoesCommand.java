package com.fossi.irpf.mercado.acoes.command;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "irpf-mercado-acoes")
public class IrpfMercadoAcoesCommand extends AbstractSpringCommand {

	@Option(names = { "-f", "--file" }, required = true)
	private Collection<String> files;

	@Override
	public void run() {
		files.stream().forEach(filename -> {
			String line;
			try (BufferedReader reader = new BufferedReader(new FileReader(filename, Charset.forName("iso-8859-1")))) {
				
				line = reader.readLine();
				System.out.println(line);
				
				line = reader.readLine();
				System.out.println(line);

			} catch (IOException ex) {

			}
		});
	}

}
