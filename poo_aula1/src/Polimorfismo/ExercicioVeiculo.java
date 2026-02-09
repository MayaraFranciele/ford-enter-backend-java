package Polimorfismo;

public class ExercicioVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo mustang = new Carro();
		mustang.ligar();
		mustang.acelerar();
		mustang.trocarMarcha();
		
		Veiculo vespa = new Moto();
		vespa.desligar();

	}

}
