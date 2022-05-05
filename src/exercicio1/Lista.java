package exercicio1;


public class Lista {
	No inicio, fim;
	
	// insere um nó no final da lista. Esse método será chamado pelo método inserir
	private void inserirFim(No aux) {
		if(inicio == null) {
			inicio = aux;
		} else {
			fim.prox = aux;
		}
		fim = aux;
	}
	
	//esse m�todo dever� ser implementado de acordo com o enunciado do exerc�cio
	private void inserirPrioridade(No aux) {
		
		No FilhaDaAux = inicio;
		No NetaDaAux = null;
		
		if(aux.cor.equalsIgnoreCase("amarelo")) {
			if(inicio == null) {
				inicio = aux;
				fim = aux;
			} else if (inicio.cor.equalsIgnoreCase("verde")) {
				aux.prox = inicio;
				inicio = aux;
			} else if (inicio.cor.equalsIgnoreCase("amarelo")) {
				inserirFim(aux);
			} else { 
				while (FilhaDaAux != null) {
					if (FilhaDaAux.cor.equals("verde")) {
						aux.prox = NetaDaAux.prox; 
						NetaDaAux.prox = aux;
						break;
					}
		
					NetaDaAux = FilhaDaAux;
					FilhaDaAux = FilhaDaAux.prox;
				}
			}	
		}
	}
	
	// m�todo inserir. Esse m�todo ser� chamado a partir da classe Main
	public void inserir(int numero, String cor) {
		No aux = new No(numero, cor);
		if(cor.equalsIgnoreCase("verde")) {
			inserirFim(aux);
		} else {
			inserirPrioridade(aux);
		}
	}
	
	// m�todo utilizado para imprimir os dados da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.numero);
			aux = aux.prox;
		}
	}
}
