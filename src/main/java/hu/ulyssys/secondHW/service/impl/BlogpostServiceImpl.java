package hu.ulyssys.secondHW.service.impl;

import hu.ulyssys.secondHW.DAO.AuthorDAO;
import hu.ulyssys.secondHW.DAO.BlogpostDAO;
import hu.ulyssys.secondHW.entity.Author;
import hu.ulyssys.secondHW.entity.Blogpost;
import hu.ulyssys.secondHW.service.AuthorService;
import hu.ulyssys.secondHW.service.BlogpostService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class BlogpostServiceImpl implements BlogpostService {

    @Inject
    private BlogpostDAO blogpostDAO;

    public BlogpostServiceImpl() {
    }

    @Override
    public List<Blogpost> getAll() {
        return blogpostDAO.findAll();
    }

    @Transactional
    @Override
    public void add(Blogpost object) {
        blogpostDAO.persist(object);
    }

    @Transactional
    @Override
    public void update(Blogpost object) {
        blogpostDAO.update(object);
    }

    @Transactional
    @Override
    public void remove(Blogpost object) {
        blogpostDAO.delete(object.getId());
    }

    @Override
    public Blogpost createInstance() {
        return new Blogpost();
    }
}
