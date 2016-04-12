package br.com.softplan.collections.example;

/**
 * 
 * @author Jonas de Liz Santos Morais
 *
 */
public interface Example {
	
	public default void imprimir(){
		System.out.println("Como era antes do java 8: ");
		System.out.println("########");
		como_era_antes();
		System.out.println("########\n");
		System.out.println("Como ficou no java 8: ");
		System.out.println("########");
		como_ficou_no_java_8();
		System.out.println("########");
	}

	void como_era_antes();
	
	void como_ficou_no_java_8();
	
}
