package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import br.com.idit.persistence.dao.InsercoesDAO;
import br.com.idit.persistence.entity.Insercoes;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "insercaoBean")
@RequestScoped
public class InsercaoBean extends AbstractBean<Insercoes> {
    
    private static final long serialVersionUID = 23489283749189323L;
    private InsercoesDAO dao = new InsercoesDAO();
    private Insercoes insercao = new Insercoes();
    private List<Insercoes> insercoes = new ArrayList<Insercoes>();

    public Insercoes getInsercao() {
        return insercao;
    }

    public void setInsercao(Insercoes insercao) {
        this.insercao = insercao;
    }

    public List<Insercoes> getInsercoes() {
        return insercoes;
    }

    public void setInsercoes(List<Insercoes> insercoes) {
        this.insercoes = insercoes;
    }

    @PostConstruct
    private void init() {
        this.insercoes = dao.findAll();
    }

    @Override 
    protected List<Insercoes> getList() {
        return this.insercoes;
    }

    @Override
    protected AbstractDAO<Insercoes> getDAO() {
        return this.dao;
    }

    @Override
    protected Insercoes getPersistObject() {
        return this.insercao;
    }
}
