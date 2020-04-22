package controle;

/*
 * Como as classes pertencem a pacotes diferentes, é
 * necessário realizar a importação para permitir a
 * interação entre elas.
 */
import modelo.SimuladorBD;
import modelo.Aluno;

/*
 * Classe de controle responsável por responder às
 * requisições de aluno. Podemos ter vários controladores
 * no sistema e é interessante criá-los de acordo com suas
 * responsabilidades.
 */
public class ControladorAluno {
	
	SimuladorBD banco;
	
	public ControladorAluno() {
		banco = new SimuladorBD();
	}
	
	/*
	 * Este método recebe os dados passados pela visão, instancia um novo
	 * aluno e solicita sua persistência. Seu retorno depende diretamente
	 * do retorno da classe de banco.
	 */
	public boolean cadastrarAluno(String nome, String matricula) {
		/*
		 *  As classes controladoras são as únicas que podem conhecer
		 *  e manipular as classes do modelo.
		 */
		Aluno aluno = new Aluno(nome, matricula);
		
		return banco.salvar(aluno);
	}
	
	// Retorna a lista de alunos gerada pela banco.
	public String listarAlunos() {
		return banco.obterAlunos();
	}

}
