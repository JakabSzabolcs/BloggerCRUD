package hu.ulyssys.secondHW.service.impl;

import hu.ulyssys.secondHW.DAO.CoreWebblogDAO;
import hu.ulyssys.secondHW.DAO.impl.CoreDAOImpl;
import hu.ulyssys.secondHW.entity.AbstractWebblog;
import hu.ulyssys.secondHW.service.CoreWebblogService;
import org.apache.poi.ss.formula.functions.T;

import javax.inject.Inject;
import javax.swing.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


public abstract class AbstractWebblogServiceImpl<A extends AbstractWebblog>{
    private List<A> list = new ArrayList<>();

    public List<A> getAll() {
        return list;
    }

    public void add(A object) {
        list.add(object);
    }

    public void remove(A object) {
        list.remove(object);
    }

}


