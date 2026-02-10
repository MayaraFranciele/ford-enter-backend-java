package Herança;

public class BomEstado extends Produto {
	@Override
	public void desconto() {
		System.out.println(this.preco = this.preco * 0.9);
	}

}
