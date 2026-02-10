package Herança;

public class Exemplo001 {
	public static void main(String[] args) {
		//Pessoa p = new Pessoa();
		Aluno a = new Aluno();
		Professor prof = new Professor();
		
		a.setNome("Valentina");
		a.setIdade(18);
		
		System.out.println("Nome: "+a.getNome());
		
		
	}

}
