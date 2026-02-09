package introducao;

public class Exemplo1 {

	public static void main(String[] args) {
		Caneta bic = new Caneta("Azul", 0.5);
		Caneta montblanc = new Caneta("Preta", 0.7);
		System.out.println("CANETA BIC");
		bic.estado();
		System.out.println("CANETA montblanc");
		montblanc.destampar();
		montblanc.escrever();
		montblanc.estado();

	}

}
