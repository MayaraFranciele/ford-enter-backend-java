package Polimorfismo;

public class Carro implements Veiculo {
	private boolean ligado;
	private int marcha = 0;

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		if (this.ligado == true) 
			System.out.println("Carro ligado");
		else
			this.ligado = true;
			System.out.println("Carro ligado");

		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		if (this.ligado == false)
			System.out.println("Carro desligado");
		else
			this.ligado = false;
		System.out.println("Carro desligado!");

		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		if (ligado) 
			System.out.println("Carro acelerando");
		else
			System.out.println("Carro está desligado");
		
		
	}

	@Override
	public void trocarMarcha() {
		// TODO Auto-generated method stub
		if (ligado) {
			marcha++;
			System.out.println("Carro trocou de marcha "+marcha);
		} else {
			System.out.println("Carro desligado");
		}
		
	}

	@Override
	public void freiar() {
		// TODO Auto-generated method stub
		if (ligado) {
			System.out.println("Carro freiando");
		}
		
	}
	
	public boolean isLigado() {
		return ligado;
	}
	


}
