/**
 * 
 */
package br;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */
public class ContaTerminal {

	/**
	 * 
	 */
	public ContaTerminal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numeroCc;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o nome completo do cliente: ");
		nomeCliente = sc.nextLine();
		System.out.println("Digite o número da Agência: ");
		agencia = sc.next();
		System.out.println("Digita o número da conta corrente: ");
		numeroCc = sc.nextInt();
		System.out.println("Digita o valor de deposito: ");
		saldo = sc.nextDouble();
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque\n", nomeCliente, agencia, numeroCc, saldo);
		
		sc.close();
	}

}
