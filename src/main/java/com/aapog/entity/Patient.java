package com.aapog.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "patient")
@NamedQueries(
    {
     @NamedQuery(name = "findAllPatient",
                 query = " select p " +
                         " from Patient p "),
    @NamedQuery(name = "getPatientById",
                query = " select p " +
                        " from Patient p " +
                        " where p.idPatient = :idPatient ")
    }
)
public class Patient implements Serializable {

    private Integer idPatient;
    private Integer idDentist;
    private String professionJob;
    private String companyName;
    private String title;
    private String lastName;
    private String firstName;
    private String email;
    private String address;
    private String postalCode;
    private String city;
    private Date dateBirth;
    private String placeBirth;
    private String language;
    private String nationality;
    private String personalPhone;
    private String officePhone;
    private String fax;
    private String fiscalCode;
    private Integer idProfilePhoto;
    private Integer type;
    private String gender;
    private Date lastVisitDate;
    private Date nextVisitDate;
    private Date firstVisitDate;
    private Date lastPredictionDate;
    private String note;
    private BigDecimal discount;
    private String insurance;
    private String familyDoctor;
    private String familyDoctorPhone;
    private String adultTeen;
    private Date creationDate;
    private Integer idFamily;
    private String note1;
    private String note2;
    private String note3;
    private String note4;
    private String note5;
    private String note6;
    private String note7;
    private String note8;
    private Date lastUpdateUser;
    private String userUpdate;

    public Patient() {
    }

