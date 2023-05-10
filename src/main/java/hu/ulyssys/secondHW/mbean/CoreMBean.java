package hu.ulyssys.secondHW.mbean;

import com.microsoft.schemas.vml.CTF;
import hu.ulyssys.secondHW.entity.AbstractWebblog;
import hu.ulyssys.secondHW.service.CoreWebblogService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class CoreMBean<T extends AbstractWebblog> implements Serializable {
    private T selectedWebblog = null;

    private List<T> list = new ArrayList<>();

    public CoreMBean() {}

    @Inject
    private CoreWebblogService<T> coreWebblogService;

    @PostConstruct
    public void init() {
        load();
    }

    private void load() {
        list = coreWebblogService.getAll();
    }

    public void save() {
        selectedWebblog.setLastModifiedDate(new Date());
        if (selectedWebblog.getId() == null) {
            selectedWebblog.setCreatedDate(new Date());
            coreWebblogService.add(selectedWebblog);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Successful save"));
        } else {
            coreWebblogService.update(selectedWebblog);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Successful modify"));
        }
        load();
        initNew();
    }

    public void remove() {
        remove(selectedWebblog);
    }

    public void remove(T object) {
        coreWebblogService.remove(object);
        load();
        initNew();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Successful remove"));
    }

    public void initNew() {
        selectedWebblog = coreWebblogService.createInstance();
    }

    public List<T> getList() {
        return list;
    }

    public T getSelectedWebblog() {
        return selectedWebblog;
    }


    public void setSelectedWebblog(T selectedWebblog) {
        this.selectedWebblog = selectedWebblog;
    }

}
