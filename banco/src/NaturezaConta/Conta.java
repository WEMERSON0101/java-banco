package NaturezaConta;

import Error.DepositoMinimo;
import Error.SaldoInsuficiente;
import Error.ValorMinimo;

public abstract class Conta extends Titular {

	protected final int numero;
	protected final int agencia;
	protected double saldo;

	public Conta(String nome, String email, String endereco, int numero, int agencia, double saldo) {
		super(nome, email, endereco);
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valorDoDeposito) {
		if (valorDoDeposito < 0) {
			throw new DepositoMinimo(toString());
		}
		this.saldo += valorDoDeposito;
	}

	public void transfere(Conta contaDestino, double valorDaTransferencia) {
		if (valorDaTransferencia > this.saldo) {
			throw new SaldoInsuficiente(toString());
		}
		if (valorDaTransferencia < 20.00) {
			throw new ValorMinimo(toString());
		}
		this.saldo -= valorDaTransferencia;
		contaDestino.deposita(valorDaTransferencia);

	}

}
