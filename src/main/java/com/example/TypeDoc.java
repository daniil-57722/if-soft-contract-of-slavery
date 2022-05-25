package com.example;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "type_doc", schema = "practice", catalog = "")
public class TypeDoc {
    private int idDocumentType;
    private String documentName;
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_document_type", nullable = false)
    public int getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(int idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    @Basic
    @Column(name = "document_name", nullable = false, length = 45)
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeDoc typeDoc = (TypeDoc) o;
        return idDocumentType == typeDoc.idDocumentType && Objects.equals(documentName, typeDoc.documentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocumentType, documentName);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
