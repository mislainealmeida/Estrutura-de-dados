package lista.labs;

public class Ex02Aviao {

	private int[] passageiros;
	private int capacidade;

	public Ex02Aviao(int capacidade) {
		if (capacidade > 0) {
			passageiros = new int[40];

		}
	}

	public int inserir(int passageiro, int poltrona) {
		if (poltrona >= 0 && poltrona < passageiros.length) {
			passageiros[poltrona] = passageiro;
			System.out.println("Foi adicionado o passageiro " + passageiro + " na poltrona " + poltrona);
			return passageiro;
		} else {
			return -1;
		}
	}

	int passageiro;

	public int excluir(int poltrona) {
		if (poltrona >= 0 && poltrona < passageiros.length) {
			passageiro = passageiros[poltrona];
			passageiros[poltrona] = 0;
			      System.out.println("O passageiro da poltrona "+poltrona +" saiu");
			return passageiro;
		} else {
			return -1;
		}
		
			
			
		}

	}
