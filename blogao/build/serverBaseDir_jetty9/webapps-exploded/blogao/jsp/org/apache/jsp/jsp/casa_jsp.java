package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jpa.PostagemJPA;
import modelo.Postagem;
import java.util.List;
import java.text.SimpleDateFormat;
import com.mysql.cj.xdevapi.Collection;
import java.util.Collections;
import java.util.ArrayList;
import modelo.Usuario;
import modelo.Papel;
import modelo.EnumPapeis;

public final class casa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/cabecalho.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    boolean eadmin = false;
    Usuario usuario = (Usuario) session.getAttribute("usuarioLogado");

    if(usuario != null) {
        ArrayList<Papel> papeis = (ArrayList<Papel>) usuario.getPapeis();
        for (Papel papel : papeis) {
            if (papel.getDescricao().toString().equals("Administrador")) {
                eadmin = true;
            }
        }
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("\n");
      out.write("    ");
if (usuario == null) {
      out.write(" <!-- VISITANTE -->\n");
      out.write("    <nav class=\"nav\">\n");
      out.write("        <div class=\"acesso\">\n");
      out.write("            <a href=\"paginainicial\">HOME</a>\n");
      out.write("            <a href=\"login\">LOGIN</a>\n");
      out.write("            <a href=\"cadastrar\">CADASTRAR-SE</a>\n");
      out.write("            <a>VISITANTE</a>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    ");
} else if(eadmin){
      out.write(" <!-- logado como ADM -->\n");
      out.write("    <nav class=\"nav\">\n");
      out.write("        <div class=\"acesso\">\n");
      out.write("            <a href=\"paginainicial\">HOME</a>\n");
      out.write("            <a href=\"escrever\">POSTAR</a>\n");
      out.write("            <a href=\"gerenciar\">GERENCIAR</a>\n");
      out.write("            <a href=\"sair\">SAIR  </a>\n");
      out.write("            <a>");
      out.print( usuario.getNome().toUpperCase());
      out.write("</a>\n");
      out.write("        </div>\n");
      out.write("        ");
} else {
      out.write(" <!-- logado como USUARIO CADASTRADO -->\n");
      out.write("        <nav class=\"nav\">\n");
      out.write("            <div class=\"acesso\">\n");
      out.write("                <a href=\"paginainicial\">CASA</a>\n");
      out.write("                <a href=\"sair\">SAIR</a>\n");
      out.write("                <a>");
      out.print( usuario.getNome().toUpperCase());
      out.write("</a>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            @font-face {\n");
      out.write("                font-family: OstrichBold;\n");
      out.write("                src: url(\"../fonts/ostrich-sans-bold.ttf\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a{\n");
      out.write("                color: white;\n");
      out.write("                margin: 0 50px 50px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav {\n");
      out.write("                font-family: OstrichBold;\n");
      out.write("                display: block;\n");
      out.write("                background-color: black;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 3em;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            nav a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .acesso{\n");
      out.write("                font-size: 17px;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 1.7em 0 0 5em;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');

    String parecer = (String) request.getAttribute("parecer");
    PostagemJPA postagem = new Postagem();
    List<Postagem> postagens = postagem.achaTodas();
    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Collections.reverse(postagens);

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Página Inicial</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/estiloHome.css\">\n");
      out.write("    <meta CHARSET=\"UTF-8\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
 if (usuario != null) { 
      out.write("\n");
      out.write("\n");
      out.write("<div hidden class=\"conteudo\">\n");
      out.write("    <p>Olá, ");
      out.print( usuario.getNome() );
      out.write("\n");
      out.write("    </p>\n");
      out.write("    <p>Seu e-mail cadastrado é: ");
      out.print( usuario.getEmail() );
      out.write("\n");
      out.write("    </p>\n");
      out.write("    <p>Sua senha cadastrada é: ");
      out.print( usuario.getSenha() );
      out.write("\n");
      out.write("    </p>\n");
      out.write("    <p>Você tem privilégios de: </p>\n");
      out.write("    <ul>\n");
      out.write("        ");
 for (Papel p : usuario.getPapeis()) { 
      out.write("\n");
      out.write("        <li>");
      out.print( p.getDescricao().toString() );
      out.write("\n");
      out.write("        </li>\n");
      out.write("        ");
} 
      out.write("\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
}
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"postagens\">\n");
      out.write("    ");
for (Postagem postagem1 : postagens) {
      out.write("\n");
      out.write("    <div class=\"postagem\">\n");
      out.write("        <form id=");
      out.print(postagem1.getId());
      out.write(", action=\"mostrapostagem\" method=\"post\">\n");
      out.write("            <div class=\"data\">\n");
      out.write("                <h5>");
      out.print(postagem1.getDataDiaMes());
      out.write("</h5>\n");
      out.write("            </div>\n");
      out.write("            <h3>");
      out.print(postagem1.getTitulo().toUpperCase());
      out.write("\n");
      out.write("            </h3>\n");
      out.write("            <label class=\"formLabel\">\n");
      out.write("                <input name=\"postId\" hidden value=");
      out.print(postagem1.getId());
      out.write(">\n");
      out.write("            </label>\n");
      out.write("            <div class=\"butao\">\n");
      out.write("                <input class=\"btn\" value=\"VER\" id=\"btnVerMais\" type=\"submit\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        margin: 0;\n");
      out.write("        background-color: white;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form {\n");
      out.write("        display: flex;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form h5 {\n");
      out.write("        background: transparent;\n");
      out.write("        color: white;\n");
      out.write("        font-size: 15px;\n");
      out.write("        text-align: center;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.data {\n");
      out.write("        background: black;\n");
      out.write("        width: 3em;\n");
      out.write("        height: 3em;\n");
      out.write("        text-align: center;\n");
      out.write("        margin: 1em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form h3 {\n");
      out.write("        background-color: white;\n");
      out.write("        color: black;\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 24px;\n");
      out.write("        padding: 0.5px;\n");
      out.write("        border: 1px solid black;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #btnVerMais {\n");
      out.write("        background: transparent;\n");
      out.write("        border: none;\n");
      out.write("        color: white;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100%;\n");
      out.write("        cursor: pointer;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.butao {\n");
      out.write("        background: black;\n");
      out.write("        width: 3em;\n");
      out.write("        height: 3em;\n");
      out.write("        border-radius: 25px;\n");
      out.write("        text-align: center;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        horiz-align: center;\n");
      out.write("        margin: 1em 0 0 1em ;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div#postagens {\n");
      out.write("        position: center;\n");
      out.write("        width: fit-content;\n");
      out.write("        height: fit-content;\n");
      out.write("        margin: auto;\n");
      out.write("        background: white;\n");
      out.write("        display: block;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        alignment: center;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    .postagem {\n");
      out.write("        width: fit-content;\n");
      out.write("        background: transparent;\n");
      out.write("        display: flex;\n");
      out.write("        align-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
