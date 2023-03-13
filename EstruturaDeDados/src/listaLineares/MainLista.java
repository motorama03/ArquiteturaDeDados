package listaLineares;

public class MainLista {

	public static void main(String[] args) {
		
		ListaCircular lista1 = new ListaCircular();
		
		lista1.inserirInicio(8);
		lista1.inserirInicio(6);
		lista1.inserirInicio(5);
		System.out.println(lista1.mostrarLista());
		System.out.println("A quantidade de Nodos: "+lista1.contaNodos());
		
		lista1.inserirFinal(2);
		System.out.println(lista1.mostrarLista());
		
		
//		lista1.deletaComValor(6);
//		System.out.println(lista1.mostrarLista());
//		
//		lista1.inserirFinal(9);
//		lista1.mostrarLista();
	}

}
