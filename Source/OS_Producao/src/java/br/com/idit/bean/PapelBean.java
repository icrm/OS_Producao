package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import br.com.idit.persistence.dao.PapelDAO;
import br.com.idit.persistence.entity.Papel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "papelBean")
@ViewScoped
public class PapelBean extends AbstractBean<Papel> {
    
    private static final long serialVersionUID = 6237491801923093423L;
    private PapelDAO dao = new PapelDAO();
    private Papel papel = new Papel();
    private List<Papel> papeis = new ArrayList<Papel>();

    public List<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }
    
    @PostConstruct
    private void init() {
        this.papeis = dao.findAll();
    }

    @Override
    protected List<Papel> getList() {
        return this.papeis;
    }

    @Override
    protected AbstractDAO<Papel> getDAO() {
        return this.dao;
    }

    @Override
    protected Papel getPersistObject() {
        return this.papel;
    }
}
