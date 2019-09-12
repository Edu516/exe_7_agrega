package HomeTheater;

public class HomeTheater_Main {

	public static void main(String[] args) {
		
		
		EquipamentoEletronico ee = new EquipamentoEletronico();
		
		ee.setConsumo(1500);
		ee.setTensao(220);
		System.out.println(ee);
		
		SistemaDeSom som = new SistemaDeSom();
		
		som.setConsumo(1000);
		som.setTensao(110);
		som.setMarca("Sny");
		som.setModelo("S20");
		som.setPotencia(120);
		System.out.println(som);
		
		SistemaDeVideo video = new SistemaDeVideo();
		
		video.setConsumo(1500);
		video.setTensao(220);
		video.setMarca("LG");
		video.setModelo("L300");
		video.setTipo("CRT");
		video.setResolucao("1800 x 1600");
		System.out.println(video);
		
		
		HomeTheater ht = new HomeTheater();
		
		//Sem usar o construtor:
		ht.setSom(som);
		ht.setVideo(video);
		System.out.println(ht);
		
		//Usando o construtor:
		ht.som.setTensao(1200);
		ht.video.setResolucao("1400 X 1200");
		System.out.println(ht);
	}

}
