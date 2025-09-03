/**
 * @author sheyl
 */
package br;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */
public class ContaTerminal {

	private static final String MENSAGEM_NUMERO_CONTA_CORRENTE_ERRO = "O numero da conta corrente deve ter somente numeros! Por favor revise!";
	private static final String MENSAGEM_SALDO_ERRO = "Atenção: o valor informado no depósito está incorreto. Use ponto (.) em vez de vírgula (,) para os centavos, por favor revise!";	
	
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
		
		Integer numeroCc = null;
		String agencia;
		String nomeCliente;
		Double saldo = null;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try(sc){
			
			System.out.println("Por favor, digite o nome completo do cliente: ");
			nomeCliente = sc.nextLine();
			System.out.println("Digite o número da Agência: ");
			agencia = sc.next();
			System.out.println("Digita o número da conta corrente: ");
			numeroCc = sc.nextInt();
			System.out.println("Digita o valor de deposito: ");
			saldo = sc.nextDouble();
			System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.\n", nomeCliente, agencia, numeroCc, saldo);
		
		} catch (Exception e) {
			if(numeroCc == null) {
				System.out.println(MENSAGEM_NUMERO_CONTA_CORRENTE_ERRO);
			}
			if(saldo == null) {
				System.out.println(MENSAGEM_SALDO_ERRO);
			}
		}
		sc.close();
		
	}

}
