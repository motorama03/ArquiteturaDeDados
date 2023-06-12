package metodosOrdenação;

public class ListaEncadeada {
	
	private Nodo inicio;
	
	// Construtor
	public ListaEncadeada() {
		inicio = null;
	}
	
	public boolean estaVazia() {
		return inicio == null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserirOrdenado(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if(estaVazia()) {
			inicio = novoNodo;
			return;
		}
		if(dado < inicio.getDado()) {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			return;
		}
		
		Nodo atual = inicio;
		Nodo anterior = null;
		
		while(atual!=null && dado > atual.getDado()) {
			anterior = atual;
			atual = atual.getProx();
		}
		novoNodo.setProx(atual);
		anterior.setProx(novoNodo);
	}
	
	
	
	
	
}
