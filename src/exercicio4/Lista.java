package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// m�todo para inserir um elemento na lista.
	// a inser��o deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {

		No aux = new No(dado);
		No TiaDaAux = inicio;

		if (inicio == null){
			inicio = aux;
			fim = aux;
		} if (aux.dado <= inicio.dado) {
			inicio.esq = aux;
			aux.dir = inicio;
			inicio = aux;
		} if (aux.dado >= fim.dado ) {
			fim.dir = aux;
			aux.esq = fim;
			fim = aux;
		} else {
			while (TiaDaAux != null) {
				if (aux.dado > TiaDaAux.dado && aux.dado <= TiaDaAux.dir.dado) {
					aux.dir = TiaDaAux.dir;
					aux.esq = TiaDaAux;
					TiaDaAux.dir = aux;
					aux.dir.esq = aux;
					break;
				}
				TiaDaAux = TiaDaAux.dir;
			}
		}
	}
	// m�todo para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
