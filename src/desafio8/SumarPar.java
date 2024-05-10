package desafio8;

import java.util.Scanner;

public class SumarPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numero,sum=0;
		
		System.out.println("Ingrese nUMERORO DOEOFEO");
		numero = teclado.nextInt();
		
		for(int i= 0; i <= numero; i++) {
			
			
			if(i % 2 ==0) {
			sum +=i;
					
			
			}
			
		}
		System.out.println("El resutado de la suma de los numeros pares es : " + sum);
		
		
	}

}
