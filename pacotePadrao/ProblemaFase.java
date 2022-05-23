package pacotePadrao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ProblemaFase{

    public static void main(String[] args) {
        int competidores = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de competidores"));
        int classificados = Integer.parseInt(JOptionPane.showInputDialog("Qual o mínimo de classificados?"));

        System.out.println("Exemplo de entrada");
        System.out.println(competidores);
        System.out.println(classificados);

        if(competidores <= classificados) {
            System.out.println("Classificados tem que ser menor que o número de competidores");
            return;
        }
        int vetor[] = new int[competidores];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10) ;
            System.out.println("O competidor " + i + "recebeu a nota: " + vetor[i]);
        }

        System.out.println();
        System.out.println("Exemplo de saída");

        Arrays.sort(vetor);

        //Se quiser descomentar está parte para ficar mais fácil na hora de ver se a resposta está certa
        /*for (int i = 0; i < vetor.length; i++) {
            System.out.println("O competidor " + i + "recebeu a nota: " + vetor[i]);
        }*/

        while((competidores -classificados) -1 >= 0){
            if(vetor[(competidores -classificados)] == vetor[(competidores -classificados) -1]){
                classificados++;
            } else{
                break;
            }
        }
        System.out.println(classificados);
    }

}