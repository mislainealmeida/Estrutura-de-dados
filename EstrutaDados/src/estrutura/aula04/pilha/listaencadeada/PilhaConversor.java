package estrutura.aula04.pilha.listaencadeada;

public class PilhaConversor {

	public static void main(String[] args) {
		
		int numero= 172;
		PilhaDinamica p= new PilhaDinamica();
		
		int resto;
		// fase 1= empilhamento dos restos
		while(numero != 0) {
			resto= numero %2;// pega o resto da divisao deste numero por 2 (vale 0 ou 1)
			p.push(resto);   // armazena na pilha
			numero= numero/2; // gera um novo numero, resultado da divisao dele por 2. 
			
		}
		// fase 2 = exibição dos restos.
		while(!p.isEmpty()) {
			resto = p.pop();// remove da pilha, sempre o elemento do topo. 
			System.out.print(resto);
		}
		System.out.println();
		System.out.println("Fim do programa");
		
		
// (172 na base 10= (10101100) na base 2. 
		
	}

}
