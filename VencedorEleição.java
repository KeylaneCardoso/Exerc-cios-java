/*
Sabendo-se que para uma eleição estão concorrendo 3 candidatos, elabore um programa que receba
o nome dos candidatos e os votos obtidos, informe o nome do candidato vencedor.
Obs.: Considerar que não houve quantidade de votos empatada.
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escreva o nome do canditado 1: ");
        String candidato1 = teclado.next();
        System.out.println("Digite a quantidade de votos obtidos pelo candidato 1: ");
        int votosCandidato1 = teclado.nextInt();
        System.out.println("Escreva o nome do canditado 2: ");
        String candidato2 = teclado.next();
        System.out.println("Digite a quantidade de votos obtidos pelo candidato 2: ");
        int votosCandidato2 = teclado.nextInt();
        System.out.println("Escreva o nome do canditado 3: ");
        String candidato3 = teclado.next();
        System.out.println("Digite a quantidade de votos obtidos pelo candidato 3: ");
        int votosCandidato3 = teclado.nextInt();
        
        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3){
            System.out.println("O candidato vencedor é "+ candidato1);
        }   else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3){
                    System.out.println("O candidato vencedor é "+ candidato2);
            }       else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2){
                            System.out.println("O candidato vencedor é "+ candidato3);
                    }
        
	}
}