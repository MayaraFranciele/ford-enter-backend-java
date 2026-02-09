package Herança;

public class Professor extends Pessoa {
	private String disciplina;
	private double salario;
	
	public void aumento(double aum) {
		this.salario += aum;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
