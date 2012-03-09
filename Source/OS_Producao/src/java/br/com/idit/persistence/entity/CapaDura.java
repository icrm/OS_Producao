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
@Table(name = "mz_capa_dura")
public class CapaDura implements Serializable {
    private static final long serialVersionUID = 12349876234871L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_capa_dura")
    private Long cdCapaDura;
    @Column(name = "ds_capa_dura")
    private String dsCapaDura;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", insertable = false, updatable = false)
    private Date created;

    @OneToMany(mappedBy = "capadura", targetEntity = OsProducao.class)
    private List<OsProducao> oss = new ArrayList<OsProducao>();

    public List<OsProducao> getOss() {
        return oss;
    }

    public void setOss(List<OsProducao> oss) {
        this.oss = oss;
    }
    
    public Long getCdCapaDura() {
        return cdCapaDura;
    }

    public void setCdCapaDura(Long cdCapaDura) {
        this.cdCapaDura = cdCapaDura;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDsCapaDura() {
        return dsCapaDura;
    }

    public void setDsCapaDura(String dsCapaDura) {
        this.dsCapaDura = dsCapaDura;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof CapaDura)) {
            return false;
        }
        final CapaDura other = (CapaDura) obj;
        if (this.cdCapaDura != other.cdCapaDura && (this.cdCapaDura == null || !this.cdCapaDura.equals(other.cdCapaDura))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.cdCapaDura != null ? this.cdCapaDura.hashCode() : 0);
        return hash;
    }
    
    
    
}
