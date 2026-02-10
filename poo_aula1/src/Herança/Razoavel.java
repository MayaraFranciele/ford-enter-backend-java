package Herança;

public class Razoavel extends Produto {
	
	@Override
	public void desconto() {
		System.out.println(this.preco*=0.85);
	}

}
