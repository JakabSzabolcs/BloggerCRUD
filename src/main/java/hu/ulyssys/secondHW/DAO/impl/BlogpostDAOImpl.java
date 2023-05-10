package hu.ulyssys.secondHW.DAO.impl;

import hu.ulyssys.secondHW.DAO.BlogpostDAO;
import hu.ulyssys.secondHW.entity.Blogpost;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BlogpostDAOImpl extends CoreDAOImpl<Blogpost> implements BlogpostDAO {
    @Override
    protected Class<Blogpost> getManagedClass() {
        return Blogpost.class;
    }
}
