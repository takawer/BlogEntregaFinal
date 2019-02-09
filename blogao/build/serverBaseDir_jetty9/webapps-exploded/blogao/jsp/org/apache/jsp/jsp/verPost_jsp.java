package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javafx.geometry.Pos;
import modelo.*;
import java.util.List;
import java.util.ArrayList;
import modelo.Usuario;
import modelo.Papel;
import modelo.EnumPapeis;

public final class verPost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <nav class=\"nav\">\n");
      out.write("        <div class=\"acesso\">\n");
      out.write("            <a href=\"paginainicial\">HOME</a>\n");
      out.write("            <a href=\"cadastrar\">CADASTRAR-SE</a>\n");
      out.write("            <a href=\"login\">LOGIN</a>\n");
      out.write("            style=\"float:right\" <a>VISITANTE</a>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    ");
} else if(eadmin){
      out.write("\n");
      out.write("    <nav class=\"nav\">\n");
      out.write("        <div class=\"acesso\">\n");
      out.write("            <a href=\"paginainicial\">HOME</a>\n");
      out.write("            <a href=\"escrever\">POSTAR</a>\n");
      out.write("            <a href=\"gerenciar\">USUÁRIOS</a>\n");
      out.write("            <a href=\"sair\">SAIR  </a>\n");
      out.write("            style=\"float:right\" <a>");
      out.print( usuario.getNome().toUpperCase());
      out.write("</a>\n");
      out.write("        </div>\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        <nav class=\"nav\">\n");
      out.write("            <div class=\"acesso\">\n");
      out.write("                <a href=\"paginainicial\">HOME</a>\n");
      out.write("                <a href=\"sair\">SAIR</a>\n");
      out.write("                style=\"float:right\"  <a>");
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
      out.write("                background-color: yellow;\n");
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
      out.write('\n');

    Postagem postagem = (Postagem) request.getAttribute("postagem");
    List<Comentario> comentarios = postagem.getComentarios();
    session.setAttribute("postagem", postagem);
    if (usuario == null) {
        usuario = new Usuario();
    }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Postagem</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <div id=\"post\">\n");
      out.write("        <h1 id=\"titulo\">");
      out.print(postagem.getTitulo().toUpperCase());
      out.write("\n");
      out.write("        </h1>\n");
      out.write("        <h6 id=\"data\">");
      out.print(postagem.getData());
      out.write("\n");
      out.write("        </h6>\n");
      out.write("        <p id=\"texto\">");
      out.print(postagem.getTexto());
      out.write("\n");
      out.write("        </p>\n");
      out.write("        ");
