package exercicio2;

public class Fila {

	No inicio, fim;
	
	// m�todo para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No VoDaAux = new No(motorista);
		
		if(inicio == null) {
			inicio = VoDaAux;
		} else {
			VoDaAux.esq = fim;
			fim.dir = VoDaAux;
		}
		fim = VoDaAux;
	}
	
	// m�todo para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		if(inicio == null) {
			System.out.println("Não há nem um motorista para ser removido");
		} else {
			inicio.esq = null;
			inicio = inicio.dir;
		}
	}
	
	// m�todo para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		No PaiDaAux = inicio;
		
		if(inicio == null) {
			System.out.println("Não há nem um motorista para ser removido");
		} else {
		while (PaiDaAux != null) {
			System.out.println("Nome: " + PaiDaAux.motorista.getNome() + ", Placa: " + PaiDaAux.motorista.getPlaca() + "\n --------------");
			PaiDaAux = PaiDaAux.dir;
			}
		}
	}
}
