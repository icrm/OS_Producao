package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import br.com.idit.persistence.dao.BlocosDAO;
import br.com.idit.persistence.entity.Blocos;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "blocoBean")
@RequestScoped
public class BlocoBean extends AbstractBean<Blocos> {
    
    private static final long serialVersionUID = 873419342348123L;
    private BlocosDAO dao = new BlocosDAO();
    private Blocos bloco = new Blocos();
    private List<Blocos> blocos = new ArrayList<Blocos>();

    public Blocos getBloco() {
        return bloco;
    }

    public void setBloco(Blocos bloco) {
        this.bloco = bloco;
    }

    public List<Blocos> getBlocos() {
        return blocos;
    }

    public void setBlocos(List<Blocos> blocos) {
        this.blocos = blocos;
    }

    @PostConstruct
    private void init() {
        this.blocos = dao.findAll();
    }

    @Override
    protected List<Blocos> getList() {
        return this.blocos;
    }

    @Override
    protected AbstractDAO<Blocos> getDAO() {
        return this.dao;
    }

    @Override
    protected Blocos getPersistObject() {
        return this.bloco;
    }
}
