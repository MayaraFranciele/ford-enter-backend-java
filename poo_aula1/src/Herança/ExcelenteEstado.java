package Herança;

public class ExcelenteEstado extends Produto {
	
	@Override
	public void desconto() {
		System.out.println(this.preco = this.preco - this.preco * 0.05);
	}

}
