package com.aapog.broker;

import com.aapog.entity.Domains;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DomainsBroker implements IDomainsBroker {

    @PersistenceContext()
    private EntityManager em;

    @Override
    public List<Domains> findAllDomainsType(String codeDomains) {

        List<Domains> listDomains = em.createNamedQuery("findAllOfCode")
                .setParameter("codeDomains", codeDomains)
                .getResultList();

        return listDomains;
    }
}
