package hu.ulyssys.secondHW.service;

import hu.ulyssys.secondHW.entity.AbstractWebblog;

import java.util.List;

public interface CoreWebblogService<T extends AbstractWebblog> {
    List<T> getAll();

    void add(T object);

    void update(T object);

    void remove(T object);

    T createInstance();
}
