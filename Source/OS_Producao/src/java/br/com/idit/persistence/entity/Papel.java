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
@Table(name = "mz_papel")
public class Papel implements Serializable {
    private static final long serialVersionUID = 123934872723123L;
    
    @Id
    @Column(name = "cd_papel")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdPapel;
    @Column(name = "ds_papel")
    private String dsPapel;
    @Column(name = "created", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @OneToMany(mappedBy = "papel", targetEntity = OsProducao.class)
    private List<OsProducao> oss = new ArrayList<OsProducao>();

    public Long getCdPapel() {
        return cdPapel;
    }

    public void setCdPapel(Long cdPapel) {
        this.cdPapel = cdPapel;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDsPapel() {
        return dsPapel;
    }

    public void setDsPapel(String dsPapel) {
        this.dsPapel = dsPapel;
    }

    public List<OsProducao> getOss() {
        return oss;
    }

    public void setOss(List<OsProducao> oss) {
        this.oss = oss;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Papel)) {
            return false;
        }
        final Papel other = (Papel) obj;
        if (this.cdPapel != other.cdPapel && (this.cdPapel == null || !this.cdPapel.equals(other.cdPapel))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.cdPapel != null ? this.cdPapel.hashCode() : 0);
        return hash;
    }
}
