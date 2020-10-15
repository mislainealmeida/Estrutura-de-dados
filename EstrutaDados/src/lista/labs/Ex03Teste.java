package lista.labs;

public class Ex03Teste {

	public static void main(String[] args) {
		Ex03Funcionario funcionario = new Ex03Funcionario();
		
		funcionario.inserir(1, 60);
		funcionario.setNomefuncionario("Nome: João ");
		funcionario.setIdade("Idade: 25");
		funcionario.setCargo("Cargo: Gerente");
		System.out.println(funcionario.getNomefuncionario());
		System.out.println(funcionario.getIdade());
		System.out.println(funcionario.getCargo());
		System.out.println();
		
		
		funcionario.setNomefuncionario("Maria");
		funcionario.setIdade("Idade: 30");
		funcionario.setCargo("Cargo: Auxiliar de escritório");
		funcionario.verificar(funcionario.getNomefuncionario());
		System.out.println(funcionario.getIdade());
		System.out.println(funcionario.getCargo());

	}

}
