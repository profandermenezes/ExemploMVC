package modelo;

/*
 * Classe que representa a entidade Aluno no mundo real. Portanto,
 * pertencente a camada (e pacote) modelo.
 */
public class Aluno {
	
	private String nome;
	private String matricula;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	/*
	 * Apenas o construtor parametrizado. Isso força o usuário
	 * a fornecer os parâmetros para instanciar um objeto Aluno.
	 */
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

}
