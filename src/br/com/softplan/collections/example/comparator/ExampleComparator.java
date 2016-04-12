package br.com.softplan.collections.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.softplan.collections.example.Example;

/**
 * @author Jonas de Liz Santos Morais
 */
public class ExampleComparator implements Example {

	class Aluno {
		Integer nota;

		public Aluno(Integer nota) {
			this.nota = nota;
		}

		public Integer getNota() {
			return nota;
		}

		public void setNota(Integer nota) {
			this.nota = nota;
		}
	}

	@Override
	public void como_era_antes() {
		List<Aluno> alunos = criarLista();

		Collections.sort(alunos, new Comparator<Aluno>() {

			@Override
			public int compare(Aluno o1, Aluno o2) {
				return o1.getNota().compareTo(o2.getNota());
			}
		});

		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNota());
		}
	}

	@Override
	public void como_ficou_no_java_8() {
		List<Aluno> alunos = criarLista();

		alunos.sort(Comparator.comparingInt(Aluno::getNota));
		alunos.forEach(a -> System.out.println(a.getNota()));
	}

	private List<Aluno> criarLista() {
		List<Aluno> alunos = new ArrayList<>();

		alunos.add(new Aluno(Integer.valueOf(8)));
		alunos.add(new Aluno(Integer.valueOf(2)));
		alunos.add(new Aluno(Integer.valueOf(4)));
		alunos.add(new Aluno(Integer.valueOf(5)));
		alunos.add(new Aluno(Integer.valueOf(10)));

		return alunos;
	}

	public static void main(String[] args) {
		new ExampleComparator().imprimir();
	}

}
