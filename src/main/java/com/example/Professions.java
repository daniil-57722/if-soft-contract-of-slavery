package com.example;


import javax.persistence.*;
import java.util.Objects;

@Entity
public class Professions {
    private int idProfession;
    private String nameProfession;
    private int idSubject;
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_profession", nullable = false)
    public int getIdProfession() {
        return idProfession;
    }

    public void setIdProfession(int idProfession) {
        this.idProfession = idProfession;
    }

    @Basic
    @Column(name = "name_profession", nullable = false, length = 64)
    public String getNameProfession() {
        return nameProfession;
    }

    public void setNameProfession(String nameProfession) {
        this.nameProfession = nameProfession;
    }

    @Basic
    @Column(name = "id_subject", nullable = false)
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professions that = (Professions) o;
        return idProfession == that.idProfession && idSubject == that.idSubject && Objects.equals(nameProfession, that.nameProfession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProfession, nameProfession, idSubject);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
