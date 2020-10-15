package lista.labs;

public class Ex03Funcionario {
	
	private String nomefuncionario;
	private String idade;
	private String cargo;
	
	
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	private int[] qtdFuncionarios= new int [100]; 
	
	
	public String getNomefuncionario() {
		return nomefuncionario;
	}

	public void setNomefuncionario(String nomefuncionario) {
		this.nomefuncionario = nomefuncionario;
	}

	public Ex03Funcionario() {}
	
	
		public int inserir(int qtd, int pos) {
			if (pos>=0 && pos< qtdFuncionarios.length) {
				qtdFuncionarios[pos]= qtd; 
				System.out.println("Foi adicionado um novo funcionário na posição " + pos);
				return qtd;
			} else {
				return -1;
			}
			
		}
		
		public boolean verificar(String nomeFuncionario) {
			if (nomeFuncionario== "Maria") {
				System.out.println("Maria é funcionária na empresa");
				return true;
				
			}else {
				System.out.println("Maria não é funcionária na empresa");
				return false;
			}
		}
		
		

}
