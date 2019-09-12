package ContaBancaria;

public class ContaSimples extends ContaBancaria {
	
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	public void setSaldoPoupanca(double saldoPoupanca) {
		if(saldoPoupanca > 0)
			this.saldoPoupanca = saldoPoupanca;
	}
	
	public double depositoPoupanca(double valor) {
		this.saldoPoupanca += valor;
		return this.saldoPoupanca;
	}
	
	public double saquePoupanca(double valor) {
		this.saldoPoupanca -= valor;
		return this.saldoPoupanca;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
