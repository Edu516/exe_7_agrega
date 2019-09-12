package ContaBancaria;

public class Main {

	public static void main(String[] args) {


		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Frederico");
		pessoa.setEndereco("Santana");
		
		Banco banco = new Banco();
		banco.setNome("Caixa");
		banco.setCodigo(12);
		banco.setNumeroAgencias(13);
		
		ContaBancaria cb = new ContaBancaria();
		cb.setAgencia(13);
		cb.setBanco(banco);
		cb.setCorretista(pessoa);
		cb.setNumeroDaConta(89);
		cb.setSaldo(500);
		
		//Depositou R$500,00
		cb.deposito(500);
		
		//Sacou R$200,00
		cb.saque(200);
		
		CartaoDeCredito cc = new CartaoDeCredito();
		cc.setLimite(1500);
		cc.setNumero(15);
		cc.setOperadora("Mastercard");
		cc.setTipoDeartao("Nao sei");
		
		ContaEspecial ce = new ContaEspecial();
		ce.setDiasSemJuros(2);
		ce.setLimite(1500);
		ce.setCartao(cc);
		System.out.println(ce);
		
		ContaSimples cs = new ContaSimples();
		cs.setSaldoPoupanca(cs.getSaldo());
		cs.depositoPoupanca(500);
		cs.saquePoupanca(200);
		System.out.println(cs);
		
		
	}

}
