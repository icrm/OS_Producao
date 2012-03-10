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
@Table(name = "mz_impressao_miolo")
public class ImpressaoMiolo implements Serializable {
    private static final long serialVersionUID = 12124123409784L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_impressao_miolo")
    private Long cdImpressaoMiolo;
    @Column(name = "ds_impressao_miolo")
    private String dsImpressaoMiolo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", insertable = false, updatable = false)
    private Date created;
    
    @ManyToMany(mappedBy = "impressaomiolo", targetEntity = OsProducao.class)
    private List<OsProducao> oss = new ArrayList<OsProducao>();

    public List<OsProducao> getOss() {
        return oss;
    }

    public void setOss(List<OsProducao> oss) {
        this.oss = oss;
    }

    public Long getCdImpressaoMiolo() {
        return cdImpressaoMiolo;
    }

    public void setCdImpressaoMiolo(Long cdImpressaoMiolo) {
        this.cdImpressaoMiolo = cdImpressaoMiolo;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDsImpressaoMiolo() {
        return dsImpressaoMiolo;
    }

    public void setDsImpressaoMiolo(String dsImpressaoMiolo) {
        this.dsImpressaoMiolo = dsImpressaoMiolo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ImpressaoMiolo)) {
            return false;
        }
        final ImpressaoMiolo other = (ImpressaoMiolo) obj;
        if (this.cdImpressaoMiolo != other.cdImpressaoMiolo && (this.cdImpressaoMiolo == null || !this.cdImpressaoMiolo.equals(other.cdImpressaoMiolo))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (this.cdImpressaoMiolo != null ? this.cdImpressaoMiolo.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return this.dsImpressaoMiolo;
    }
}
