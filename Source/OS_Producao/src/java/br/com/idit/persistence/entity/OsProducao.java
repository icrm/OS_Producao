package br.com.idit.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
    private String fgPercalux;
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
    @Column(name = "DS_OUT_CADERNOS")
    private String dsOutCadernos;
    @Column(name = "DS_OUT_BLOCOS")
    private String dsOutBlocos;
    @Column(name = "DS_OUT_ACABAMENTOS")
    private String dsOutAcabamentos;
    @Column(name = "DS_OUT_MIOLOS")
    private String dsOutMiolos;
    @Column(name = "DS_OUT_IMPRESSAO_MIOLO")
    private String dsOutImpressaoMiolo;
    @Column(name = "DS_OUT_PAPEIS")
    private String dsOutPapeis;
    @Column(name = "DS_OUT_INSERCOES")
    private String dsOutInsercoes;
    @Column(name = "DS_RESPONSAVEL")
    private String dsResponsavel;
    @Column(name = "DS_GRAF_RESPONSAVEL")
    private String dsGrafResponsavel;
    @Column(name = "CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @ManyToMany(targetEntity = Papel.class)
    @JoinTable(name = "mz_os_producao_papel", joinColumns = {
        @JoinColumn(name = "CD_OS_PRODUCAO")}, inverseJoinColumns = {
        @JoinColumn(name = "CD_PAPEL")})
    private List<Papel> papel;
    @ManyToMany(targetEntity = Miolo.class)
    @JoinTable(name = "mz_os_producao_miolo", joinColumns = {
        @JoinColumn(name = "CD_OS_PRODUCAO")}, inverseJoinColumns = {
        @JoinColumn(name = "CD_MIOLO")})
    private List<Miolo> miolo;
    @ManyToMany(targetEntity = Blocos.class)
    @JoinTable(name = "mz_os_producao_blocos", joinColumns = {
        @JoinColumn(name = "CD_OS_PRODUCAO")}, inverseJoinColumns = {
        @JoinColumn(name = "CD_BLOCOS")})
    private List<Blocos> blocos;
    @ManyToMany(targetEntity = CapaDura.class)
    @JoinTable(name = "mz_os_producao_capa_dura", joinColumns = {
        @JoinColumn(name = "CD_OS_PRODUCAO")}, inverseJoinColumns = {
        @JoinColumn(name = "CD_CAPA_DURA")})
    private List<CapaDura> capadura;
    @ManyToMany(targetEntity = Cadernos.class)
    @JoinTable(name = "mz_os_producao_cadernos", joinColumns = {
        @JoinColumn(name = "CD_OS_PRODUCAO")}, inverseJoinColumns = {
        @JoinColumn(name = "CD_CADERNOS")})
    private List<Cadernos> cadernos;
    @ManyToMany(targetEntity = Insercoes.class)
    @JoinTable(name = "mz_os_producao_insercoes", joinColumns = {
        @JoinColumn(name = "CD_OS_PRODUCAO")}, inverseJoinColumns = {
        @JoinColumn(name = "CD_INSERCOES")})
    private List<Insercoes> insercoes;
    @ManyToMany(targetEntity = ImpressaoMiolo.class)
    @JoinTable(name = "mz_os_producao_impressao_miolo", joinColumns = {
        @JoinColumn(name = "CD_OS_PRODUCAO")}, inverseJoinColumns = {
        @JoinColumn(name = "CD_IMPRESSAO_MIOLO")})
    private List<ImpressaoMiolo> impressaomiolo;
    @ManyToMany(targetEntity = Acabamentos.class)
    @JoinTable(name = "mz_os_producao_acabamentos", joinColumns = {
        @JoinColumn(name = "CD_OS_PRODUCAO")}, inverseJoinColumns = {
        @JoinColumn(name = "CD_ACABAMENTOS")})
    private List<Acabamentos> acabamentos;

    public List<Acabamentos> getAcabamentos() {
        return acabamentos;
    }

    public void setAcabamentos(List<Acabamentos> acabamentos) {
        this.acabamentos = acabamentos;
    }

    public List<Blocos> getBlocos() {
        return blocos;
    }

    public void setBlocos(List<Blocos> blocos) {
        this.blocos = blocos;
    }

    public List<Cadernos> getCadernos() {
        return cadernos;
    }

    public void setCadernos(List<Cadernos> cadernos) {
        this.cadernos = cadernos;
    }

    public List<CapaDura> getCapadura() {
        return capadura;
    }

    public void setCapadura(List<CapaDura> capadura) {
        this.capadura = capadura;
    }

    public List<ImpressaoMiolo> getImpressaomiolo() {
        return impressaomiolo;
    }

    public void setImpressaomiolo(List<ImpressaoMiolo> impressaomiolo) {
        this.impressaomiolo = impressaomiolo;
    }

    public List<Insercoes> getInsercoes() {
        return insercoes;
    }

    public void setInsercoes(List<Insercoes> insercoes) {
        this.insercoes = insercoes;
    }

    public List<Miolo> getMiolo() {
        return miolo;
    }

    public void setMiolo(List<Miolo> miolo) {
        this.miolo = miolo;
    }

    public List<Papel> getPapel() {
        return papel;
    }

    public void setPapel(List<Papel> papel) {
        this.papel = papel;
    }

    public String getDsOutAcabamentos() {
        return dsOutAcabamentos;
    }

    public void setDsOutAcabamentos(String dsOutAcabamentos) {
        this.dsOutAcabamentos = dsOutAcabamentos;
    }

    public String getDsOutBlocos() {
        return dsOutBlocos;
    }

    public void setDsOutBlocos(String dsOutBlocos) {
        this.dsOutBlocos = dsOutBlocos;
    }

    public String getDsOutCadernos() {
        return dsOutCadernos;
    }

    public void setDsOutCadernos(String dsOutCadernos) {
        this.dsOutCadernos = dsOutCadernos;
    }

    public String getDsOutImpressaoMiolo() {
        return dsOutImpressaoMiolo;
    }

    public void setDsOutImpressaoMiolo(String dsOutImpressaoMiolo) {
        this.dsOutImpressaoMiolo = dsOutImpressaoMiolo;
    }

    public String getDsOutInsercoes() {
        return dsOutInsercoes;
    }

    public void setDsOutInsercoes(String dsOutInsercoes) {
        this.dsOutInsercoes = dsOutInsercoes;
    }

    public String getDsOutMiolos() {
        return dsOutMiolos;
    }

    public void setDsOutMiolos(String dsOutMiolos) {
        this.dsOutMiolos = dsOutMiolos;
    }

    public String getDsOutPapeis() {
        return dsOutPapeis;
    }

    public void setDsOutPapeis(String dsOutPapeis) {
        this.dsOutPapeis = dsOutPapeis;
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

    public String getFgPercalux() {
        return fgPercalux;
    }

    public void setFgPercalux(String fgPercalux) {
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
