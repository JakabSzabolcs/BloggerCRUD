package hu.ulyssys.secondHW.DAO.impl;

import hu.ulyssys.secondHW.DAO.CoreWebblogDAO;
import hu.ulyssys.secondHW.entity.AbstractWebblog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class CoreDAOImpl<T extends AbstractWebblog> implements CoreWebblogDAO<T> {

    @PersistenceContext(unitName = "WebBlogPersistence")
    private EntityManager entityManager;

    @Override
    public List<T> findAll() {
        return entityManager.createQuery("select n from " + getManagedClass().getName() + " n", getManagedClass()).getResultList();
    }

    @Override
    public T findById(Long id) {
        return entityManager.find(getManagedClass(), id);
    }

    @Override
    public void persist(T object) {
        entityManager.persist(object);
    }

    @Override
    public void update(T object) {
        entityManager.merge(object);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(findById(id));
    }

    protected abstract Class<T> getManagedClass();
}
