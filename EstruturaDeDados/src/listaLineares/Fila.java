package listaLineares;

interface Filtro {
	boolean isPar(int iNumero);
	boolean isImpar(int iNumero);
}

public class Fila implements Filtro {
	private Nodo inicio = null;
	private Nodo fim;
	private int limite = 0;
	private int tamanho = 0;
	
	public Fila(int limite) {
		this.limite = limite;
	}
	public boolean estaVazio() {
		return tamanho == 0;
	}
	public boolean temEspaco() {
		return limite > tamanho;
	}
	public int getInicio() {
		if (!estaVazio()) {
			return inicio.getDado();
		}else {
			System.out.println("Fila está vazia");
			return -1;
		}
	}
	public void inserir(int dado) {
		if(temEspaco()) {
			Nodo novo = new Nodo(dado);
			if(estaVazio()) {
				inicio = novo;
				fim = novo;
			}else {
				fim.setProx(novo);
				fim = novo;
			}
		tamanho++;
	}else
		System.out.println("Fila cheia");
	}	
	public void remover() {

		if(estaVazio()) {
			System.out.println("A fila esta vazia!");
			return;
		}
		
		System.out.println("Removido "+inicio.getDado()+" da fila");
		inicio = inicio.getProx();	
		if(tamanho == 1) {	
			inicio = null;
			fim = null;
		}
		
		tamanho--;
	}
	
	@Override
	public boolean isPar(int iNumero) {
		return (iNumero % 2) == 0;
	}
	
	@Override
	public boolean isImpar(int iNumero) {
		return (iNumero % 3) == 0;
	}
	
	public Fila filtro(int iNumero, boolean bPar) {
		Nodo oNodoAtual = inicio;
		
		Fila oFila = new Fila(limite);
		
		while(oNodoAtual != fim) {	
			
			if(bPar && isPar(iNumero)) {
				oFila.inserir(iNumero);
				System.out.println(iNumero);
			}
			else {
				oFila.inserir(iNumero);
			}
			
			oNodoAtual = oNodoAtual.getProx();
		}
		
		return oFila;
	}
	
}
