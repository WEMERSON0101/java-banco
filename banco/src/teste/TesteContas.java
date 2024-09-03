package teste;

import NaturezaConta.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaPoupanca debora = new ContaPoupanca("debora", "debora@gmail.com", "rua lindemberg", 1, 01, 200, 2222);
		ContaPoupanca beatriz = new ContaPoupanca("beatriz", "beatriz@gmail.com", "avenida cruz norte", 2, 01, 100, 2211);

		debora.transfere(beatriz, 10);
		System.out.println(beatriz.getSaldo());
	}

}
