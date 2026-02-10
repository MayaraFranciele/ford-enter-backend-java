package Herança;

public class ExercicioHerança {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novo n = new Novo();
		ExcelenteEstado e = new ExcelenteEstado();
		BomEstado b = new BomEstado();
		Razoavel r = new Razoavel();
		
		n.setNome("celular");
		n.setDescricao("motorola");
		n.setPreco(1000);
		
		e.setNome("TV");
		e.setDescricao("LG");
		e.setPreco(2000);
		
		b.setNome("Máquina de Lavar");
		b.setDescricao("Samsung");
		b.setPreco(800);
		
		r.setNome("Geladeira");
		r.setDescricao("Electrolux");
		r.setPreco(500);
		
		System.out.println("Dados do Produto Novo");
		System.out.println("Nome: "+n.getNome());
		System.out.println("Descrição: "+n.getDescricao());
		System.out.println("Preço: "+n.getPreco());
		System.out.println("Valor com desconto: ");
		n.desconto();
		System.out.println("\nDados do Produto Excelente Estado");
		System.out.println("Nome: "+e.getNome());
		System.out.println("Descrição: "+e.getDescricao());
		System.out.println("Preço: "+e.getPreco());
		System.out.println("Valor com desconto: ");
		e.desconto();
		System.out.println("\nDados do Produto Bom Estado");
		System.out.println("Nome: "+b.getNome());
		System.out.println("Descrição: "+b.getDescricao());
		System.out.println("Preço: "+b.getPreco());
		System.out.println("Valor com desconto: ");
		b.desconto();
		System.out.println("\nDados do Produto Razoavel");
		System.out.println("Nome: "+r.getNome());
		System.out.println("Descrição: "+r.getDescricao());
		System.out.println("Preço: "+r.getPreco());
		System.out.println("Valor com desconto: ");
		r.desconto();

	}

}
