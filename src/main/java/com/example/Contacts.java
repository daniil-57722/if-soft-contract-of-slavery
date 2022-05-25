package com.example;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Contacts {
    private int idContacts;
    private int idEmployee;
    private int idContact;
    private String contact;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_contacts", nullable = false)
    public int getIdContacts() {
        return idContacts;
    }

    public void setIdContacts(int idContacts) {
        this.idContacts = idContacts;
    }

    @Basic
    @Column(name = "id_employee", nullable = false)
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Basic
    @Column(name = "id_contact", nullable = false)
    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    @Basic
    @Column(name = "contact", nullable = false, length = 20)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return idContacts == contacts.idContacts && idEmployee == contacts.idEmployee && idContact == contacts.idContact && Objects.equals(contact, contacts.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContacts, idEmployee, idContact, contact);
    }
}
