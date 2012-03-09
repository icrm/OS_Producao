package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.ImpressaoMiolo;

public class ImpressaoMioloDAO extends AbstractDAO<ImpressaoMiolo> {

    @Override
    protected Class<ImpressaoMiolo> getDomainClass() {
        return ImpressaoMiolo.class;
    }
    
}
