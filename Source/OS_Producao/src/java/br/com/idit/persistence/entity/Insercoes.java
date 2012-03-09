package br.com.idit.persistence.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mz_insercoes")
public class Insercoes implements Serializable {
    private static final long serialVersionUID = 231307538765290L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_insercoes")
    private Long cdInsercoes;
    @Column(name = "ds_insercoes")
    private String dsInsercoes;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", insertable = false, updatable = false)
    private Date created;
    
    @OneToMany(mappedBy = "insercoes", targetEntity = OsProducao.class)
    private List<OsProducao> oss = new ArrayList<OsProducao>();

    public List<OsProducao> getOss() {
        return oss;
    }

    public void setOss(List<OsProducao> oss) {
        this.oss = oss;
    }

    public Long getCdInsercoes() {
        return cdInsercoes;
    }

    public void setCdInsercoes(Long cdInsercoes) {
        this.cdInsercoes = cdInsercoes;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDsInsercoes() {
        return dsInsercoes;
    }

    public void setDsInsercoes(String dsInsercoes) {
        this.dsInsercoes = dsInsercoes;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Insercoes)) {
            return false;
        }
        final Insercoes other = (Insercoes) obj;
        if (this.cdInsercoes != other.cdInsercoes && (this.cdInsercoes == null || !this.cdInsercoes.equals(other.cdInsercoes))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.cdInsercoes != null ? this.cdInsercoes.hashCode() : 0);
        return hash;
    }
    
    
    
}
