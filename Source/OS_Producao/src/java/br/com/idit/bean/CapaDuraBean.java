package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import br.com.idit.persistence.dao.CapaDuraDAO;
import br.com.idit.persistence.entity.CapaDura;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "capaDuraBean")
@ViewScoped
public class CapaDuraBean extends AbstractBean<CapaDura> {
    
    private static final long serialVersionUID = 6342347987662381279L;
    private CapaDuraDAO dao = new CapaDuraDAO();
    private CapaDura capaDura = new CapaDura();
    private List<CapaDura> capasDuras = new ArrayList<CapaDura>();

    public CapaDura getCapaDura() {
        return capaDura;
    }

    public void setCapaDura(CapaDura capaDura) {
        this.capaDura = capaDura;
    }

    public List<CapaDura> getCapasDuras() {
        return capasDuras;
    }

    public void setCapasDuras(List<CapaDura> capasDuras) {
        this.capasDuras = capasDuras;
    }

    @PostConstruct
    private void init() {
        this.capasDuras = dao.findAll();
    }

    @Override
    protected List<CapaDura> getList() {
        return this.capasDuras;
    }

    @Override
    protected AbstractDAO<CapaDura> getDAO() {
        return this.dao;
    }

    @Override
    protected CapaDura getPersistObject() {
        return this.capaDura;
    }

}
