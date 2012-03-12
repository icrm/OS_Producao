package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import br.com.idit.persistence.dao.MioloDAO;
import br.com.idit.persistence.entity.Miolo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mioloBean")
@RequestScoped
public class MioloBean extends AbstractBean<Miolo> {

    private static final long serialVersionUID = 763428123897873234L;
    private MioloDAO dao = new MioloDAO();
    private Miolo miolo = new Miolo();
    private List<Miolo> miolos = new ArrayList<Miolo>();

    public Miolo getMiolo() {
        return miolo;
    }

    public void setMiolo(Miolo miolo) {
        this.miolo = miolo;
    }

    public List<Miolo> getMiolos() {
        return miolos;
    }

    public void setMiolos(List<Miolo> miolos) {
        this.miolos = miolos;
    }

    @PostConstruct
    private void init() {
        this.miolos = dao.findAll();
    }

    @Override
    protected List<Miolo> getList() {
        return this.miolos;
    }

    @Override
    protected AbstractDAO<Miolo> getDAO() {
        return this.dao;
    }

    @Override
    protected Miolo getPersistObject() {
        return this.miolo;
    }
}
