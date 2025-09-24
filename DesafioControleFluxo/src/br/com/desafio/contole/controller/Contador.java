/**
 *
 * Projeto: DesafioControleFluxo
 * Autor: Sheyla Vaz
 * Data de criação: 22/09/2025
 *
 */


package br.com.desafio.contole.controller;

import java.util.Locale;
import java.util.Scanner;

import br.com.desafio.contole.exception.ParametrosInvalidosException;

/**
 * 
 */
public class Contador {

	public static void main(String[] args) {
		
		Locale brasil = Locale.of("pt", "BR");
		Locale.setDefault(brasil);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int paramUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int  paramDois = sc.nextInt();
		
		try {
			contador(paramUm, paramDois);
		} catch(ParametrosInvalidosException pex) {
			System.out.println(pex.getMessage());
		}	
		sc.close();
	}
	
	//O segundo parâmetro deve ser maior que o primeiro
	static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("digite um numero maior que o primeiro parâmetro");
		} else {
			int contagem = parametroDois - parametroUm;
			for(int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}
		
	}
	
}
