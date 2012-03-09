package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.CapaDura;

public class CapaDuraDAO extends AbstractDAO<CapaDura> {

    @Override
    protected Class<CapaDura> getDomainClass() {
        return CapaDura.class;
    }
    
}