if(eadmin) {
            System.out.println("eadmin?: " + eadmin);
      out.write("\n");
      out.write("        <div class=\"postagem\">\n");
      out.write("            <form id=");
      out.print(postagem.getId());
      out.write(", action=\"delpost\" method=\"post\">\n");
      out.write("                <label class=\"formLabel\">\n");
      out.write("                    <input name=\"postId\" hidden value=");
      out.print(postagem.getId());
      out.write(">\n");
      out.write("                </label>\n");
      out.write("                <div class=\"botao\">\n");
      out.write("                    <input class=\"btn\" value=\"DEL\" id=\"del\" type=\"submit\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"comentar\">\n");
      out.write("        <h1>Comentários:</h1>\n");
      out.write("        ");
if (usuario.getId() != null) {
      out.write("\n");
      out.write("        <form id=\"tmj\" action=\"comentar\" method=\"post\">\n");
      out.write("\n");
      out.write("            <label class=\"formLabel\">\n");
      out.write("                <input name=\"nomeUsuario\" disabled value=");
      out.print(usuario.getNome());
      out.write(", type=\"text\" required>\n");
      out.write("            </label>\n");
      out.write("\n");
      out.write("            <label class=\"formLabel\">\n");
      out.write("                <input name=\"comentario\" placeholder=\"Comentário\" type=\"text\" required>\n");
      out.write("            </label>\n");
      out.write("\n");
      out.write("            <label class=\"formLabel\">\n");
      out.write("                <input name=\"idUsuario\" hidden value=");
      out.print(usuario.getId());
      out.write(">\n");
      out.write("            </label>\n");
      out.write("\n");
      out.write("            <label class=\"formLabel\">\n");
      out.write("                <input name=\"idPostagem\" hidden value=");
      out.print(postagem.getId());
      out.write(">\n");
      out.write("            </label>\n");
      out.write("            <div class=\"butao\">\n");
      out.write("                <input class=\"btn\" value=\"COMENTAR\" id=\"btnVerMais2\" type=\"submit\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            if (!comentarios.isEmpty()) {
                for (Comentario comentario : comentarios) {
        
      out.write("\n");
      out.write("        <div id=\"comentario\">\n");
      out.write("            <div id=\"autor\">\n");
      out.write("                <h4>");
      out.print(usuario.achaUsuarioPorId(comentario.getUsuario()).getNome() + " • " + comentario.getData() );
      out.write("\n");
      out.write("                </h4>\n");
      out.write("                <div id=\"conteudo\">\n");
      out.write("                    <h3>");
      out.print(comentario.getConteudo());
      out.write("\n");
      out.write("                    </h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
if(eadmin) {
                System.out.println("eadmin?: " + eadmin);
      out.write("\n");
      out.write("            <form id=\"top\" action=\"delcom\" method=\"post\">\n");
      out.write("                <input hidden name=\"comid\" value=");
      out.print(comentario.getId());
      out.write(">\n");
      out.write("                <div class=\"butao\">\n");
      out.write("                    <input class=\"btn\" value=\"DEL\" id=\"btnVerMais\" type=\"submit\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
} else { 
      out.write("\n");
      out.write("        <h2>Lista de comentários vazia!</h2>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        background-color: gray;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container {\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100%;\n");
      out.write("        background: white;\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: row;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form#tmj {\n");
      out.write("        display: inline-block;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #btnVerMais, #btnVerMais2 {\n");
      out.write("        background: transparent;\n");
      out.write("        border: none;\n");
      out.write("        color: white;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100%;\n");
      out.write("        cursor: pointer;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.dados{\n");
      out.write("        margin: 2em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=text], input[type=password] {\n");
      out.write("        background: transparent;\n");
      out.write("        width: 40%;\n");
      out.write("        padding: 12px 20px;\n");
      out.write("        display: inline-block;\n");
      out.write("        border: 1px solid black;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        margin: 0 0 0 1em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.butao {\n");
      out.write("        background: black;\n");
      out.write("        width: 9em;\n");
      out.write("        height: 2em;\n");
      out.write("        border-radius: 30px;\n");
      out.write("        text-align: center;\n");
      out.write("        margin: 0 0 0 28em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #post {\n");
      out.write("        width: 50%;\n");
      out.write("        height: 100%;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h1 {\n");
      out.write("        background-color: black;\n");
      out.write("        color: white;\n");
      out.write("        margin: 1em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    p {\n");
      out.write("        margin: 20px;\n");
      out.write("        text-align: justify;\n");
      out.write("        font-size: 24px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #comentar {\n");
      out.write("        text-align: center;\n");
      out.write("        width: 50%;\n");
      out.write("        height: 100%;\n");
      out.write("        background-color: rgba(0, 0, 0, 0.3);\n");
      out.write("        display: inline-block;\n");
      out.write("        flex-direction: row;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #comentario {\n");
      out.write("        text-align: justify;\n");
      out.write("        width: 80%;\n");
      out.write("        margin: 0 0 0 5em;\n");
      out.write("        border: 1px solid black;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #comentario h6 {\n");
      out.write("        margin: 2em 1em;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h3 {\n");
      out.write("        background-color: rgba(0, 0, 0, 0.3);\n");
      out.write("        padding: 0.5em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h4 {\n");
      out.write("        margin: 1em 0 0 1em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #comentario h3 {\n");
      out.write("        margin: 1em 3em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
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
