package br.com.softplan.collections.example.iterable;

import java.util.Arrays;
import java.util.List;

import br.com.softplan.collections.example.Example;

/**
 * @author Jonas de Liz Santos Morais
 */
public class ExampleIterable implements Example {

	@Override
	public void como_era_antes() {
		List<String> lista = Arrays.asList("Zacarias", "Amabile", "Joaquim");

		for (String nome : lista) {
			System.out.println(nome);
		}
	}

	@Override
	public void como_ficou_no_java_8() {
		List<String> lista = Arrays.asList("Zacarias", "Amabile", "Joaquim");

		lista.forEach(System.out::println);
	}


	public static void main(String[] args) {
		new ExampleIterable().imprimir();
	}
}