    public Patient(Integer idPatient, Integer idDentist, String professionJob, String companyName, String title, String lastName, String firstName, String email, String address, String postalCode, String city, Date dateBirth, String placeBirth, String language, String nationality, String personalPhone, String officePhone, String fax, String fiscalCode, Integer idProfilePhoto, Integer type, String gender, Date lastVisitDate, Date nextVisitDate, Date firstVisitDate, Date lastPredictionDate, String note, BigDecimal discount, String insurance, String familyDoctor, String familyDoctorPhone, String adultTeen, Date creationDate, Integer idFamily, String note1, String note2, String note3, String note4, String note5, String note6, String note7, String note8, Date lastUpdateUser, String userUpdate) {
        this.idPatient = idPatient;
        this.idDentist = idDentist;
        this.professionJob = professionJob;
        this.companyName = companyName;
        this.title = title;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.dateBirth = dateBirth;
        this.placeBirth = placeBirth;
        this.language = language;
        this.nationality = nationality;
        this.personalPhone = personalPhone;
        this.officePhone = officePhone;
        this.fax = fax;
        this.fiscalCode = fiscalCode;
        this.idProfilePhoto = idProfilePhoto;
        this.type = type;
        this.gender = gender;
        this.lastVisitDate = lastVisitDate;
        this.nextVisitDate = nextVisitDate;
        this.firstVisitDate = firstVisitDate;
        this.lastPredictionDate = lastPredictionDate;
        this.note = note;
        this.discount = discount;
        this.insurance = insurance;
        this.familyDoctor = familyDoctor;
        this.familyDoctorPhone = familyDoctorPhone;
        this.adultTeen = adultTeen;
        this.creationDate = creationDate;
        this.idFamily = idFamily;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.note4 = note4;
        this.note5 = note5;
        this.note6 = note6;
        this.note7 = note7;
        this.note8 = note8;
        this.lastUpdateUser = lastUpdateUser;
        this.userUpdate = userUpdate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_patient")
    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    @Column(name = "id_dentist")
    public Integer getIdDentist() {
        return idDentist;
    }

    public void setIdDentist(Integer idDentist) {
        this.idDentist = idDentist;
    }

    @Column(name = "profession_job")
    public String getProfessionJob() {
        return professionJob;
    }

    public void setProfessionJob(String professionJob) {
        this.professionJob = professionJob;
    }

    @Column(name = "company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "date_birth")
    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Column(name = "place_birth")
    public String getPlaceBirth() {
        return placeBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }

    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Column(name = "nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Column(name = "personal_phone")
    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    @Column(name = "office_phone")
    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Column(name = "fiscal_code")
    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    @Column(name = "id_profile_photo")
    public Integer getIdProfilePhoto() {
        return idProfilePhoto;
    }

    public void setIdProfilePhoto(Integer idProfilePhoto) {
        this.idProfilePhoto = idProfilePhoto;
    }

    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "last_visit_date")
    public Date getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    @Column(name = "next_visit_date")
    public Date getNextVisitDate() {
        return nextVisitDate;
    }

    public void setNextVisitDate(Date nextVisitDate) {
        this.nextVisitDate = nextVisitDate;
    }

    @Column(name = "first_visit_date")
    public Date getFirstVisitDate() {
        return firstVisitDate;
    }

    public void setFirstVisitDate(Date firstVisitDate) {
        this.firstVisitDate = firstVisitDate;
    }

    @Column(name = "last_prediction_date")
    public Date getLastPredictionDate() {
        return lastPredictionDate;
    }

    public void setLastPredictionDate(Date lastPredictionDate) {
        this.lastPredictionDate = lastPredictionDate;
    }

    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Column(name = "discount")
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Column(name = "insurance")
    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    @Column(name = "family_doctor")
    public String getFamilyDoctor() {
        return familyDoctor;
    }

    public void setFamilyDoctor(String familyDoctor) {
        this.familyDoctor = familyDoctor;
    }

    @Column(name = "family_doctor_phone")
    public String getFamilyDoctorPhone() {
        return familyDoctorPhone;
    }

    public void setFamilyDoctorPhone(String familyDoctorPhone) {
        this.familyDoctorPhone = familyDoctorPhone;
    }

    @Column(name = "adult_teen")
    public String getAdultTeen() {
        return adultTeen;
    }

    public void setAdultTeen(String adultTeen) {
        this.adultTeen = adultTeen;
    }

    @Column(name = "creation_date")
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Column(name = "id_family")
    public Integer getIdFamily() {
        return idFamily;
    }

    public void setIdFamily(Integer idFamily) {
        this.idFamily = idFamily;
    }

    @Column(name = "note1")
    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    @Column(name = "note2")
    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    @Column(name = "note3")
    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    @Column(name = "note4")
    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    @Column(name = "note5")
    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }

    @Column(name = "note6")
    public String getNote6() {
        return note6;
    }

    public void setNote6(String note6) {
        this.note6 = note6;
    }

    @Column(name = "note7")
    public String getNote7() {
        return note7;
    }

    public void setNote7(String note7) {
        this.note7 = note7;
    }

    @Column(name = "note8")
    public String getNote8() {
        return note8;
    }

    public void setNote8(String note8) {
        this.note8 = note8;
    }

    @Column(name = "last_update_date")
    public Date getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(Date lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    @Column(name = "user_update")
    public String getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(String userUpdate) {
        this.userUpdate = userUpdate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (idPatient != null ? !idPatient.equals(patient.idPatient) : patient.idPatient != null) return false;
        if (idDentist != null ? !idDentist.equals(patient.idDentist) : patient.idDentist != null) return false;
        if (professionJob != null ? !professionJob.equals(patient.professionJob) : patient.professionJob != null)
            return false;
        if (companyName != null ? !companyName.equals(patient.companyName) : patient.companyName != null) return false;
        if (title != null ? !title.equals(patient.title) : patient.title != null) return false;
        if (lastName != null ? !lastName.equals(patient.lastName) : patient.lastName != null) return false;
        if (firstName != null ? !firstName.equals(patient.firstName) : patient.firstName != null) return false;
        if (email != null ? !email.equals(patient.email) : patient.email != null) return false;
        if (address != null ? !address.equals(patient.address) : patient.address != null) return false;
        if (postalCode != null ? !postalCode.equals(patient.postalCode) : patient.postalCode != null) return false;
        if (city != null ? !city.equals(patient.city) : patient.city != null) return false;
        if (dateBirth != null ? !dateBirth.equals(patient.dateBirth) : patient.dateBirth != null) return false;
        if (placeBirth != null ? !placeBirth.equals(patient.placeBirth) : patient.placeBirth != null) return false;
        if (language != null ? !language.equals(patient.language) : patient.language != null) return false;
        if (nationality != null ? !nationality.equals(patient.nationality) : patient.nationality != null) return false;
        if (personalPhone != null ? !personalPhone.equals(patient.personalPhone) : patient.personalPhone != null)
            return false;
        if (officePhone != null ? !officePhone.equals(patient.officePhone) : patient.officePhone != null) return false;
        if (fax != null ? !fax.equals(patient.fax) : patient.fax != null) return false;
        if (fiscalCode != null ? !fiscalCode.equals(patient.fiscalCode) : patient.fiscalCode != null) return false;
        if (idProfilePhoto != null ? !idProfilePhoto.equals(patient.idProfilePhoto) : patient.idProfilePhoto != null)
            return false;
        if (type != null ? !type.equals(patient.type) : patient.type != null) return false;
        if (gender != null ? !gender.equals(patient.gender) : patient.gender != null) return false;
        if (lastVisitDate != null ? !lastVisitDate.equals(patient.lastVisitDate) : patient.lastVisitDate != null)
            return false;
        if (nextVisitDate != null ? !nextVisitDate.equals(patient.nextVisitDate) : patient.nextVisitDate != null)
            return false;
        if (firstVisitDate != null ? !firstVisitDate.equals(patient.firstVisitDate) : patient.firstVisitDate != null)
            return false;
        if (lastPredictionDate != null ? !lastPredictionDate.equals(patient.lastPredictionDate) : patient.lastPredictionDate != null)
            return false;
        if (note != null ? !note.equals(patient.note) : patient.note != null) return false;
        if (discount != null ? !discount.equals(patient.discount) : patient.discount != null) return false;
        if (insurance != null ? !insurance.equals(patient.insurance) : patient.insurance != null) return false;
        if (familyDoctor != null ? !familyDoctor.equals(patient.familyDoctor) : patient.familyDoctor != null)
            return false;
        if (familyDoctorPhone != null ? !familyDoctorPhone.equals(patient.familyDoctorPhone) : patient.familyDoctorPhone != null)
            return false;
        if (adultTeen != null ? !adultTeen.equals(patient.adultTeen) : patient.adultTeen != null) return false;
        if (creationDate != null ? !creationDate.equals(patient.creationDate) : patient.creationDate != null)
            return false;
        if (idFamily != null ? !idFamily.equals(patient.idFamily) : patient.idFamily != null) return false;
        if (note1 != null ? !note1.equals(patient.note1) : patient.note1 != null) return false;
        if (note2 != null ? !note2.equals(patient.note2) : patient.note2 != null) return false;
        if (note3 != null ? !note3.equals(patient.note3) : patient.note3 != null) return false;
        if (note4 != null ? !note4.equals(patient.note4) : patient.note4 != null) return false;
        if (note5 != null ? !note5.equals(patient.note5) : patient.note5 != null) return false;
        if (note6 != null ? !note6.equals(patient.note6) : patient.note6 != null) return false;
        if (note7 != null ? !note7.equals(patient.note7) : patient.note7 != null) return false;
        if (note8 != null ? !note8.equals(patient.note8) : patient.note8 != null) return false;
        if (lastUpdateUser != null ? !lastUpdateUser.equals(patient.lastUpdateUser) : patient.lastUpdateUser != null)
            return false;
        if (userUpdate != null ? !userUpdate.equals(patient.userUpdate) : patient.userUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPatient != null ? idPatient.hashCode() : 0;
        result = 31 * result + (idDentist != null ? idDentist.hashCode() : 0);
        result = 31 * result + (professionJob != null ? professionJob.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (dateBirth != null ? dateBirth.hashCode() : 0);
        result = 31 * result + (placeBirth != null ? placeBirth.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (personalPhone != null ? personalPhone.hashCode() : 0);
        result = 31 * result + (officePhone != null ? officePhone.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (fiscalCode != null ? fiscalCode.hashCode() : 0);
        result = 31 * result + (idProfilePhoto != null ? idProfilePhoto.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (lastVisitDate != null ? lastVisitDate.hashCode() : 0);
        result = 31 * result + (nextVisitDate != null ? nextVisitDate.hashCode() : 0);
        result = 31 * result + (firstVisitDate != null ? firstVisitDate.hashCode() : 0);
        result = 31 * result + (lastPredictionDate != null ? lastPredictionDate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (insurance != null ? insurance.hashCode() : 0);
        result = 31 * result + (familyDoctor != null ? familyDoctor.hashCode() : 0);
        result = 31 * result + (familyDoctorPhone != null ? familyDoctorPhone.hashCode() : 0);
        result = 31 * result + (adultTeen != null ? adultTeen.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (idFamily != null ? idFamily.hashCode() : 0);
        result = 31 * result + (note1 != null ? note1.hashCode() : 0);
        result = 31 * result + (note2 != null ? note2.hashCode() : 0);
        result = 31 * result + (note3 != null ? note3.hashCode() : 0);
        result = 31 * result + (note4 != null ? note4.hashCode() : 0);
        result = 31 * result + (note5 != null ? note5.hashCode() : 0);
        result = 31 * result + (note6 != null ? note6.hashCode() : 0);
        result = 31 * result + (note7 != null ? note7.hashCode() : 0);
        result = 31 * result + (note8 != null ? note8.hashCode() : 0);
        result = 31 * result + (lastUpdateUser != null ? lastUpdateUser.hashCode() : 0);
        result = 31 * result + (userUpdate != null ? userUpdate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "idPatient=" + idPatient +
                ", idDentist=" + idDentist +
                ", professionJob='" + professionJob + '\'' +
                ", companyName='" + companyName + '\'' +
                ", title='" + title + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", dateBirth=" + dateBirth +
                ", placeBirth='" + placeBirth + '\'' +
                ", language='" + language + '\'' +
                ", nationality='" + nationality + '\'' +
                ", personalPhone='" + personalPhone + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", fax='" + fax + '\'' +
                ", fiscalCode='" + fiscalCode + '\'' +
                ", idProfilePhoto=" + idProfilePhoto +
                ", type=" + type +
                ", gender='" + gender + '\'' +
                ", lastVisitDate=" + lastVisitDate +
                ", nextVisitDate=" + nextVisitDate +
                ", firstVisitDate=" + firstVisitDate +
                ", lastPredictionDate=" + lastPredictionDate +
                ", note='" + note + '\'' +
                ", discount=" + discount +
                ", insurance='" + insurance + '\'' +
                ", familyDoctor='" + familyDoctor + '\'' +
                ", familyDoctorPhone='" + familyDoctorPhone + '\'' +
                ", adultTeen='" + adultTeen + '\'' +
                ", creationDate=" + creationDate +
                ", idFamily=" + idFamily +
                ", note1='" + note1 + '\'' +
                ", note2='" + note2 + '\'' +
                ", note3='" + note3 + '\'' +
                ", note4='" + note4 + '\'' +
                ", note5='" + note5 + '\'' +
                ", note6='" + note6 + '\'' +
                ", note7='" + note7 + '\'' +
                ", note8='" + note8 + '\'' +
                ", lastUpdateUser=" + lastUpdateUser +
                ", userUpdate='" + userUpdate + '\'' +
                '}';
    }
}
