package Error;

public class DepositoMinimo extends RuntimeException {

	public DepositoMinimo(String message) {
		super("o valor do deposito minimo é de R$20.00");
	}
}
