package com.aapog.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "domains")
@NamedQueries(
        {
                @NamedQuery(name = "findAllOfCode",
                        query = " select d " +
                                " from Domains d " +
                                " where d.codeDomains = :codeDomains" +
                                " order by d.desc ")
        }
)
public class Domains implements Serializable {

    private Integer idDomain;
    private String codeDomains;
    private String value;
    private String desc;
    private Date createDate;

    public Domains() {
    }

    public Domains(String codeDomains, String value, String desc, Date createDate) {
        this.codeDomains = codeDomains;
        this.value = value;
        this.desc = desc;
        this.createDate = createDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_domain")
    public Integer getIdDomain() {
        return idDomain;
    }

    public void setIdDomain(Integer idDomain) {
        this.idDomain = idDomain;
    }

    @Column(name = "code_domains")
    public String getCodeDomains() {
        return codeDomains;
    }

    public void setCodeDomains(String codeDomains) {
        this.codeDomains = codeDomains;
    }

    @Column(name = "value_dom")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column(name = "description")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Domains domains = (Domains) o;

        if (idDomain != null ? !idDomain.equals(domains.idDomain) : domains.idDomain != null) return false;
        if (codeDomains != null ? !codeDomains.equals(domains.codeDomains) : domains.codeDomains != null) return false;
        if (value != null ? !value.equals(domains.value) : domains.value != null) return false;
        if (desc != null ? !desc.equals(domains.desc) : domains.desc != null) return false;
        if (createDate != null ? !createDate.equals(domains.createDate) : domains.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDomain != null ? idDomain.hashCode() : 0;
        result = 31 * result + (codeDomains != null ? codeDomains.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Domains{" +
                "idDomain=" + idDomain +
                ", codeDomains='" + codeDomains + '\'' +
                ", value='" + value + '\'' +
                ", desc='" + desc + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
