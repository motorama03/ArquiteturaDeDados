package listaLineares;

public class Nodo {
	private int dado;
	private Nodo prox;
	
	//construtor
	public Nodo(int dado) {
		this.dado = dado;
		this.prox = null;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}
}
