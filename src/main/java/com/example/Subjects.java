package com.example;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Subjects {
    private int idSubject;
    private String nameSubject;
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_subject", nullable = false)
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic
    @Column(name = "name_subject", nullable = false, length = 45)
    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subjects subjects = (Subjects) o;
        return idSubject == subjects.idSubject && Objects.equals(nameSubject, subjects.nameSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubject, nameSubject);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
