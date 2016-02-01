package com.aapog.broker;

import com.aapog.entity.Patient;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PatientBroker implements IPatientBroker {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Patient> findAllPatient() {

        List<Patient> listPatient = em.createNamedQuery("findAllPatient")
                                       .getResultList();

        return listPatient;
    }

    @Override
    public void savePatient(Patient patient) {

        em.merge(patient);
    }

    @Override
    public Patient getPatientById(Integer idPatient) {

        Patient patient = (Patient) em.createNamedQuery("getPatientById")
                            .getSingleResult();

        return patient;
    }

    @Override
    public void deletePatientById(Integer id) {

        Patient patient = getPatientById(id);

        em.remove(patient);
    }
}
