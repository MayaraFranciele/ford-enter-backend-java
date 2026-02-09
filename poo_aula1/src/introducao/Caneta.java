package introducao;

public class Caneta {
	//Caracteristicas -> Atributos
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampada;
	
	//Metodo construtor
	public Caneta(String cor, double ponta) { //variaveis que o usuario (dev) vai poder modificar
		// elementos que vão ser padrão para qualquer caneta colocados no escopo do metodo
		this.carga = 100;
		this.tampada = true;
		this.cor = cor;
		this.ponta = ponta;
	}
	
	//Comportamentos -> Métodos
	public void tampar() {
		if (this.tampada == true) // this faz a diferenciação de atributo e variavel
			System.out.println("Erro.. A caneta já está tampada!");
		else
			this.tampada = true; // um = é atribuição e == é comparação
	}
	
	public void destampar() {
		if (this.tampada == false)
			System.out.println("Erro.. A caneta já está destampada");
		else this.tampada = false;
	}
	
	public void escrever() {
		if (this.tampada == true)
			System.out.println("Erro.. A caneta está tampada");
		else if (this.carga == 0)
			System.out.println("Erro.. Não há carga na caneta");
		else
		{
			System.out.println("Escrevendo.."); // precisa de chaves quando tiver mais de uma linha no escopo
			this.carga -=5;
		}

	}
	
	public void estado() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Carga: "+this.carga+"%");
		System.out.println("Tampada?: "+this.tampada);
	}

}
