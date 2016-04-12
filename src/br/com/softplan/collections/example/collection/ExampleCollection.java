package br.com.softplan.collections.example.collection;

import java.util.ArrayList;
import java.util.Collection;

import br.com.softplan.collections.example.Example;

/**
 * @author Jonas de Liz Santos Morais
 */
public class ExampleCollection implements Example {

	@Override
	public void como_era_antes() {
		Collection<String> collection = new ArrayList<String>();
		collection.add("Joaquim");
		collection.add("Sergio");
		collection.add("Jonas");
	}

	@Override
	public void como_ficou_no_java_8() {
		Collection<String> collection = new ArrayList<String>();
		collection.add("Joaquim");
		collection.add("Sergio");
		collection.add("Jonas");
		
		collection.removeIf(name -> name.contains("Jonas"));

		collection.forEach(System.out::println);
	}

	public static void main(String[] args) {
		new ExampleCollection().imprimir();
	}
}
