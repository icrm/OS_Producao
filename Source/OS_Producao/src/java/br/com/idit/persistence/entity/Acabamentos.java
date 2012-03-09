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
@Table(name = "mz_acabamentos")
public class Acabamentos implements Serializable {
    private static final long serialVersionUID = 12349857129834987L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_acabamentos")
    private Long cdAcabamentos;
    @Column(name = "ds_acabamentos")
    private String dsAcabamentos;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", insertable = false, updatable = false)
    private Date created;
    
    @OneToMany(mappedBy = "acabamentos", targetEntity = OsProducao.class)
    private List<OsProducao> oss = new ArrayList<OsProducao>();

    public List<OsProducao> getOss() {
        return oss;
    }

    public void setOss(List<OsProducao> oss) {
        this.oss = oss;
    }

    public Long getCdAcabamentos() {
        return cdAcabamentos;
    }

    public void setCdAcabamentos(Long cdAcabamentos) {
        this.cdAcabamentos = cdAcabamentos;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDsAcabamentos() {
        return dsAcabamentos;
    }

    public void setDsAcabamentos(String dsAcabamentos) {
        this.dsAcabamentos = dsAcabamentos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Acabamentos)) {
            return false;
        }
        final Acabamentos other = (Acabamentos) obj;
        if (this.cdAcabamentos != other.cdAcabamentos && (this.cdAcabamentos == null || !this.cdAcabamentos.equals(other.cdAcabamentos))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.cdAcabamentos != null ? this.cdAcabamentos.hashCode() : 0);
        return hash;
    }
    
    
    
}
