package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.OsProducao;

public class OsProducaoDAO extends AbstractDAO<OsProducao> {

    @Override
    protected Class<OsProducao> getDomainClass() {
        return OsProducao.class;
    }
    
}
