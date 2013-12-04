import br.com.cet.cms.action.AdminAction;
import br.com.cet.cms.action.CategoriaProdutoAction;
import br.com.cet.cms.action.CadProdutoAction;
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
		
		action(AdminAction.class, "admin")
		.on(SUCCESS, fwd("/jsp/Admin/admin.page"))
		.on(ERROR, fwd("/jsp/Admin/admin.page"));
		
		action(CadProdutoAction.class, "cadastro")
			.on(SUCCESS, fwd("/jsp/Cadastro/cadastro.page"))
			.on(ERROR, fwd("/jsp/Cadastro/cadastro.page"));

		action(CategoriaProdutoAction.class, "cadastro")
			.on(SUCCESS, fwd("/jsp/CategoriaProduto/cadastro.page"))
			.on(ERROR, fwd("/jsp/CategoriaProduto/cadastro.page"));
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
