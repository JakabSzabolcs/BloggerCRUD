package hu.ulyssys.secondHW.mbean;

import hu.ulyssys.secondHW.entity.Blogpost;

import javax.faces.view.ViewScoped;

import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class BlogpostMBean extends CoreMBean<Blogpost>
{
}
