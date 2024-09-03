package Error;

public class ValorMinimo extends RuntimeException {

	public ValorMinimo(String message) {
       super("O valor mínimo de transferência é R$20,00. Tente um valor maior.");
		// TODO Auto-generated constructor stub
	}

}
