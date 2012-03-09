package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.Acabamentos;

public class AcabamentosDAO extends AbstractDAO<Acabamentos> {

    @Override
    protected Class<Acabamentos> getDomainClass() {
        return Acabamentos.class;
    }
    
}
