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
@Table(name = "mz_blocos")
public class Blocos implements Serializable {
    private static final long serialVersionUID = 123934872723123L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_blocos")
    private Long cdBlocos;
    @Column(name = "ds_blocos")
    private String dsBlocos;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", insertable = false, updatable = false)
    private Date created;
    
    @OneToMany(mappedBy = "blocos", targetEntity = OsProducao.class)
    private List<OsProducao> oss = new ArrayList<OsProducao>();

    public List<OsProducao> getOss() {
        return oss;
    }

    public void setOss(List<OsProducao> oss) {
        this.oss = oss;
    }

    public Long getCdBlocos() {
        return cdBlocos;
    }

    public void setCdBlocos(Long cdBlocos) {
        this.cdBlocos = cdBlocos;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDsBlocos() {
        return dsBlocos;
    }

    public void setDsBlocos(String dsBlocos) {
        this.dsBlocos = dsBlocos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Blocos)) {
            return false;
        }
        final Blocos other = (Blocos) obj;
        if (this.cdBlocos != other.cdBlocos && (this.cdBlocos == null || !this.cdBlocos.equals(other.cdBlocos))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.cdBlocos != null ? this.cdBlocos.hashCode() : 0);
        return hash;
    }
    
}
