package hu.ulyssys.secondHW.DAO;

import hu.ulyssys.secondHW.entity.AbstractWebblog;

import java.util.List;

public interface CoreWebblogDAO<T extends AbstractWebblog> {
    List<T> findAll();

    T findById(Long id);

    void persist(T object);

    void update(T object);

    void delete(Long id);


}
