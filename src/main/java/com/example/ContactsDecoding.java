package com.example;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contacts_decoding", schema = "practice", catalog = "")
public class ContactsDecoding {
    private int idContact;
    private String decoding;
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_contact", nullable = false)
    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    @Basic
    @Column(name = "decoding", nullable = false, length = 45)
    public String getDecoding() {
        return decoding;
    }

    public void setDecoding(String decoding) {
        this.decoding = decoding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactsDecoding that = (ContactsDecoding) o;
        return idContact == that.idContact && Objects.equals(decoding, that.decoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContact, decoding);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
