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
@Table(name = "mz_cadernos")
public class Cadernos implements Serializable{
    private static final long serialVersionUID = 1240712327349283L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_cadernos")
    private Long cdCadernos;
    @Column(name = "ds_cadernos")
    private String dsCadernos;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", insertable = false, updatable = false)
    private Date created;
    
    @OneToMany(mappedBy = "cadernos", targetEntity = OsProducao.class)
    private List<OsProducao> oss = new ArrayList<OsProducao>();

    public List<OsProducao> getOss() {
        return oss;
    }

    public void setOss(List<OsProducao> oss) {
        this.oss = oss;
    }

    public Long getCdCadernos() {
        return cdCadernos;
    }

    public void setCdCadernos(Long cdCadernos) {
        this.cdCadernos = cdCadernos;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDsCadernos() {
        return dsCadernos;
    }

    public void setDsCadernos(String dsCadernos) {
        this.dsCadernos = dsCadernos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cadernos)) {
            return false;
        }
        final Cadernos other = (Cadernos) obj;
        if (this.cdCadernos != other.cdCadernos && (this.cdCadernos == null || !this.cdCadernos.equals(other.cdCadernos))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + (this.cdCadernos != null ? this.cdCadernos.hashCode() : 0);
        return hash;
    }
    
    
    
}
