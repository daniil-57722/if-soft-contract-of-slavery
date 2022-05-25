package com.example;


import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Person {
    private int idEmployee;
    private String fullName;
    private int male;
    private Date birthDate;
    private String birthPlase;
    private String residenceAddress;
    private String registrationAddress;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_employee", nullable = false)
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Basic
    @Column(name = "full_name", nullable = false, length = 128)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "male", nullable = false)
    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    @Basic
    @Column(name = "birth_date", nullable = false)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "birth_plase", nullable = false, length = 140)
    public String getBirthPlase() {
        return birthPlase;
    }

    public void setBirthPlase(String birthPlase) {
        this.birthPlase = birthPlase;
    }

    @Basic
    @Column(name = "residence_address", nullable = false, length = 140)
    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    @Basic
    @Column(name = "registration_address", nullable = false, length = 140)
    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return idEmployee == person.idEmployee && male == person.male && Objects.equals(fullName, person.fullName) && Objects.equals(birthDate, person.birthDate) && Objects.equals(birthPlase, person.birthPlase) && Objects.equals(residenceAddress, person.residenceAddress) && Objects.equals(registrationAddress, person.registrationAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmployee, fullName, male, birthDate, birthPlase, residenceAddress, registrationAddress);
    }

    @Override
    public String toString(){

        return fullName;
    }
}
