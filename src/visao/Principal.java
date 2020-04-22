package visao;

import java.util.Scanner;

import controle.ControladorAluno;

/*
 * Classe que contém as interações com o usuário, portanto,
 * pertencente à camada de visão. As classes desta camada
 * não devem instanciar e manipular diretamente os objetos
 * do modelo, dependendo dos controladores para isso.
 */
public class Principal {

	public static void main(String[] args) {
		
		ControladorAluno controlador = new ControladorAluno();
		Scanner scanner = new Scanner(System.in);
		
		String nome, matricula;
		
		System.out.print("Digite o nome do aluno: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite a matrícula do aluno: ");
		matricula = scanner.nextLine();
		
		/*
		 * Reparem no fluxo dos dados e das chamadas. Para atualizarmos a visão
		 * informando o sucesso ou falha no cadastro, precisamos de um retorno do
		 * modelo. Para isso, nossa requisição: saiu daqui da visão -> passou pelo
		 * controlador -> chegou no modelo -> foi processada -> foi gerado um
		 * retorno referente ao resultado do processamento (true/false) -> o
		 * retorno foi encaminhado pro controlador -> o controlador encaminhou
		 * pra visão -> a visão pode finalmente exibir uma mensagem ao usuário.
		 */
		if(controlador.cadastrarAluno(nome, matricula)) {
			
			System.out.println("Aluno cadastrado com sucesso!");
			
		} else {
			
			System.out.println("Problemas ao cadastrar aluno. Tente novamente.");
			
		}
		
		System.out.print("Digite o nome do aluno: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite a matrícula do aluno: ");
		matricula = scanner.nextLine();
		
		if(controlador.cadastrarAluno(nome, matricula)) {
			
			System.out.println("Aluno cadastrado com sucesso!");
			
		} else {
			
			System.out.println("Problemas ao cadastrar aluno. Tente novamente.");
			
		}
		
		// Um fluxo semelhante acontece aqui para que possamos listar os alunos.
		System.out.println(controlador.listarAlunos());
	}

}
