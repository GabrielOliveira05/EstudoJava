package Construtores;

public class Aluno {

	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;



	public Aluno(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public enum STATUS{
		APROVADO, 
		REPROVADO
	}

	public double calcularMediaAluno() {
		double totalNotas = 0 ;
		totalNotas = (this.nota1 + this.nota2 + this.nota3) / 3;
		System.out.println("A médias das três notas são : " + totalNotas);
		if(totalNotas <= 5) {
			System.out.println(" aluno está reprovado");
		}else {
		System.out.println("O aluno está aprovado");	
		}

		return totalNotas;
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

	@Override
	public String toString() {
		return "Aluno [nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
	}

}
