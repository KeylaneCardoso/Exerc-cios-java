//Ordenar alfabeticamente os nomes de três flores;
//Recomendação: Não utilizar estrutura de repetição;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escreva o nome da 1º flor: ");
		String flor1 = teclado.next();
		System.out.print("Escreva o nome da 2º flor: ");
		String flor2 = teclado.next();
		System.out.print("Escreva o nome da 3º flor: ");
		String flor3 = teclado.next();
		
		if(flor1.compareTo(flor2) < 0 && flor1.compareTo(flor3) < 0){
            if(flor2.compareTo(flor3) > 0){
                String temporaria = flor2;
                flor2 = flor3;
                flor3 = temporaria;
            }
		}
        
        if(flor2.compareTo(flor1) < 0 && flor2.compareTo(flor3) < 0){
            String temporaria = flor2;
            flor2 = flor1;
            flor1 = temporaria;
            if(flor2.compareTo(flor3) > 0){
                String temporaria2 = flor2;
                flor2 = flor3;
                flor3 = temporaria2;
            }
		}
		
		if(flor3.compareTo(flor1) < 0 && flor3.compareTo(flor2) < 0){
            String temporaria = flor3;
            flor3 = flor1;
            flor1 = temporaria;
            if(flor2.compareTo(flor3) > 0){
                String temporaria2 = flor2;
                flor2 = flor3;
                flor3 = temporaria2;
            }
		}
        
		System.out.printf("A ordem das flores é: %s, %s e %s." , flor1, flor2, flor3);
	}
}