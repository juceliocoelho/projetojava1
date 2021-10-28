package cursojavaInterfaces;

/*ESTA INTERFACE SERA O NOSSO CONTRATO DE AUTENTICAÇÃO*/
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
	
}
