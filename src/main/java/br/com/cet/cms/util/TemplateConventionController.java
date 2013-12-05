package br.com.cet.cms.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mentawai.core.ApplicationManager;
import org.mentawai.template.ConventionController;
import org.mentawai.template.Page;
import org.mentawai.template.TemplateServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Novo sistema de CoC relacionado aos templates, o que significa menos configurações. <br/>
 * Ele extende o ConventionController padrão do mentawai, permitindo que uma mesma action pode ter mais de 1 template JSP.
 * <br/>
 * 
 * Uma das vantages é que a mesma action (CoCTestAction.details.lkz) pode ter mais de um template de acordo com a extenção da página, ou algum valor no Input.
 * E que se pode definir os valores das convenções através dos atributos estáticos sem precisar extender essa classe.
 * 
 * <br/><br/>
 * 
 * 
 * Tutorial : http://www.mentaframework.org/templates.jsp
 * JavaDoc 	: http://www.mentaframework.org/api/org/mentawai/template/ConventionController.html
 * @author Ricardo Jorge (ricardo.jl.rufino@gmail.com )
 */
public class TemplateConventionController extends ConventionController {
	
	protected static final Logger logger = LoggerFactory.getLogger(TemplateConventionController.class);

	/** Flag que determina se o debug está habilitado */
	protected static boolean debug = logger.isDebugEnabled();
	
	public static String PAGE_EXTENSION = ".page";
	
	
	public static String ROOT = "";
	public static String PRINCIPAL_BLOCK = "body";
	public static String VIEW_EXTENSION = ".jsp";
	
	@Override
	public String getRoot() {
		return ROOT;
	}
	
	@Override
	public String getPrincipalBlock() {
		return PRINCIPAL_BLOCK;
	}
	
	@Override
	public String getExtension() {
		return VIEW_EXTENSION;
	}
	
	@Override
	public void processPage(Page page, HttpServletRequest request, HttpServletResponse response, ServletContext application) {
		// Pegar o caminho da página mas sem a extenção. 
		// O Controle sobre a extenção foi tirado do TemplateServlet e colocado apenas nessa classe.
		// Para permitir o uso de diversos templates baseanos não apenas no path, mas tambem na extenção requisitada.
		String pagePath = TemplateServlet.extractPagePath(request);
		
		String view = getRoot() + pagePath + getExtension();
		
		String viewDir = ApplicationManager.getViewDir();
		
		if (viewDir != null && viewDir.length() > 0 && !view.startsWith(viewDir)) {
			
			if (viewDir.endsWith("/") && view.startsWith("/")) {
				
				viewDir = viewDir.substring(0, viewDir.length() - 1);
				
			} else if (!viewDir.endsWith("/") && !view.startsWith("/")) {
				
				viewDir = viewDir + "/";
			}
			
			view = viewDir + view;
		} 
		

		File file = new File(application.getRealPath("") + view);
		
		logger.debug("processPage :: Destination File = " + file + "  (exist = " +file.exists()+ ")");
		
//		// Verifica se está usando o Jetty no modo embarcado, caso ele não tenha achado o arquivo.
//		// Isso é necessário pois quando ele está usando esse modo ele usa o proprio código fonte, o diretorio: 'src/main/webapp', como diretorio para as jsp
//		if( (!file.exists()) && isJettyEmbeddedServer(request, application)){
//			String webAppDir = getJettyWebappDirectory(request, application);
//			file = new File(webAppDir + view);
//			logger.debug("Server Info = " + application.getServerInfo());
//			logger.debug("Running on Jetty :: file not exist, new destination file = " + file);
//		}
//		
		
//		if (!file.exists()) {
//			try {
//				request.getRequestDispatcher(view).forward(request, response);
//				return;
//			} catch (Exception e) {
//				throw new TemplateException(e);
//			}
//		}
		
		page.setBlock(getPrincipalBlock(), new Page(view.replaceFirst("/", "")));
		
		
		if(debug){
			Map<String, Object> mapaPaginas = page.getBlocks();
			Map<String, String> mapaPaginasUrl = new HashMap<String, String>();
			for (String key : mapaPaginas.keySet()) {
				mapaPaginasUrl.put(key, ((Page) mapaPaginas.get(key)).getView());
			}
			
			logger.debug("processPage :: PagePath = " + page.getPath() + ", view = " + view);
		}
	}
	
	public boolean isJettyEmbeddedServer(HttpServletRequest request, ServletContext application){
		// FIXME: Verificar se ta no modo embarcado....
		return application.getServerInfo().contains("jetty");
	}
	
	public String getJettyWebappDirectory(HttpServletRequest request, ServletContext application){
		// FIXME: pegar as pastar corretas do arquivo de configuração...
		return application.getRealPath("").replace("target/tmp/webinf", "src/main/webapp");
	}
	
}
