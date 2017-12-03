package br.com.suafarmaciaonline.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * @author John Frank Eichstaedt
**/

public class Dao {
    
    public void salvar(Object obj){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("suaFarmaciaOnlinePU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        try{
            em.persist(obj);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
    
    public Object ler(Class classe, long id){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("suaFarmaciaOnlinePU");
        EntityManager em = emf.createEntityManager();

        Object obj = null;
        em.getTransaction().begin();
        try{
            obj = em.find(classe, id);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return obj;
    }
    
}
