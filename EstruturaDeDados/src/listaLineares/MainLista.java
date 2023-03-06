package listaLineares;

public class MainLista {

	public static void main(String[] args) {
		
		ListaEncadeada lista1 = new ListaEncadeada();
		
		lista1.inserirInicio(8);
		lista1.inserirInicio(6);
		lista1.inserirInicio(5);
		lista1.mostraLista();
		
		lista1.inserirInicio(2);
		lista1.mostraLista();
		
		lista1.deletaComValor(5);
		lista1.mostraLista();
		
		lista1.inserirFinal(9);
		lista1.mostraLista();
	}

}
