package lista_duplamente_encadeada;

public class MainListaDup {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada l1 = new ListaDuplamenteEncadeada();
		l1.inserirFinal(5);
		l1.inserirFinal(7);
		l1.inserirFinal(3);
		l1.inserirFinal(8);
		
		System.out.println(l1.mostrarLista());
		
		l1.removeComValor(3);
		System.out.println(l1.mostrarLista());
		l1.removerFinal();
		System.out.println(l1.mostrarLista());
		
	}

}
