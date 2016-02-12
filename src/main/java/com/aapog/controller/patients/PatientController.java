package com.aapog.controller.patients;

import com.aapog.broker.IDomainsBroker;
import com.aapog.broker.IPatientBroker;
import com.aapog.entity.Domains;
import com.aapog.entity.Patient;
import com.aapog.entity.Product;
import com.aapog.events.style.SelectedSideBarMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PatientController {

    private static final String patientMapping = "/patient/";
    private static final String patient = "patient/";

    private IPatientBroker patientBroker;
    private IDomainsBroker domainsBroker;

    @Autowired
    public void setPatientBorker(IPatientBroker patientBroker) {
        this.patientBroker = patientBroker;
    }

    @Autowired
    public void setDomainsBroker(IDomainsBroker domainsBroker) {
        this.domainsBroker = domainsBroker;
    }

    @RequestMapping(value = patientMapping + "/patientsList", method = RequestMethod.GET)
    public String productslist(Model model) {

        SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Patients", "ViewPatients", null, null, null);
        model.addAttribute("patientPanel", eventSelected);

        model.addAttribute("patients", patientBroker.findAllPatient() );
        return patient + "patientsList";
    }

    @RequestMapping(value = patientMapping + "newPatient")
    @Transactional
    public String newProduct(Model model) {

        SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Patients", "CreatePatient", null, null, null);
        model.addAttribute("patientPanel", eventSelected);

        model.addAttribute("patient", new Patient());

        List<Domains> citiesList = domainsBroker.findAllDomainsType("patient.cities.list");

        model.addAttribute("cities", citiesList);

        return patient + "newPatient";
    }

    @RequestMapping(value = "patient", method = RequestMethod.POST)
    @Transactional
    public String savePatient(Patient patient, Model model) {

        SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Patients", "ViewPatients", null, null, null);
        model.addAttribute("patientPanel", eventSelected);

        patientBroker.savePatient(patient);

        return "redirect:" + patientMapping + "patientsList";
    }

    @RequestMapping("patient/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {

        SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Products", "EditDeleteProduct", null, null, null);
        model.addAttribute("patientPanel", eventSelected);

        model.addAttribute("product", patientBroker.getPatientById(new Integer(id)) );
        return "newPatient";
    }

    @RequestMapping("patient/delete/{id}")
    @Transactional
    public String delete(@PathVariable Long id, Model model) {

        SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Products", "EditDeleteProduct", null, null, null);
        model.addAttribute("patientPanel", eventSelected);

        patientBroker.deletePatientById(new Integer(id.intValue()) );
        return "redirect:/patientsList";
    }

    @RequestMapping("patient/{id}")
    public String showProduct(@PathVariable Long id, Model model) {
        model.addAttribute("product", patientBroker.getPatientById(new Integer(id.intValue()) ) );
        return "productshow";
    }


}
