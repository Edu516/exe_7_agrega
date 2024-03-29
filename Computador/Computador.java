package Computador;

public class Computador extends EquipamentoEletronico {
	
	private String marca;
	private String modelo;
	private Gabinete gabinete;
	private Teclado teclado;
	private Mouse mouse;
	private Monitor monitor;
	
	public Computador(float tensao, float consumo) {
		super(tensao, consumo);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca.length() > 0)
			this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length() > 0)
			this.modelo = modelo;
	}
	
	public Gabinete getGabinete() {
		return gabinete;
	}
	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}
	
	public Teclado getTeclado() {
		return teclado;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", gabinete=");
		builder.append(gabinete.toString());
		builder.append(", teclado=");
		builder.append(teclado.toString());
		builder.append(", mouse=");
		builder.append(mouse.toString());
		builder.append(", monitor=");
		builder.append(monitor.toString());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
