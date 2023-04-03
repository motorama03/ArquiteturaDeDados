package atividadeListaEncadeadas_eLineares;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.InserirFinal(5);
		lista.InserirFinal(4);
		lista.InserirFinal(6);
		lista.InserirFinal(5);
		lista.InserirFinal(9);
		lista.InserirFinal(3);
		
		lista.mostraTabela();
		System.out.println(lista.QuantidadeIgualNodoInf(5));
		
		
	}

}
