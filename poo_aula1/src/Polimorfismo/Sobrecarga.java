package Polimorfismo;
// 2 ou mais métodos dentro uma classe que possui o mesmo nome, porém com parâmetros diferentes = polimorfismo de sobrecarga 

public class Sobrecarga {
	public int soma() {
		int n1 = 5, n2 = 10;
		return n1 + n2;
	}
	
	public int soma(int x) {
		int n1 = 5;
		return n1 + x;
	}
	
	public int soma(int x, int y) {
		int n1 = 5, n2 = 10;
		return n1 + n2;
	}
	
	public double soma(double x, int y) {
		return x + y;
	}

}
