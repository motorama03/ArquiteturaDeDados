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
//		Fila f1 = new Fila(5);
//		f1.inserir(5);
//		f1.inserir(7);
//		f1.inserir(1);
//		f1.inserir(10);
//		
//		f1.remover();
//		f1.remover();
//		f1.remover();
//		f1.remover();
		
		Fila f2 = new Fila(5);
		f2.inserir(5);
		f2.inserir(3);
		f2.inserir(4);
		f2.inserir(6);
		System.out.println(f2.filtro(5, true));
		
		
		
	}

}
