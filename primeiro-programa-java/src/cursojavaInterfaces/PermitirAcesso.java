package cursojavaInterfaces;

/*ESTA INTERFACE SERA O NOSSO CONTRATO DE AUTENTICA��O*/
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
	
}
