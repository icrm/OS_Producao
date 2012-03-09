package br.com.idit.persistence.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

public abstract class AbstractDAO<T> implements Serializable {

    private static final long serialVersionUID = 83723122749823123L;

    protected EntityManager getEntityManager() {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("OS_ProducaoPU");
        return emf.createEntityManager();
    }

    protected abstract Class<T> getDomainClass();

    public final T insert(final T tipo) {
        final EntityManager entity = this.getEntityManager();

        //try {
            entity.getTransaction().begin();
            entity.persist(tipo);
            entity.getTransaction().commit();
        //} catch (Exception ex) {
        //    ex.printStackTrace();
        //}

        return tipo;
    }

    public final T update(final T tipo) {
        final EntityManager entity = this.getEntityManager();

        entity.getTransaction().begin();
        final T updated = entity.merge(tipo);
        entity.getTransaction().commit();

        return updated;
    }
    
    public final void delete(final T tipo) {
        final EntityManager entity = this.getEntityManager();

        entity.getTransaction().begin();
        entity.remove(entity.merge(tipo));
        entity.getTransaction().commit();

    }
    
    public final List<T> findAll() {
        final EntityManager entity = this.getEntityManager();
        final CriteriaQuery criteria = entity.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(this.getDomainClass()));
        return entity.createQuery(criteria).getResultList();
    }
    
    public final T findById(final Object id) {
        final EntityManager entity = this.getEntityManager();
        final T selected = (T) entity.find(this.getDomainClass(), id);
        return selected;
    }
}
