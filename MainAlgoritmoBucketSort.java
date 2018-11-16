package AlgoritmoDeOrdenacaoBucketSort;

public class MainAlgoritmoBucketSort {

	public static void main(String[] args) {
		Popula p = new Popula();
		//Variavel que define o numero de posicoes do vetor, que eu defini 10
		int numPosVetor = 10;

//////////////////////////////////////////////// Vetor com valor CRESCENTE ///////////////////////////////////////////////////////////////////////
		// Cria um vetor com X pisicoes
		int[] vetorCrescente   	= 	new int[numPosVetor];

		// Popula o vetor de com uma ordem aleatoria
		p.crescente(vetorCrescente);
		
		for (int i = 0; i <	 vetorCrescente.length; i++ ){
			if (i == 0){
				System.out.println("==========================================================\n");
				System.out.print("\n");
				System.out.print("Vetor CRESCENTE = ");
			}
			System.out.print(" [" + vetorCrescente[i] + "] ");
			
			if (i == vetorCrescente.length - 1){
				System.out.println("");
			}
		}
		
		//Criando variavel para utilizar a funcao do agoritmo de ordenacao
		BucketSort algoritmo = new BucketSort();
		
		//variavel que armazena o numero de interacoes do algoritmo SelectionSort
		int c = algoritmo.recebeVetor(vetorCrescente);
		
		for (int i = 0; i < vetorCrescente.length; i++ ){
			if (i == 0){
				System.out.print("Vetor final     = ");
			}
			System.out.print(" [" + vetorCrescente[i] + "] ");
			if (i == vetorCrescente.length - 1){
				System.out.print("\n");
				System.out.print("Numero de interacoes: ");
				System.out.println(c);
				System.out.println("\n");
				System.out.print("==========================================================");
				System.out.print("\n");
			}
		}
		
//////////////////////////////////////////////// Vetor com valor DECRESCENTE ///////////////////////////////////////////////////////////////////////
		// Cria um vetor com X pisicoes
		int[] vetorDecrescente   	= 	new int[numPosVetor];

		// Popula o vetor de com uma ordem aleatoria
		p.decrescente(vetorDecrescente);
		
		for (int i = 0; i < vetorDecrescente.length; i++ ){
			if (i == 0){
				System.out.println("\n");
				System.out.print("Vetor DECRESCENTE = ");
			}
			System.out.print(" [" + vetorDecrescente[i] + "] ");
			
			if (i == vetorDecrescente.length - 1){
				System.out.println("");
			}
		}
		
		
		//variavel que armazena o numero de interacoes do algoritmo SelectionSort
		int d = algoritmo.recebeVetor(vetorDecrescente);
		
		for (int i = 0; i < vetorDecrescente.length; i++ ){
			if (i == 0){
				System.out.print("Vetor final       = ");
			}
			System.out.print(" [" + vetorDecrescente[i] + "] ");
			if (i == vetorDecrescente.length - 1){
				System.out.print("\n");
				System.out.print("Numero de interacoes: ");
				System.out.println(d);
				System.out.println("\n");
				System.out.print("==========================================================");
				System.out.print("\n");
			}
		}
		
////////////////////////////////////////////////Vetor com valor ALEATORIO ///////////////////////////////////////////////////////////////////////
		
		// Cria um vetor com X pisicoes
		int[] vetorAleatorio = new int[numPosVetor];

		// Popula o vetor de com uma ordem aleatoria
		p.aleatorio(vetorAleatorio);

		for (int i = 0; i < vetorAleatorio.length; i++) {
			if (i == 0) {
				System.out.println("\n");
				System.out.print("Vetor ALEATORIO = ");
			}
			System.out.print(" [" + vetorAleatorio[i] + "] ");

			if (i == vetorAleatorio.length - 1) {
				System.out.println("");
			}
		}

		// variavel que armazena o numero de interacoes do algoritmo
		// SelectionSort
		int e = algoritmo.recebeVetor(vetorAleatorio);

		for (int i = 0; i < vetorAleatorio.length; i++) {
			if (i == 0) {
				System.out.print("Vetor final     = ");
			}
			System.out.print(" [" + vetorAleatorio[i] + "] ");
			if (i == vetorAleatorio.length - 1) {
				System.out.print("\n");
				System.out.print("Numero de interacoes: ");
				System.out.println(e);
			}
		}
	}
}
