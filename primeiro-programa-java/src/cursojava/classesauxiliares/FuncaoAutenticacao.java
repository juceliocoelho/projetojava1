package cursojava.classesauxiliares;

import cursojavaInterfaces.PermitirAcesso;

/*acessar s� quem tem senha*/
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
