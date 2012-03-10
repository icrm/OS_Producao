package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import br.com.idit.persistence.dao.OsProducaoDAO;
import br.com.idit.persistence.entity.OsProducao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "osProducaoBean")
@ViewScoped
public class OsProducaoBean extends AbstractBean<OsProducao> {
    
    private static final long serialVersionUID = 345472349283491823L;
    private OsProducaoDAO dao = new OsProducaoDAO();
    private OsProducao os = new OsProducao();
    private List<OsProducao> oss = new ArrayList<OsProducao>();

    public OsProducao getOs() {
        return os;
    }

    public void setOs(OsProducao os) {
        this.os = os;
    }

    public List<OsProducao> getOss() {
        return oss;
    }

    public void setOss(List<OsProducao> oss) {
        this.oss = oss;
    }

    @PostConstruct
    private void init() {
        this.oss = dao.findAll();
    }

    @Override
    protected List<OsProducao> getList() {
        return this.oss;
    }

    @Override
    protected AbstractDAO<OsProducao> getDAO() {
        return this.dao;
    }

    @Override
    protected OsProducao getPersistObject() {
        return this.os;
    }
}
