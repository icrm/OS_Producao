package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.Papel;

public class PapelDAO extends AbstractDAO<Papel> {

    @Override
    protected Class<Papel> getDomainClass() {
        return Papel.class;
    }
    
}
