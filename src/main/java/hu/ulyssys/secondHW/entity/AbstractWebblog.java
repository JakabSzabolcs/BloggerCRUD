package hu.ulyssys.secondHW.entity;


import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractWebblog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date createdDate;

    @Column(name = "last_modified_date")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date lastModifiedDate;

    public AbstractWebblog() {
    }

    public AbstractWebblog(Long id, Date createdDate, Date lastModifiedDate) {
        this.id = id;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
