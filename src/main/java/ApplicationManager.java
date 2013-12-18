import org.mentawai.db.JPAHandler;
import org.mentawai.filter.MentaContainerFilter;

import br.com.cet.cms.action.AdminAction;
import br.com.cet.cms.action.CadProdutoAction;
import br.com.cet.cms.action.CategoriaMenuAction;
import br.com.cet.cms.action.CategoriaProdutoAction;
import br.com.cet.cms.action.ClienteAction;
import br.com.cet.cms.action.ControlePaginaAction;
import br.com.cet.cms.action.ExemploAction;
import br.com.cet.cms.action.IndexAction;
import br.com.cet.cms.action.UsuarioAction;

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

		action("/Principal", IndexAction.class).on(SUCCESS,
				fwd("/jsp/Site/index.page")).on(ERROR,
				fwd("/jsp/Exemplo/index.page"));

		action(ExemploAction.class, "cadastro").on(SUCCESS,
				fwd("/jsp/Exemplo/cadastro.page")).on(ERROR,
				fwd("/jsp/Exemplo/cadastro.page"));

		action(ClienteAction.class, "cadastro").on(SUCCESS,
				fwd("/jsp/Cliente/cadastro.page")).on(ERROR,
				fwd("/jsp/Cliente/cadastro.page"));

		action(UsuarioAction.class, "listar").on(SUCCESS,
				fwd("/jsp/Usuario/listar.page")).on(ERROR,
				fwd("/jsp/Usuario/listar.page"));

		action(UsuarioAction.class, "cadastro").on(SUCCESS,
				fwd("/jsp/Usuario/cadastro.page")).on(ERROR,
				fwd("/jsp/Usuario/cadastro.page"));

		action(ExemploAction.class, "editar").on(SUCCESS,
				fwd("/jsp/Exemplo/cadastro.page")).on(ERROR,
				fwd("/jsp/Exemplo/cadastro.page"));

		action(ExemploAction.class, "excluir").on(SUCCESS,
				fwd("/jsp/Exemplo/cadastro.page")).on(ERROR,
				fwd("/jsp/Exemplo/cadastro.page"));

		action(ExemploAction.class, "salvar").on(SUCCESS,
				redir(ExemploAction.class, "cadastro")).on(ERROR,
				chain(ExemploAction.class, "cadastro"));

		action(ClienteAction.class, "salvar").on(SUCCESS,
				redir(ClienteAction.class, "cadastro")).on(ERROR,
				chain(ClienteAction.class, "cadastro"));

		action(UsuarioAction.class, "salvar").on(SUCCESS,
				redir(UsuarioAction.class, "listar")).on(ERROR,
				chain(UsuarioAction.class, "cadastro"));

		action(AdminAction.class, "admin").on(SUCCESS,
				fwd("/jsp/Admin/admin.page")).on(ERROR,
				fwd("/jsp/Admin/admin.page"));

		action(CadProdutoAction.class, "cadastro").on(SUCCESS,
				fwd("/jsp/Cadastro/cadastro.page")).on(ERROR,
				fwd("/jsp/Cadastro/cadastro.page"));

		action(CategoriaProdutoAction.class, "cadastro").on(SUCCESS,
				fwd("/jsp/CategoriaProduto/cadastro.page")).on(ERROR,
				fwd("/jsp/CategoriaProduto/cadastro.page"));

		// CADASTRO DE CATEGORIA DA PÁGINA
		action(ControlePaginaAction.class, "cadastro").on(SUCCESS,
				fwd("/jsp/ControlePagina/controlePaginas.page")).on(ERROR,
				fwd("/jsp/ControlePagina/controlePaginas.page"));

		action(CategoriaMenuAction.class, "cadastro").on(SUCCESS,
				fwd("/jsp/ControlePagina/categoriaCadastro.page")).on(ERROR,
				fwd("/jsp/ControlePagina/errorCadastro.page"));
		
		action(CategoriaMenuAction.class, "salvar").on(SUCCESS,
				redir(CategoriaMenuAction.class, "listar")).on(ERROR,
				chain(CategoriaMenuAction.class, "cadastro"));
		
		action(CategoriaMenuAction.class, "editar").on(SUCCESS,
				fwd("/jsp/Exemplo/cadastro.page")).on(ERROR,
				fwd("/jsp/ControlePagina/errorCadastro.page"));
	}

	@Override
	public void loadFormatters() {
	}

}
