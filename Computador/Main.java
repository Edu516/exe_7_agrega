package Computador;

public class Main {

	public static void main(String[] args) {
		
		
		EquipamentoEletronico ee = new EquipamentoEletronico(220, 100);
		
		Mouse mouse = new Mouse();
		mouse.setMarca("Positivo");
		mouse.setTipo("Laser");
		
		Teclado teclado = new Teclado();
		teclado.setMarca("HiTech");
		teclado.setTipo("Mecanico");
		
		Monitor monitor = new Monitor();
		monitor.setMarca("LG");
		monitor.setTipo("60Hz");
		monitor.setResolucao("1260 X 768");
		
		HD hd = new HD();
		hd.setCapacidade(500);
		hd.setMarca("Intel");
		hd.setModelo("SATA");
		hd.setRpm(200);
		
		Memoria memoria = new Memoria();
		memoria.setCapacidade(8);
		memoria.setMarca("Kingston");
		memoria.setModelo("DDR4");
		memoria.setVelocidade(8);
		
		Processador processador = new Processador();
		processador.setMarca("Intel");
		processador.setModelo("I7 5� Gera��o");
		processador.setCache(500);
		processador.setClock(60);
		
		PlacaMae placamae = new PlacaMae();
		placamae.setMarca("Gigabyte");
		placamae.setModelo("Modelo PlacaMae");
		placamae.setHd(hd);
		placamae.setProcessador(processador);
		placamae.setMemoria(memoria);
		
		Gabinete gabinete = new Gabinete();
		gabinete.setBaias(5);
		gabinete.setModelo("Modelo Gabinete");
		gabinete.setTipo("Tipo Gabinete");
		gabinete.setPlacamae(placamae);
		
		Computador computador = new Computador(220, 100);
		computador.setMarca("Rocket");
		computador.setModelo("Modelo computador");
		computador.setGabinete(gabinete);
		computador.setTeclado(teclado);
		computador.setMouse(mouse);
		computador.setMonitor(monitor);
		
		System.out.println(computador);
		
	}

}
