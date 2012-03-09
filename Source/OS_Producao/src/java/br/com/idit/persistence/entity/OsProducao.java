package br.com.idit.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mz_os_producao")
public class OsProducao implements Serializable {
    private static final long serialVersionUID = 86742873123123L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_OS_PRODUCAO")
    private Long cdOsProducao;
    @Column(name = "DS_CLIENTE")
    private String dsCliente;
    @Column(name = "NU_QUANTIDADE")
    private int nuQuantidade;
    @Column(name = "FG_PERCALUX")
    private Character fgPercalux;
    @Column(name = "DS_COR_PERCALUX")
    private String dsCorPercalux;
    @Column(name = "DS_GRV_PERCALUX")
    private String dsGrvPercalux;
    @Column(name = "QT_IP_LAMINAS")
    private Integer qtIpLaminas;
    @Column(name = "DS_IP_CORES")
    private String dsIpCores;
    @Column(name = "DS_OUT_INFORMACOES")
    private String dsOutInformacoes;
    @Column(name = "DS_RESPONSAVEL")
    private String dsResponsavel;
    @Column(name = "DS_GRAF_RESPONSAVEL")
    private String dsGrafResponsavel;
    @Column(name = "CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    
    @ManyToOne(targetEntity = Papel.class)
    @JoinColumn(name = "CD_PAPEL")
    private Papel papel;
    @ManyToOne(targetEntity = Miolo.class)
    @JoinColumn(name = "CD_MIOLO")
    private Miolo miolo;
    @ManyToOne(targetEntity = Blocos.class)
    @JoinColumn(name = "CD_BLOCOS")
    private Blocos blocos;
    @ManyToOne(targetEntity = CapaDura.class)
    @JoinColumn(name = "CD_CAPA_DURA")
    private CapaDura capadura;
    @ManyToOne(targetEntity = Cadernos.class)
    @JoinColumn(name = "CD_CADERNOS")
    private Cadernos cadernos;
    @ManyToOne(targetEntity = Insercoes.class)
    @JoinColumn(name = "CD_INSERCOES")
    private Insercoes insercoes;
    @ManyToOne(targetEntity = ImpressaoMiolo.class)
    @JoinColumn(name = "CD_IMPRESSAO_MIOLO")
    private ImpressaoMiolo impressaomiolo;
    @ManyToOne(targetEntity = Acabamentos.class)
    @JoinColumn(name = "CD_ACABAMENTOS")
    private Acabamentos acabamentos;

    public Acabamentos getAcabamentos() {
        return acabamentos;
    }

    public void setAcabamentos(Acabamentos acabamentos) {
        this.acabamentos = acabamentos;
    }

    public ImpressaoMiolo getImpressaomiolo() {
        return impressaomiolo;
    }

    public void setImpressaomiolo(ImpressaoMiolo impressaomiolo) {
        this.impressaomiolo = impressaomiolo;
    }

    public Insercoes getInsercoes() {
        return insercoes;
    }

    public void setInsercoes(Insercoes insercoes) {
        this.insercoes = insercoes;
    }

    public Cadernos getCadernos() {
        return cadernos;
    }

    public void setCadernos(Cadernos cadernos) {
        this.cadernos = cadernos;
    }

    public CapaDura getCapadura() {
        return capadura;
    }

    public void setCapadura(CapaDura capadura) {
        this.capadura = capadura;
    }

    public Blocos getBlocos() {
        return blocos;
    }

    public void setBlocos(Blocos blocos) {
        this.blocos = blocos;
    }

    public Miolo getMiolo() {
        return miolo;
    }

    public void setMiolo(Miolo miolo) {
        this.miolo = miolo;
    }

    public OsProducao() {
    }

    public OsProducao(Long cdOsProducao) {
        this.cdOsProducao = cdOsProducao;
    }

    public OsProducao(Long cdOsProducao, String dsCliente, int nuQuantidade, String dsResponsavel, String dsGrafResponsavel, Date created) {
        this.cdOsProducao = cdOsProducao;
        this.dsCliente = dsCliente;
        this.nuQuantidade = nuQuantidade;
        this.dsResponsavel = dsResponsavel;
        this.dsGrafResponsavel = dsGrafResponsavel;
        this.created = created;
    }

    public Long getCdOsProducao() {
        return cdOsProducao;
    }

    public void setCdOsProducao(Long cdOsProducao) {
        this.cdOsProducao = cdOsProducao;
    }

    public String getDsCliente() {
        return dsCliente;
    }

    public void setDsCliente(String dsCliente) {
        this.dsCliente = dsCliente;
    }

    public int getNuQuantidade() {
        return nuQuantidade;
    }

    public void setNuQuantidade(int nuQuantidade) {
        this.nuQuantidade = nuQuantidade;
    }

    public Character getFgPercalux() {
        return fgPercalux;
    }

    public void setFgPercalux(Character fgPercalux) {
        this.fgPercalux = fgPercalux;
    }

    public String getDsCorPercalux() {
        return dsCorPercalux;
    }

    public void setDsCorPercalux(String dsCorPercalux) {
        this.dsCorPercalux = dsCorPercalux;
    }

    public String getDsGrvPercalux() {
        return dsGrvPercalux;
    }

    public void setDsGrvPercalux(String dsGrvPercalux) {
        this.dsGrvPercalux = dsGrvPercalux;
    }

    public Integer getQtIpLaminas() {
        return qtIpLaminas;
    }

    public void setQtIpLaminas(Integer qtIpLaminas) {
        this.qtIpLaminas = qtIpLaminas;
    }

    public String getDsIpCores() {
        return dsIpCores;
    }

    public void setDsIpCores(String dsIpCores) {
        this.dsIpCores = dsIpCores;
    }

    public String getDsOutInformacoes() {
        return dsOutInformacoes;
    }

    public void setDsOutInformacoes(String dsOutInformacoes) {
        this.dsOutInformacoes = dsOutInformacoes;
    }

    public String getDsResponsavel() {
        return dsResponsavel;
    }

    public void setDsResponsavel(String dsResponsavel) {
        this.dsResponsavel = dsResponsavel;
    }

    public String getDsGrafResponsavel() {
        return dsGrafResponsavel;
    }

    public void setDsGrafResponsavel(String dsGrafResponsavel) {
        this.dsGrafResponsavel = dsGrafResponsavel;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdOsProducao != null ? cdOsProducao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof OsProducao)) {
            return false;
        }
        OsProducao other = (OsProducao) object;
        if ((this.cdOsProducao == null && other.cdOsProducao != null) || (this.cdOsProducao != null && !this.cdOsProducao.equals(other.cdOsProducao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.idit.persistece.entity.MzOsProducao[ cdOsProducao=" + cdOsProducao + " ]";
    }
    
}
