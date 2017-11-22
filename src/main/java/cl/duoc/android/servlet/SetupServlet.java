package cl.duoc.android.servlet;

import cl.duoc.android.entity.Categoria;
import cl.duoc.android.util.Util;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SetupServlet", urlPatterns = {"/setup"})
public class SetupServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager em = Util.getEntityManager();
        em.getTransaction().begin();
        em.persist(new Categoria("Ropa Deportiva", "Lorem ipsum dolor"));
        em.persist(new Categoria("Ropa de Cama", "Lorem ipsum dolor"));
        em.persist(new Categoria("Ropa de Verano", "Lorem ipsum dolor"));
        em.getTransaction().commit();
        response.sendRedirect("index.jsp");
    }

    
    
}
