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
	public Integer remover() {
		if(estaVazio()) {
			return null;
		}
		int valor = inicio.getDado();
		inicio = inicio.getProx();
		tamanho--;
		if(estaVazio()) {
			fim = null;
		}
		return valor;
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
	
	public void separarNumertos(Fila F, Fila F_Pares, Fila F_Impares) {
		while(!F.estaVazio()) {
			int num = F.remover();
			if(num%2 == 0) {
				F_Pares.inserir(num);
			}else {
				F_Impares.inserir(num);
			}
		}
	}
	
}
