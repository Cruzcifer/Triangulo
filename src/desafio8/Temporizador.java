package desafio8;
import java.util.*;
public class Temporizador {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			Scanner teclado = new Scanner(System.in);
			int numero;
			
			System.out.println("Ingrese numero");
			numero = teclado.nextInt();
			
			for(int i= numero; i >= 0; i--) {
				
				
				System.out.println(i);
				Thread.sleep(1000);
			}
			
	}

}
