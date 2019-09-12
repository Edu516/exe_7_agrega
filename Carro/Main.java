package Carro;

public class Main {

	public static void main(String[] args) {

		Motor m = new Motor();
		m.setCilindros(120);
		m.setCombustivel("Alcool");
		m.setMarca("Ford");
		m.setPotencia(200);
		
		Pessoa p = new Pessoa();
		p.setNome("Edu");
		p.setEndereco("Rita");
		
		Carro c = new Carro();
		c.setAno(2015);
		c.setCor("Azul");
		c.setFabricante("Baka");
		c.setModelo("fuca");
		c.setMotor(m);
		c.setPessoa(p);
		
		System.out.println(c);
	}

}
