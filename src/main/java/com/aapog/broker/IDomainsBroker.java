package com.aapog.broker;

import com.aapog.entity.Domains;

import java.util.List;

public interface IDomainsBroker {

    public List<Domains> findAllDomainsType(String codeDomains);

}
