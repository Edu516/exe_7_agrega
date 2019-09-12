package ContaBancaria;

public class ContaBancaria {
	
	private Banco banco;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	private Pessoa corretista;
	
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia != 0)
			this.agencia = agencia;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		if(numeroDaConta != 0)
			this.numeroDaConta = numeroDaConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo > 0)
			this.saldo = saldo;
	}
	
	public Pessoa getCorretista() {
		return corretista;
	}
	public void setCorretista(Pessoa corretista) {
		this.corretista = corretista;
	}
	
	public double deposito(double valor) {
		this.saldo += valor;
		return this.saldo;
	}
	
	public double saque(double valor) {
		this.saldo -= valor;
		return this.saldo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroDaConta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", corretista=");
		builder.append(corretista);
		builder.append("]");
		return builder.toString();
	}
	
	
}
