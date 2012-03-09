package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.Cadernos;

public class CadernosDAO extends AbstractDAO<Cadernos> {

    @Override
    protected Class<Cadernos> getDomainClass() {
        return Cadernos.class;
    }
    
}
