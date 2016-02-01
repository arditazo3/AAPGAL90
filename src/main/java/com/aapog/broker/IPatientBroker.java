package com.aapog.broker;

import com.aapog.entity.Patient;

import java.util.List;

public interface IPatientBroker {

    public List<Patient> findAllPatient();

    public void savePatient(Patient patient);

    public Patient getPatientById(Integer idPatient);

    public void deletePatientById(Integer id);

}
