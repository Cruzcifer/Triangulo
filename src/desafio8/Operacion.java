package desafio8;

import java.util.Scanner;

public class Operacion {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		int i =0;
		
		
		String letra;
		int sum=0,res=0,mul=0;
		double di=0;
			
			
		
			
			do {
			System.out.println("presionar la primera letra  de cada operacion1:");
			
			System.out.println("(S)umar");
			System.out.println("(R)esta");
			System.out.println("(M)ultiplicacin");
			System.out.println("(D)ividir");
			System.out.println("(E)xit");
			
			letra = teclado.nextLine();
			if(letra.equals("s")) {
				 sum=sumar(2,6);
				 System.out.println("la suma es "+ sum);
			}
			
			else if(letra.equals("r")) {
				res = restar(2,6);
				System.out.println("la resta es "+ res);
			}
			
			else if(letra.equals("m")) {
				 mul = multiplicar(2,6);
				 System.out.println("la multiplicacion es "+ mul);
			}
			
			else if(letra.equals("d")) {
				 di = div(2,0);
				 
				 String numeroFormateado = String.format("%.2f", di);
				System.out.println(numeroFormateado);
			}
			

			else if(letra.equals("e")) {
				break;
			}
			
			
			}while(!letra.equalsIgnoreCase("e"));	
			
			System.out.println("esto se acabo");
			
			}
			
			
			static int sumar(int num1, int num2) {
				
						return( num1 + num2);
										
				}
			static int restar(int num1, int num2) {
				
				return( num1 - num2);
								
		}
			static int multiplicar (int num1, int num2) {
				
				return( num1 * num2);
								
		}
			static double div(double num1, double num2) {
				
				if(num2 != 0) {
					return( num1 / num2);
				}else {
					System.out.println("no se puede dividir por 0");
					return 0;
				}
				
								
		}
			
	}


