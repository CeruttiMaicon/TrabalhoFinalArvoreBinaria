package AlgoritmoDeOrdenacaoBucketSort;

import java.io.FileWriter;
import java.io.IOException;

public class MainCSVBucketSort {

    public static void main(String[] args) {

        // Fila com os valores Crescentes
        try {
            Popula p = new Popula();
            // Aqui definimos o local de criacao do arquivo CSV, no meu Ubuntu coloquei esta
            // rota
            FileWriter writer = new FileWriter(
                    // "c:/Users/1144001268/Desktop/arrayInsertionSortAndBubbleSort2AndBubbleSortAndSelectionSortAndBucketSort.csv");
                    "//home/dev3/Área de Trabalho/array.csv");

            // Faz o cabecalho do arquivo CSV
            writer.append("InsertionSort-Cresc,");
            writer.append("InsertionSort-Decresc,");
            writer.append("InsertionSort-Aleatorio,");
            writer.append("BubbleSort2-Cresc,");
            writer.append("BubbleSort2-Decresc,");
            writer.append("BubbleSort2-Aleatorio,");
            writer.append("BubbleSort-Cresc,");
            writer.append("BubbleSort-Decresc,");
            writer.append("BubbleSort-Aleatorio,");
            writer.append("SelectionSort-Cresc,");
            writer.append("SelectionSort-Decresc,");
            writer.append("SelectionSort-Aleatorio,");
            writer.append("BucketSort-Cresc,");
            writer.append("BucketSort-Decresc,");
            writer.append("BucketSort-Aleatorio,");

            writer.append('\n');
            for (int n = 1; n <= 1000; n++) {
                int[] crescenteVar      = new int[n];
                int[] decrescenteVar    = new int[n];
                int[] aleatorioVar      = new int[n];

                // Adicionando os elementos na filaCrescentes
                p.crescente(crescenteVar);
                p.decrescente(decrescenteVar);
                p.aleatorio(aleatorioVar);

                InsertionSort insertion1    = new InsertionSort();
                InsertionSort insertion2    = new InsertionSort();
                InsertionSort insertion3    = new InsertionSort();

                BubbleSort2 bubblesort21    = new BubbleSort2();
                BubbleSort2 bubblesort22    = new BubbleSort2();
                BubbleSort2 bubblesort23    = new BubbleSort2();

                BubbleSort bubblesort1      = new BubbleSort();
                BubbleSort bubblesort2      = new BubbleSort();
                BubbleSort bubblesort3      = new BubbleSort();

                SelectionSort selection1    = new SelectionSort();
                SelectionSort selection2    = new SelectionSort();
                SelectionSort selection3    = new SelectionSort();
                
                BucketSort bucket1    		= new BucketSort();
                BucketSort bucket2    		= new BucketSort();
                BucketSort bucket3    		= new BucketSort();

                // Escreve no arquivo CSV
                writer.append(insertion1.recebeVetor  (crescenteVar)   + ",");
                writer.append(insertion2.recebeVetor  (decrescenteVar) + ",");
                writer.append(insertion3.recebeVetor  (aleatorioVar)   + ",");
                writer.append(bubblesort21.recebeVetor(crescenteVar)   + ",");
                writer.append(bubblesort22.recebeVetor(decrescenteVar) + ",");
                writer.append(bubblesort23.recebeVetor(aleatorioVar)   + ",");
                writer.append(bubblesort1.recebeVetor (crescenteVar)   + ",");
                writer.append(bubblesort2.recebeVetor (decrescenteVar) + ",");
                writer.append(bubblesort3.recebeVetor (aleatorioVar)   + ",");
                writer.append(selection1.recebeVetor  (crescenteVar)   + ",");
                writer.append(selection2.recebeVetor  (decrescenteVar) + ",");
                writer.append(selection3.recebeVetor  (aleatorioVar)   + ",");
                writer.append(bucket1.recebeVetor  	  (crescenteVar)   + ",");
                writer.append(bucket2.recebeVetor     (decrescenteVar) + ",");
                writer.append(bucket3.recebeVetor     (aleatorioVar)   + ",");
                writer.append('\n');

                // Criando CSV com o array
                // 99 para pegar o array cheio
                if (n == 1000) {

                    writer.flush();
                    writer.close();
                    System.out.println("Arquivo CSV criado com Sucesso!");
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}