package cl.duoc.android.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {
    
    public static EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jerseyPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
    
}
