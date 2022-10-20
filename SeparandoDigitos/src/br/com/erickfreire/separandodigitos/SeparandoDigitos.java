package br.com.erickfreire.separandodigitos;

import java.util.Scanner;

public class SeparandoDigitos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Programa que separa um valor com cinco digitos: ");
		System.out.print("Digite um valor: ");
		numero = entrada.nextInt();
		
		if(numero < 10000)
			System.out.println("Número Muito Pequeno!");
		
		if(numero > 99999)
			System.out.println("Número muito grande!");
		
		if(numero > 9999)
		{
			if(numero < 100000) {
				System.out.print(numero/10000);
				System.out.print(" " + ((numero%10000) / 1000));
				System.out.print(" " + ((numero%1000) / 100));
				System.out.print(" " + ((numero%100) / 10));
				System.out.print(" " + ((numero%10) / 1));
			}
		}
				

	}

}
