package NaturezaConta;

public class ContaPoupanca extends Conta {

	private final int cpf;

	public ContaPoupanca(String nome, String email, String endereco, int numero, int agencia, double saldo, int cpf) {
		super(nome, email, endereco, numero, agencia, saldo);
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "Titular [nome=" + nome + ", [email=" + email + ", [endereco=" + endereco + "Conta [numero=" + numero
				+ ", [agencia=" + agencia + ", [saldo=" + saldo + "ContaPoupanca [cpf=" + cpf;
	}

}
