//Receber um texto com uma letra e mostrar se é: vogal, consoante e informar se não for uma letra;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner lerTeclado = new Scanner(System.in);
		
		final String VOGAL = "aeiou";
		final String CONSOANTE = "bcdfghjklmnpqrstvwxyz";
		int contador = 0;
		
		
		System.out.println("Digite uma letra: ");
		String texto = lerTeclado.next();
		texto = texto.substring(0,1);
		texto = texto.toLowerCase();
		
		
		for (int i = 0; i < VOGAL.length(); i++){
		    if (texto.equals(VOGAL.substring(i, i+1))){
		        System.out.print("Esta letra é uma vogal!");
		        contador = contador + 1;
		    }
		}
	       
	    for (int i = 0; i < CONSOANTE.length(); i++){
		    if (texto.equals(CONSOANTE.substring(i, i+1))){
		        System.out.print("Esta letra é uma consoante!");
		        contador = contador + 1;
		    }
		} 
	    
	    if (contador == 0){
                System.out.println("Não é uma letra.");
	    }
	    
	}
}
