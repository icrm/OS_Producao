package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.Insercoes;

public class InsercoesDAO extends AbstractDAO<Insercoes> {

    @Override
    protected Class<Insercoes> getDomainClass() {
        return Insercoes.class;
    }
    
}
