package com.example;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Organization {
    private int idOrganization;
    private String fullName;
    private String shortName;
    private String inn;
    private String legalAddress;
    private String actualAddress;
    private String director;
    private String number;
    private String email;
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_organization", nullable = false)
    public int getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(int idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Basic
    @Column(name = "full_name", nullable = false, length = 200)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "short_name", nullable = false, length = 50)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "INN", nullable = false, length = 20)
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "legal_address", nullable = false, length = 200)
    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    @Basic
    @Column(name = "actual_address", nullable = false, length = 200)
    public String getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(String actualAddress) {
        this.actualAddress = actualAddress;
    }

    @Basic
    @Column(name = "director", nullable = false, length = 25)
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Basic
    @Column(name = "number", nullable = false, length = 20)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return idOrganization == that.idOrganization && Objects.equals(fullName, that.fullName) && Objects.equals(shortName, that.shortName) && Objects.equals(inn, that.inn) && Objects.equals(legalAddress, that.legalAddress) && Objects.equals(actualAddress, that.actualAddress) && Objects.equals(director, that.director) && Objects.equals(number, that.number) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrganization, fullName, shortName, inn, legalAddress, actualAddress, director, number, email);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
