package controle.servlet;

import modelo.Postagem;
import jpa.PostagemJPA;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Editp", urlPatterns = {"editp"}, loadOnStartup = 1)
public class EditaPost extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = request.getServletContext();
        HttpSession sessao = request.getSession();

        Long id = Long.parseLong(request.getParameter("postId"));


        Postagem postagem = new Postagem();


        try {
            postagem.achaPostagemPorId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        sessao.setAttribute("postagemalterar", postagem);

        sc.getRequestDispatcher("/jsp/editapost.jsp").forward(request, response);


    }
}