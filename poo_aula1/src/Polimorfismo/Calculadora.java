package Polimorfismo;

public class Calculadora {

	public int soma() {
		int n1 = 5, n2 = 10;
		return n1 + n2;
	}
	
	public double soma(int x) {
		int n1 = 5;
		return n1 + x;
	}
	
	public int soma(int x, double y) {
		int n1 = 5, n2 = 10;
		return n1 + n2;
	}
	
	public double soma(double x, int y) {
		return x + y;
	}
	

	public int subtracao() {
		int n1 = 5, n2 = 10;
		return n1 - n2;
	}
	
	public double subtracao(int x) {
		int n1 = 5;
		return n1 - x;
	}
	
	public int subtracao(int x, double y) {
		int n1 = 5, n2 = 10;
		return n1 - n2;
	}
	
	public double subtracao (double x, int y) {
		return x - y;
	}
	

	public int multiplicacao() {
		int n1 = 5, n2 = 10;
		return n1 * n2;
	}
	
	public double multiplicacao(int x) {
		int n1 = 5;
		return n1 * x;
	}
	
	public int multiplicacao(int x, double y) {
		int n1 = 5, n2 = 10;
		return n1 * n2;
	}
	
	public double multiplicacao(double x, int y) {
		return x * y;
	}
	

	public int divisao() {
		int n1 = 5, n2 = 10;
		return n1 / n2;
	}
	
	public double divisao(int x) {
		int n1 = 5;
		return n1 / x;
	}
	
	public int divisao(int x, double y) {
		int n1 = 5, n2 = 10;
		return n1 / n2;
	}
	
	public double divisao(double x, int y) {
		return x / y;
	}

}
