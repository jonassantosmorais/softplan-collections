package br.com.softplan.collections.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.softplan.collections.example.Example;

/**
 * @author Jonas de Liz Santos Morais
 */
public class ExamplesList implements Example {

	@Override
	public void como_era_antes() {
		List<String> lista = criarLista();
		
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		System.out.println(lista);
	}

	@Override
	public void como_ficou_no_java_8() {
		List<String> lista = criarLista();
		
		lista.sort( String::compareTo );
		
		System.out.println(lista);
	}
	
	private List<String> criarLista() {
		List<String> lista = new ArrayList<String>();
		lista.add("Joaquim");
		lista.add("Sergio");
		lista.add("Jonas");
		lista.add("Ana");
		return lista;
	}
	
	public static void main(String[] args) {
		new ExamplesList().imprimir();
	}

}
