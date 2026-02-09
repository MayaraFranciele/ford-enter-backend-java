package Polimorfismo;

public class Moto implements Veiculo {
	private boolean ligado;
	private int marcha = 0;

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		if (this.ligado == true) 
			System.out.println("Moto ligada");
		else
			this.ligado = true;
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (this.ligado == false)
			System.out.println("Moto desligada");
		else
			this.ligado = false;
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		if (ligado) 
			System.out.println("Moto acelerando");
		else
			System.out.println("Moto está desligada");
		
	}

	@Override
	public void trocarMarcha() {
		// TODO Auto-generated method stub
		if (ligado) {
			marcha++;
			System.out.println("Moto trocou de marcha "+marcha);
		} else {
			System.out.println("Moto desligada");
		}
		
	}

	@Override
	public void freiar() {
		// TODO Auto-generated method stub
		if (ligado) {
			System.out.println("Moto freiando");
		}
		
	}
	
	public boolean isLigado() {
		return ligado;
	}
	

}
