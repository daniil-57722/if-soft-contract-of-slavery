package com.example;


import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Documents {
    private int idDocument;
    private int idEmployee;
    private int idDocumentType;
    private String number;
    private String issuePlace;
    private Date docDate;
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_document", nullable = false)
    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
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
    @Column(name = "id_document_type", nullable = false)
    public int getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(int idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    @Basic
    @Column(name = "number", nullable = false, length = 32)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "issue_place", nullable = false, length = 128)
    public String getIssuePlace() {
        return issuePlace;
    }

    public void setIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
    }

    @Basic
    @Column(name = "doc_date", nullable = false)
    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documents documents = (Documents) o;
        return idDocument == documents.idDocument && idEmployee == documents.idEmployee && idDocumentType == documents.idDocumentType && Objects.equals(number, documents.number) && Objects.equals(issuePlace, documents.issuePlace) && Objects.equals(docDate, documents.docDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocument, idEmployee, idDocumentType, number, issuePlace, docDate);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
}
