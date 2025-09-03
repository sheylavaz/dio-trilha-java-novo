/**
 * Projeto: ContaBanco
 * Autor: Sheyla Vaz
 * Data de criação: 03/09/2025
 */

package br.entities;

import java.util.Objects;

/**
 * 
 */
public class ContaCorrente {

	private Integer numeroCc;
	private String agencia;
	private String nomeCliente;
	private Double saldo;
	
	public ContaCorrente() {
		//construtor padrão
	}

	public ContaCorrente(int numeroCc, String agencia, String nomeCliente, double saldo) {
		this.numeroCc = numeroCc;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	public Integer getNumeroCc() {
		return numeroCc;
	}

	public void setNumeroCc(Integer numeroCc) {
		this.numeroCc = numeroCc;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencia, nomeCliente, numeroCc, saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		return Objects.equals(agencia, other.agencia) && Objects.equals(nomeCliente, other.nomeCliente)
				&& numeroCc == other.numeroCc && Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}

}
