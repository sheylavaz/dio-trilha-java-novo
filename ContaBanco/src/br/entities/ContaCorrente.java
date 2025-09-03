/**
 * 
 */
package br.entities;

import java.util.Objects;

/**
 * 
 */
public class ContaCorrente {

	private int numeroCc;
	private String agencia;
	private String nomeCliente;
	private double saldo;
	
	public int getNumeroCc() {
		return numeroCc;
	}

	public void setNumeroCc(int numeroCc) {
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
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
