package br.com.softplan.collections.example.iterator;

import java.util.Arrays;
import java.util.Iterator;

import br.com.softplan.collections.example.Example;

/**
 * @author Jonas de Liz Santos Morais
 */
public class ExampleIterator implements Example {

	@Override
	public void como_era_antes() {
		Iterator<String> iterator = Arrays.asList("A", "B", "C").iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Override
	public void como_ficou_no_java_8() {
		Iterator<String> iterator = Arrays.asList("A", "B", "C").iterator();

		iterator.forEachRemaining(System.out::println);
	}

	public static void main(String[] args) {
		new ExampleIterator().imprimir();
	}

}
