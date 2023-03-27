package listaLineares;

public class Main {

	public static void main(String[] args) {
		
//		ListaCircular lista1 = new ListaCircular();
//		
//		lista1.inserirInicio(8);
//		lista1.inserirInicio(6);
//		lista1.inserirInicio(5);
//		System.out.println(lista1.mostrarLista());
//		System.out.println("A quantidade de Nodos: "+lista1.contaNodos());
//		
//		lista1.inserirFinal(2);
//		System.out.println(lista1.mostrarLista());
//		
//		
//		lista1.deletaComValor(6);
//		System.out.println(lista1.mostrarLista());
//		
//		lista1.inserirFinal(9);
//		lista1.mostrarLista();
		
		//PILHA MAIN>>>
		
//	Pilha p1 = new Pilha(3);
//	p1.push(4);
//	p1.push(7);
//	p1.push(1);
//	p1.push(3);
//	System.out.println("Topo = "+p1.getTopo());
//	
//	p1.pop();
//	System.out.println("Topo = "+p1.getTopo());
		
		
		// Fila MAIN
//		
		Fila f1 = new Fila(5);
		f1.inserir(5);
		f1.inserir(7);
		f1.inserir(1);
		f1.inserir(10);
		
		System.out.println(f1.remover());
		System.out.println(f1.remover());
		System.out.println(f1.remover());
		System.out.println(f1.remover());
		
		
		System.out.println("---Segunda Fila---");
		Fila f2 = new Fila(5);
		f2.inserir(5);
		f2.inserir(3);
		f2.inserir(4);
		f2.inserir(6);
		System.out.println(f2.filtro(5, true));
		
		System.out.println();
		Fila F = new Fila(4);
		Fila F_Pares = new Fila(4);
		Fila F_Impares = new Fila(4);
		F.inserir(5);
		F.inserir(7);
		F.inserir(1);
		F.inserir(6);
		
		F.separarNumertos(F, F_Pares, F_Impares);
		System.out.println("---Valores Ímpares---");
		while(!F_Impares.estaVazio()) {
			System.out.println(F_Impares.remover());
		}
		
		System.out.println("---Valores pares---");
		while(!F_Pares.estaVazio()) {
			System.out.println(F_Pares.remover());
		}
		
	}

}
