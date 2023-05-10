package hu.ulyssys.secondHW.service.impl;

import hu.ulyssys.secondHW.DAO.AuthorDAO;
import hu.ulyssys.secondHW.entity.AbstractWebblog;
import hu.ulyssys.secondHW.entity.Author;
import hu.ulyssys.secondHW.service.AuthorService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class AuthorServiceImpl implements AuthorService {

    @Inject
    private AuthorDAO authorDAO;

    public AuthorServiceImpl() {
    }

    @Override
    public List<Author> getAll() {
        return authorDAO.findAll();
    }

    @Transactional
    @Override
    public void add(Author object) {
        authorDAO.persist(object);
    }

    @Transactional
    @Override
    public void update(Author object) {
        authorDAO.update(object);
    }

    @Transactional
    @Override
    public void remove(Author object) {
        authorDAO.delete(object.getId());
    }


    @Override
    public Author createInstance() {
        return new Author();
    }
}
