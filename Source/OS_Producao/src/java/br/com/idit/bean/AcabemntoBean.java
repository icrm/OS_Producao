package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import br.com.idit.persistence.dao.AcabamentosDAO;
import br.com.idit.persistence.entity.Acabamentos;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "acabamentoBean")
@ViewScoped
public class AcabemntoBean extends AbstractBean<Acabamentos> {
    
    private static final long serialVersionUID = 988312039948234L;
    private AcabamentosDAO dao = new AcabamentosDAO();
    private Acabamentos acabamento = new Acabamentos();
    private List<Acabamentos> acabamentos = new ArrayList<Acabamentos>();

    public Acabamentos getAcabamento() {
        return acabamento;
    }

    public void setAcabamento(Acabamentos acabamento) {
        this.acabamento = acabamento;
    }

    public List<Acabamentos> getAcabamentos() {
        return acabamentos;
    }

    public void setAcabamentos(List<Acabamentos> acabamentos) {
        this.acabamentos = acabamentos;
    }

    @PostConstruct
    private void init() {
        this.acabamentos = dao.findAll();
    }

    @Override
    protected List<Acabamentos> getList() {
        return this.acabamentos;
    }

    @Override
    protected AbstractDAO<Acabamentos> getDAO() {
        return this.dao;
    }

    @Override
    protected Acabamentos getPersistObject() {
        return this.acabamento;
    }

}
