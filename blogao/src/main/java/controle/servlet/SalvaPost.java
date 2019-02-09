package controle.servlet;

import modelo.Postagem;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Salv", urlPatterns = {"atualiza"}, loadOnStartup = 1)
public class SalvaPost extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = request.getServletContext();
        HttpSession sessao = request.getSession();

        String strid = request.getParameter("postId");
        Long id = Long.parseLong(strid);
        String titulo = request.getParameter("titulo");
        String texto = request.getParameter("texto");
        String data = request.getParameter("data");


        Postagem postagem = new Postagem(titulo, texto,data);

        postagem = postagem.atualizaPostagem(postagem);

        sessao.setAttribute("postagematualizada", postagem);

        response.sendRedirect("gerenciar");
    }
}

