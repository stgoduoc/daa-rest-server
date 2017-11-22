package cl.duoc.android.service;


import cl.duoc.android.entity.Categoria;
import cl.duoc.android.util.Util;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("categoria")
public class CategoriaService {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categoria> getCategorias() {
        EntityManager em = Util.getEntityManager();
        TypedQuery<Categoria> query = em.createQuery("SELECT c FROM Categoria c", Categoria.class);
        List<Categoria> listaCategorias = query.getResultList();
        return listaCategorias;
    } 
    
    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.APPLICATION_JSON)
    public Categoria crearCategoria(@FormParam("nombre") String nombre, @FormParam("descripcion") String descripcion) {
        EntityManager em = Util.getEntityManager();
        Categoria c = new Categoria(nombre, descripcion);
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return c;
    }
    
}
