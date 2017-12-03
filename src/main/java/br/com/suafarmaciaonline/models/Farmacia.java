package br.com.suafarmaciaonline.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author john
 */

@Entity
public class Farmacia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String inscEstadual;
    private boolean pagCartao;
    private boolean pagBoleto;
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public boolean isPagCartao() {
        return pagCartao;
    }

    public void setPagCartao(boolean pagCartao) {
        this.pagCartao = pagCartao;
    }

    public boolean isPagBoleto() {
        return pagBoleto;
    }

    public void setPagBoleto(boolean pagBoleto) {
        this.pagBoleto = pagBoleto;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Farmacia)) {
            return false;
        }
        Farmacia other = (Farmacia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.suafarmaciaonline.models.Farmacia[ id=" + id + " ]";
    }
    
}
