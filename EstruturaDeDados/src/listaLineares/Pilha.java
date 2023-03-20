package listaLineares;

public class Pilha {
	private Nodo topo;
	private int tamanho = 0;
	private int limite = 0;
	
	//construtor
	public Pilha(int limite) {
		this.limite = limite;
	}
	public int getTopo() {
		return topo.getDado();
	}
	public boolean estaVazio() {
		return tamanho == 0;
	}
	public boolean temEspaco() {
		return limite > tamanho;
	}
	//inserir na pilha
	public void push(int dado) {
		if (temEspaco()) {
			Nodo novo = new Nodo(dado);
			novo.setProx(topo);
			topo = novo;
			tamanho++;
		}else {
			System.out.println("Pilha cheia");
		}
	}
	//Remover da pilha
	public void pop() {
		if(!estaVazio()) {
			System.out.println(topo.getDado()+" foi retirado da pilha!");
			topo = topo.getProx();
			tamanho--;
		}else {
			System.out.println("Pilha está vazia");
		}
	}
	
	
}
