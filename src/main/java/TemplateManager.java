
import org.mentawai.template.ConventionController;
import org.mentawai.template.Page;

public class TemplateManager extends org.mentawai.template.TemplateManager {
	
	@Override
	public void configurePages() {

	    Page adminTemplate = new Page(".*", "jsp/Templates/template-admin.jsp", ConventionController.class);
        add(adminTemplate);
         
        // Template para o Site.
        Page siteTemplate = new Page("jsp/Templates/template-site.jsp", ConventionController.class);

        // Páginas Específicas de Site
        // =====================================================================
        add(new Page("jsp/Site/index", siteTemplate)); 
        add(new Page("jsp/Noticia/detalhes", siteTemplate)); 
        
        
	}
	
}
