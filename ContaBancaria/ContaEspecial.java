package ContaBancaria;

public class ContaEspecial extends ContaBancaria {
	
	private int diasSemJuros;
	private double limite;
	private CartaoDeCredito cartao;
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		if(diasSemJuros > 0)
			this.diasSemJuros = diasSemJuros;
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if(limite > 0)
			this.limite = limite;
	}
	
	public CartaoDeCredito getCartao() {
		return cartao;
	}
	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", cartao=");
		builder.append(cartao.toString());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

	
}
