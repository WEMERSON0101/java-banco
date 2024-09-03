package NaturezaConta;

public class ContaCorrente extends Conta {

	private final int cnpj;

	public ContaCorrente(String nome, String email, String endereco, int numero, int agencia, double saldo, int cnpj) {
		super(nome, email, endereco, numero, agencia, saldo);
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	@Override
	public String toString() {
		return "Titular [nome=" + nome + ", [email=" + email + ", [endereco=" + endereco + "Conta [numero=" + numero
				+ ", [agencia=" + agencia + ", [saldo=" + saldo + "ContaCorrente [cnpj=" + cnpj;
	}

}
