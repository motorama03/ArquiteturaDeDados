package listaLineares;

public class ListaEncadeada {
	
	private Nodo inicio;
	
	//construtor
	public ListaEncadeada() {
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	//public void deletarUltimo()
	// Desenvolver esta aplicação;
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if(inicio == null) {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
		}else inserirFinal(dado);
	}
	
	public void inserirFinal(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if(inicio == null)
			inserirInicio(dado);
		
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
	}
	
	public void pegarPenultimo(int dado) {
		Nodo aux = inicio;
		if(aux.getProx() == null) {
			return;
		}
		else {
			do {
				aux.setProx(aux);
			}while(aux.getProx().getProx() != null);
		}
		
	}
	
	public void mostraLista() {
		if (vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Nodo aux = inicio;
		while (aux != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProx();
		}
		System.out.println();
	}
	
	public void deletaComValor(int valor) {
		if(vazia())
			return;
		if(inicio.getDado() == valor) {
			inicio = inicio.getProx();
			return;
		}
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			if(aux.getProx().getDado() == valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}
	}
	
	// Desenvolver isso tbm pq o arromabado lucas fez merda                                     
	public int buscaValor(int valor) {
		if(vazia()) {
			return -1;
		}
		Nodo aux = inicio;
		int posicao = 0;
		while(aux != null) {
			posicao++;
		}return posicao;
		
	}
	
}
