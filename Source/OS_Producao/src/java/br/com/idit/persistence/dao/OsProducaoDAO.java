package br.com.idit.persistence.dao;

import br.com.idit.persistence.entity.OsProducao;
import java.io.Serializable;

public class OsProducaoDAO extends AbstractDAO<OsProducao> implements Serializable {

    private static final long serialVersionUID = 93723486342731231L;
    
    @Override
    protected Class<OsProducao> getDomainClass() {
        return OsProducao.class;
    }
    
}
