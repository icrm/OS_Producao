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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mz_miolo")
public class Miolo implements Serializable {
    private static final long serialVersionUID = 123934872723123L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="cd_miolo")
    private Long cdMiolo;
    @Column(name="ds_miolo")
    private String dsMiolo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", insertable = false, updatable = false)
    private Date created;
    
    @ManyToMany(mappedBy = "miolo", targetEntity = OsProducao.class)
    private List<OsProducao> oss = new ArrayList<OsProducao>();

    public List<OsProducao> getOss() {
        return oss;
    }

    public void setOss(List<OsProducao> oss) {
        this.oss = oss;
    }

    public Long getCdMiolo() {
        return cdMiolo;
    }

    public void setCdMiolo(Long cdMiolo) {
        this.cdMiolo = cdMiolo;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDsMiolo() {
        return dsMiolo;
    }

    public void setDsMiolo(String dsMiolo) {
        this.dsMiolo = dsMiolo;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Miolo)) {
            return false;
        }
        final Miolo other = (Miolo) obj;
        if (this.cdMiolo != other.cdMiolo && (this.cdMiolo == null || !this.cdMiolo.equals(other.cdMiolo))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.cdMiolo != null ? this.cdMiolo.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return this.dsMiolo;
    }
}
