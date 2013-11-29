import br.com.cet.cms.action.ExemploAction;
import br.com.cet.cms.action.IndexAction;


public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	
	@Override
	public void loadFilters() {
		
	}
		
	@Override
	public void loadActions() {

		action("/Principal", IndexAction.class)
			.on(SUCCESS, fwd("/jsp/Site/index.page"))
			.on(ERROR, fwd("/jsp/Exemplo/index.page"));
		
		action(ExemploAction.class, "cadastro")
			.on(SUCCESS, fwd("/jsp/Exemplo/cadastro.page"))
			.on(ERROR, fwd("/jsp/Exemplo/cadastro.page"));
		
//		
//		action(ClienteAction.class, "salvar")
//			.filter(new ClienteValidator())
//			.on(SUCCESS, fwd("/jsp/Cliente/detalhes.jsp"))
//			.on(ERROR, fwd("/jsp/Cliente/cadastro.jsp"));
		
	}
	
	
	@Override
	public void loadFormatters() {
	}
	
}
