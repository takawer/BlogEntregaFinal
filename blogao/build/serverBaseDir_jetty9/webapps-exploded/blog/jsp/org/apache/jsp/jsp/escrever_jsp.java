package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.Usuario;
import modelo.Papel;
import modelo.EnumPapeis;

public final class escrever_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/nav.jsp");
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

      out.write('\n');
      out.write('\n');
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
      out.write("\n");
      out.write("    <nav class=\"nav\">\n");
      out.write("            <a style=\"float: left\"href=\"paginainicial\">HOME</a>\n");
      out.write("            <a style=\"float: right\" href=\"login\">LOGIN</a>\n");
      out.write("            <a style=\"float: right\"href=\"cadastrar\">CADASTRAR-SE</a>\n");
      out.write("            <b>VISITANTE</b>\n");
      out.write("    </nav>\n");
      out.write("    ");
} else if(eadmin){
      out.write("\n");
      out.write("    <nav class=\"nav\">\n");
      out.write("            <a style=\"float: left\"href=\"paginainicial\">HOME</a>\n");
      out.write("            <a style=\"float: left\"href=\"escrever\">POSTAR</a>\n");
      out.write("            <a style=\"float: left\"href=\"gerenciar\">USUÁRIOS</a>\n");
      out.write("            <a style=\"float: right\"href=\"sair\">SAIR  </a>\n");
      out.write("            <b>");
      out.print( usuario.getNome().toUpperCase());
      out.write("</b>\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        <nav class=\"nav\">\n");
      out.write("                <a style=\"float: left\"href=\"paginainicial\">HOME</a>\n");
      out.write("                <a style=\"float: right\"href=\"sair\">SAIR</a>\n");
      out.write("                <b>BEM VINDO, ");
      out.print( usuario.getNome().toUpperCase());
      out.write("</b>\n");
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
      out.write("            /* NavBar */\n");
      out.write("            .nav {\n");
      out.write("                background-color: black;\n");
      out.write("                overflow: hidden;\n");
      out.write("                top: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 3em;\n");
      out.write("            }\n");
      out.write("            .nav {\n");
      out.write("                margin-top: -3px; }\n");
      out.write("\n");
      out.write("            .nav a {\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .nav a:hover {\n");
      out.write("                background-color: darkgoldenrod;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .nav b {\n");
      out.write("                float: right;\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .nav b:hover {\n");
      out.write("                background-color: darkgoldenrod;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Escrever Postagem</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <form class=\"baseForm\" action=\"postar\" method=\"post\">\n");
      out.write("        <div class=\"dados\">\n");
      out.write("            <label class=\"formLabel\" id=\"titulo\">\n");
      out.write("                <input name=\"titulo\" placeholder=\"Título\" type=\"text\" required class=\"formInput formTextInput\">\n");
      out.write("            </label>\n");
      out.write("            <label class=\"formLabel\" id=\"texto\">\n");
      out.write("                <input name=\"texto\" placeholder=\"Texto\" type=\"text\" required class=\"formInput formTextInput\">\n");
      out.write("            </label>\n");
      out.write("            <div class=\"botao\">\n");
      out.write("                <input class=\"btn\" value=\"PUBLICAR\" id=\"btnPubli\" type=\"submit\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        background-color: gray;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=text]{\n");
      out.write("        width: 80%;\n");
      out.write("        padding: 12px 20px;\n");
      out.write("        display: block;\n");
      out.write("        border: 1px solid black;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        margin: 1em 0 0 3em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    button:hover {\n");
      out.write("        opacity: 0.8;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #btnPubli {\n");
      out.write("        background: transparent;\n");
      out.write("        border: none;\n");
      out.write("        color: darkgoldenrod;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100%;\n");
      out.write("        cursor: pointer;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.dados {\n");
      out.write("        margin: 2em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.botao {\n");
      out.write("        background: black;\n");
      out.write("        width: 5em;\n");
      out.write("        height: 2em;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        text-align: center;\n");
      out.write("        margin: 2em 0 0 11em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container {\n");
      out.write("        border: 1px solid black;\n");
      out.write("        width: 30em;\n");
      out.write("        height: 15em;\n");
      out.write("        background: white;\n");
      out.write("        display: block;\n");
      out.write("        flex-direction: row;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        margin: 8em 0 0 25em;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
