import org.mentawai.db.JPAHandler;
import org.mentawai.filter.MentaContainerFilter;

import br.com.cet.cms.action.AdminAction;
import br.com.cet.cms.action.CadProdutoAction;
import br.com.cet.cms.action.CategoriaProdutoAction;
import br.com.cet.cms.action.ExemploAction;
import br.com.cet.cms.action.IndexAction;


public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	
	@Override
	public void loadFilters() {
		 filter(new MentaContainerFilter()); // Filtro responsavel pelo IoC
	}
	
	@Override
	public void setupIoC() {
		ioc("entityManager", new JPAHandler("myapp", true));
	}
	
		
	@Override
	public void loadActions() {

		action("/Principal", IndexAction.class)
			.on(SUCCESS, fwd("/jsp/Site/index.page"))
			.on(ERROR, fwd("/jsp/Exemplo/index.page"));
		
		action(ExemploAction.class, "cadastro")
			.on(SUCCESS, fwd("/jsp/Exemplo/cadastro.page"))
			.on(ERROR, fwd("/jsp/Exemplo/cadastro.page"));

		action(ExemploAction.class, "editar")
			.on(SUCCESS, fwd("/jsp/Exemplo/cadastro.page"))
			.on(ERROR, fwd("/jsp/Exemplo/cadastro.page"));
		
		action(ExemploAction.class, "salvar")
			.on(SUCCESS, redir(ExemploAction.class, "cadastro"))
			.on(ERROR, chain(ExemploAction.class, "cadastro"));
		

		action(AdminAction.class, "admin")
			.on(SUCCESS, fwd("/jsp/Admin/admin.page"))
			.on(ERROR, fwd("/jsp/Admin/admin.page"));
		
		action(CadProdutoAction.class, "cadastro")
			.on(SUCCESS, fwd("/jsp/Cadastro/cadastro.page"))
			.on(ERROR, fwd("/jsp/Cadastro/cadastro.page"));

		action(CategoriaProdutoAction.class, "cadastro")
			.on(SUCCESS, fwd("/jsp/CategoriaProduto/cadastro.page"))
			.on(ERROR, fwd("/jsp/CategoriaProduto/cadastro.page"));		
	}
	
	
	@Override
	public void loadFormatters() {
	}
	
}
