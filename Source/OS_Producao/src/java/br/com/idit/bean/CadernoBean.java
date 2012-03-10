package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import br.com.idit.persistence.dao.CadernosDAO;
import br.com.idit.persistence.entity.Cadernos;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "cadernoBean")
@ViewScoped
public class CadernoBean extends AbstractBean<Cadernos> {

    private static final long serialVersionUID = 872342712379863L;
    private CadernosDAO dao = new CadernosDAO();
    private Cadernos caderno = new Cadernos();
    private List<Cadernos> cadernos = new ArrayList<Cadernos>();

    public Cadernos getCaderno() {
        return caderno;
    }

    public void setCaderno(Cadernos caderno) {
        this.caderno = caderno;
    }

    public List<Cadernos> getCadernos() {
        return cadernos;
    }

    public void setCadernos(List<Cadernos> cadernos) {
        this.cadernos = cadernos;
    }

    @PostConstruct
    private void init() {
        this.cadernos = dao.findAll();
    }

    @Override
    protected List<Cadernos> getList() {
        return this.cadernos;
    }

    @Override
    protected AbstractDAO<Cadernos> getDAO() {
        return this.dao;
    }

    @Override
    protected Cadernos getPersistObject() {
        return this.caderno;
    }
}
