package lista2;

import java.util.Scanner;

public class exercicio4 { 
	 	public static void main(String[] args) {
			 Scanner leia = new Scanner(System.in);
			 int numero;
			 double resultado; 
			 
			 System.out.println("Digite um n�mero: ");
			 numero = leia.nextInt();
			 
			 if (numero%2==0) {
				 
				 resultado = Math.sqrt(numero);
				 System.out.println("N�mero digitado � par e sua ra�z quadrada �: "+resultado);
			 } else {
				 resultado = numero * numero; 
				 System.out.println("N�mero digitado � impar, elevado ao quadrado �: "+resultado);
			 }
			
		}

}
