package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		contaBancaria bancaria = new contaBancaria();
		bancaria.setDescricao("Conta bancaria do alex");

		System.out.println(bancaria);

		bancaria.diminui100Reais();
		bancaria.diminui100Reais();

		System.out.println(bancaria);

		bancaria.sacarDinheiro(400);

		System.out.println(bancaria);

		bancaria.depositoDinheiro(1000);

		System.out.println(bancaria);

		bancaria.soma100Reais();

		System.out.println(bancaria);
		
		
	}

}
