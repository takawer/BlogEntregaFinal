package controle.servlet;
import modelo.Postagem;
import modelo.Comentario;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(name = "DelPost", urlPatterns = {"delpost"}, loadOnStartup = 1)
public class DelPost extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean deletou = false;
        ServletContext sc = request.getServletContext();
        HttpSession sessao = request.getSession();

        String strid = request.getParameter("postId");
        Long id = Long.parseLong(strid);

        Postagem postagem = new Postagem();
        response.sendRedirect("paginainicial");

        try {
            postagem.deletaPostagemPorId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
