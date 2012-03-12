package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import br.com.idit.persistence.dao.ImpressaoMioloDAO;
import br.com.idit.persistence.entity.ImpressaoMiolo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "impressaoMioloBean")
@RequestScoped
public class ImpressaoMioloBean extends AbstractBean<ImpressaoMiolo> {
    
    private static final long serialVersionUID = 6112334438298792134L;
    private ImpressaoMioloDAO dao = new ImpressaoMioloDAO();
    private ImpressaoMiolo impressaoMiolo = new ImpressaoMiolo();
    private List<ImpressaoMiolo> impressoesMiolo = new ArrayList<ImpressaoMiolo>();

    public ImpressaoMiolo getImpressaoMiolo() {
        return impressaoMiolo;
    }

    public void setImpressaoMiolo(ImpressaoMiolo impressaoMiolo) {
        this.impressaoMiolo = impressaoMiolo;
    }

    public List<ImpressaoMiolo> getImpressoesMiolo() {
        return impressoesMiolo;
    }

    public void setImpressoesMiolo(List<ImpressaoMiolo> impressoesMiolo) {
        this.impressoesMiolo = impressoesMiolo;
    }

    @PostConstruct
    private void init() {
        this.impressoesMiolo = dao.findAll();
    }

    @Override
    protected List<ImpressaoMiolo> getList() {
        return this.impressoesMiolo;
    }

    @Override
    protected AbstractDAO<ImpressaoMiolo> getDAO() {
        return this.dao;
    }

    @Override
    protected ImpressaoMiolo getPersistObject() {
        return this.impressaoMiolo;
    }
    
}
