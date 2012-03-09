package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.Blocos;

public class BlocosDAO extends AbstractDAO<Blocos> {

    @Override
    protected Class<Blocos> getDomainClass() {
        return Blocos.class;
    }
       
}
