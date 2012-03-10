package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.Miolo;

public class MioloDAO extends AbstractDAO<Miolo> {

    @Override
    protected Class<Miolo> getDomainClass() {
        return Miolo.class;
    }

}
