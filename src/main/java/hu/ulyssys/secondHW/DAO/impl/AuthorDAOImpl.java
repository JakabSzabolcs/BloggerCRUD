package hu.ulyssys.secondHW.DAO.impl;


import hu.ulyssys.secondHW.DAO.AuthorDAO;
import hu.ulyssys.secondHW.entity.Author;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthorDAOImpl extends CoreDAOImpl<Author> implements AuthorDAO {
    @Override
    protected Class<Author> getManagedClass() {
        return Author.class;
    }
}
