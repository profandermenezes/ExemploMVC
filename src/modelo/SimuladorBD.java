package modelo;

import java.util.ArrayList;

/*
 * Classe criada para simular um banco de dados. Seu
 * objetivo é de "persistir" os alunos criados. Como
 * trata-se de manipulação de dados, pertence a
 * camada de modelo. 
 */
public class SimuladorBD {
	
	private ArrayList<Aluno> alunosSalvos;
	
	public SimuladorBD() {
		alunosSalvos = new ArrayList<Aluno>();
	}
	
	/*
	 *  Método para armazenar um novo aluno. Se tudo
	 *  correr bem retornará true. 
	 */
	public boolean salvar(Aluno aluno) {
		return alunosSalvos.add(aluno);
	}
	
	// Retorna a lista com os nomes dos alunos cadastrados.
	public String obterAlunos() {
		String lista = "| ";
		for(Aluno aluno : alunosSalvos) {
			lista += aluno.getNome() + " | ";
		}
		
		return lista;
	}

}
