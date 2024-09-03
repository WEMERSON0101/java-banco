package Error;

public class SaldoInsuficiente extends RuntimeException {

	public SaldoInsuficiente(String message) {
		super("Saldo insuficiente! Tente um valor menor.");
	}
}
