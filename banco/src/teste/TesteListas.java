package teste;

import java.util.ArrayList;

import NaturezaConta.ContaPoupanca;

public class TesteListas {

	public static void main(String[] args) {

		ContaPoupanca julia = new ContaPoupanca("julia", "julia@gmail.com", "rua das flores", 1, 01, 200, 2222);
		ContaPoupanca beatriz = new ContaPoupanca("beatriz", "beatriz@gmail.com", "rua da maça", 2, 01, 100, 2211);
		ContaPoupanca eduarda = new ContaPoupanca("eduarda", "eduarda@gmail.com", "rua do ouro negro", 3, 01, 400, 2233);
		ContaPoupanca carolina = new ContaPoupanca("carolina", "carolina@gmail.com", "rua da agua", 4, 01, 700, 2244);

		ArrayList<ContaPoupanca> contas = new ArrayList<>();
		contas.add(julia);
		contas.add(beatriz);
		contas.add(eduarda);
		contas.add(carolina);

		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
	}
}
